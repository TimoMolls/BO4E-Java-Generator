const {InputData, JSONSchemaInput, FetchingJSONSchemaStore, quicktypeMultiFile, javaOptions,
    JavaTargetLanguage,
    getOptionValues,
    JavaRenderer
} = require("quicktype-core");
const fs = require("node:fs");
const {BooleanOption, StringOption} = require("quicktype-core/dist/RendererOptions");
const {JacksonRenderer} = require("quicktype-core/dist/language/Java");
const {acronymOption, AcronymStyleOptions} = require("quicktype-core/dist/support/Acronyms");

const packageName = "com.example.";
const targetDirName = "bo4e";
const sourceDirName = "bo4e_schemas";
const currentVersion = "202401.0.0";
const newJavaOptions = {
    useList: javaOptions.useList,
    justTypes: new BooleanOption("just-types", "Plain types only", true),
    dateTimeProvider: javaOptions.dateTimeProvider,
    acronymStyle: acronymOption(AcronymStyleOptions.Original),
    packageName: new StringOption("package", "Generated package name", "NAME", "placeholder"),
    lombok: javaOptions.lombok,
    lombokCopyAnnotations: javaOptions.lombokCopyAnnotations
}

/**
 * array containing the name of the parent class and its directory
 * @type {{dir: string, className: string}[]}
 */
const baseclassForDir = [
    {className: "Geschaeftsobjekt", dir: "bo"},
    {className: "COM", dir: "com"}
]

/**
 * the language used for generation, uses custom options
 */
class NewJavaTargetLanguage extends JavaTargetLanguage {
    constructor() {
        super();
    }

    getOptions() {
        return [
            newJavaOptions.useList,
            newJavaOptions.justTypes,
            newJavaOptions.dateTimeProvider,
            newJavaOptions.acronymStyle,
            newJavaOptions.packageName,
            newJavaOptions.lombok,
            newJavaOptions.lombokCopyAnnotations
        ];
    }

    makeRenderer(renderContext, untypedOptionValues) {
        const options = getOptionValues(newJavaOptions, untypedOptionValues);
        if (options.justTypes) {
            return new JavaRenderer(this, renderContext, options);
        }
        return new JacksonRenderer(this, renderContext, options);
    }
}

/**
 * turns a file into a schema-property and adds it to the given array
 * @param allKnowingSchema {string[]} the array to add the property to
 * @param file {string} the file to add
 * @param path {string} the path to the file
 */
function addProperty(allKnowingSchema, file, path) {
    const newProperty =
            "        },\n"+
            "        \"" + file.charAt(0).toLowerCase() + file.substring(1, file.length - 5) + "\": {\n" +
            "            \"anyOf\": [\n" +
            "                {\n" +
            "                    \"$ref\": \"https://raw.githubusercontent.com/Hochfrequenz/BO4E-Schemas/v" + currentVersion + "/src/" + path + "\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"type\": \"null\"\n" +
            "                }\n" +
            "            ],\n" +
            "            \"default\": null\n";
    allKnowingSchema.push(newProperty);
    console.log("Property " + file + " added");
}

/**
 * iterates through the given directory and all subdirectories and adds all files as schema-property-elements to the given array
 * @param allKnowingSchema {string[]} the schema to add the files to
 * @param source {string} the path to the source directory
 * @param fileMap {Map<string,string>} a map to add the files with the path to their directory to, creates one if none is given
 * @returns {Map<string, string>} A map of all added files with the path to their directory
 */
function addToSchema(allKnowingSchema, source, fileMap = new Map) {
    const files = fs.readdirSync(source);
    for (const file of files) {
        const path = source + '/' + file;
        if (fs.statSync(path).isFile()) {
            addProperty(allKnowingSchema, file, path);
            const dirLocation = source.replace(sourceDirName, targetDirName);
            fileMap.set(file.substring(0, file.length - 5).toLowerCase(), dirLocation.replace("enum", "enums") + "/");
        } else {
            fileMap = addToSchema(allKnowingSchema, path, fileMap);
        }
    }
    return fileMap;
}

/**
 * creates the basic skeleton of a schema that can be used to generate all classes at once
 * @returns {string[]} an array containing the beginning and the end of the schema, leaving space to add properties
 */
function generateAllKnowingSchema() {
    return ["{\n" +
        "  \"additionalProperties\": true,\n" +
        "  \"description\": \"Alles auf einen Blick\",\n" +
        "  \"properties\": {\n" +
        "    \"stringOderNummer\": {\n" +
        "      \"anyOf\": [\n" +
        "        {\n" +
        "          \"type\": \"number\"\n" +
        "        },\n" +
        "        {\n" +
        "          \"type\": \"string\"\n" +
        "        },\n" +
        "        {\n" +
        "          \"type\": \"null\"\n" +
        "        }\n" +
        "      ],\n" +
        "      \"default\": null,\n" +
        "      \"title\": \"StringOderNummer\"\n",
        "    }\n" +
        "  },\n" +
        "  \"title\": \"AllKnowing\",\n" +
        "  \"type\": \"object\"\n" +
        "}"]
}

/**
 * retrieves the correct property name based on the generated property
 * @param property {string} the property to search for
 * @param jsonFile {string} the file containing the schema
 * @param filePath {string} the path to the directory of the file
 * @returns {string} the correct name of the property
 */
function getPropertyName(property, jsonFile, filePath) {
    const content = fs.readFileSync(filePath + jsonFile, "utf-8").replaceAll(" ", "").split("\n");
    const line = content.find(value => value.toLowerCase() === `\"${property.toLowerCase()}\":{`);
    if (line) {
        return line.substring(1, line.length - 3);
    } else {
        return property;
    }
}

/**
 * iterates through all files in the given directory and all subdirectories and restores original data structure,
 * adds parent classes, import statements and default values, removes duplicated properties
 * @param source {string} path to the directory containing schema files
 * @param target {string} path to the directory to move the generated classes to
 * @param fileMap {Map<string, string>} map of the fileNames with the path to their corresponding directory
 * @param root {string} path to the directory currently containing the generated classes
 * @param dirname {string} name of the current directory
 */
function cleanUp(source, target, fileMap, root = target, dirname = source) {
    const files = fs.readdirSync(source);
    for (const file of files) {
        const sourcePath = source + '/' + file;
        if (fs.statSync(sourcePath).isFile()) {
            let javaFile = file.replace(".json", ".java");
            if (!fs.existsSync(root + '/' + javaFile)) {
                const targetFiles = fs.readdirSync(root);
                javaFile = targetFiles.find(value => value.substring(0, value.length - 5).toLowerCase() === file.substring(0, file.length - 5).toLowerCase());
            }
            const fileName = javaFile.replace(".java", "");
            // restore directory structure
            fs.renameSync(root + '/' + javaFile, target + '/' + javaFile);
            let newFile = fs.readFileSync(target + '/' + javaFile, "utf-8");
            // change package to fit directory structure
            newFile = newFile.replace("package placeholder",`package ${packageName}${target.replace("generatedCode/","").replaceAll("/", ".")}`);
            const lines = newFile.split("\n");
            const importLines = [];
            lines.forEach((line, index) => {
                const classAndDir = baseclassForDir.find(value => value.dir === dirname);
                if (classAndDir !== undefined && fileName !== classAndDir.className) {
                    // add parent to child and remove overwritten properties
                    if (line.startsWith("public class")) {
                        const parent = classAndDir.className;
                        const ownVersionProperty = lines.slice(index, index + 4).findIndex(value => value.includes("private String version")) === -1;
                        if (!ownVersionProperty) {
                            lines[lines.findIndex(value => value.includes("private String version"))] = "#";
                            const lineIndex = lines.findIndex(value => value.includes("getVersion"));
                            lines.splice(lineIndex, 2, "#", "#");
                            if (lines[lineIndex + 2] === "") {
                                lines[lineIndex + 2] = "#";
                            }
                        }
                        lines[index] = line.substring(0, line.length - 1) + "extends " + parent + " {";
                    } else if (line.includes("getid") || line.includes("getZusatzAttribute")) {
                        lines.splice(index, 2, "#", "#");
                        if (lines[index + 2] === "") {
                            lines[index + 2] = "#";
                        }
                    } else if (line.includes("private ZusatzAttribut")
                        || line.includes("private String id")) {
                        lines.splice(index, 1, "#");
                    }
                } else if (classAndDir !== undefined && fileName === classAndDir.className) {
                    // change parent properties and values to fit schema
                    if (line.includes("setVersion")) {
                        lines.splice(index, 1, "#");
                    } else {
                        lines[index] = lines[index]
                            .replace(" version", " _version")
                            .replace("private String _version;", "private final String _version = \"" + currentVersion + "\";")
                            .replace(" id", " _id")
                            .replace("this.id", "this._id")
                            .replace("public class", "public abstract class")
                            .replace("getVersion", "getSchemaVersion")
                            .replace("getid", "getId")
                            .replace("setid", "setId");
                    }
                }
                if (line.includes("StringOderNummer")) {
                    lines[index] = lines[index].replace("StringOderNummer", "String");
                }
                if (line.includes("setTyp")) {
                    lines.splice(index, 1, "#");
                }
                if (line.includes("private ")) {
                    const words = line.trim().split(" ").filter(value => value !== "");
                    const type = words[1].replace("[]", "");
                    const property = words[2].replace(";", "");
                    if (lines[index] !== "#" && property !== "id" && property !== "version") {
                        // change property names to fit schema
                        const propertyName = getPropertyName(property, file, fileMap.get(fileName.toLowerCase()).replace(targetDirName, sourceDirName));
                        lines[index] = lines[index].replace(` ${property};`, ` ${propertyName};`);
                        const getterIndex = lines.findIndex(value => value.toLowerCase().includes(`get${property.toLowerCase()}`));
                        lines[getterIndex] = lines[getterIndex].replace(`return ${property};`, `return ${propertyName};`);
                        lines[getterIndex + 1] = lines[getterIndex + 1].replace(`this.${property} = value;`, `this.${propertyName} = value;`);
                    }
                    if (type !== "ZusatzAttribut" || (classAndDir !== undefined && fileName === classAndDir.className)) {
                        if (type === "Typ") {
                            // add default value to property Typ
                            const fileContent = fs
                                .readFileSync(sourcePath, "utf-8")
                                .replaceAll(" ", "")
                                .split("\n");
                            const fileTyp = fileContent
                                .slice(fileContent.findIndex(value => value.includes("_typ")))
                                .find(value => value.includes("default"))
                                .replaceAll("\"", "")
                                .replace("default:", "");
                            lines[index] = lines[index].replace("private", "private final").replace(";", " = Typ." + fileTyp + ";")
                        }
                        // add import statements
                        const typeFile = type + ".json";
                        if (type !== "StringOderNummer" && !files.includes(typeFile)) {
                            if (fileMap.has(type.toLowerCase())) {
                                const importLine = `import ${packageName}${fileMap.get(type.toLowerCase()).replace("generatedCode/","").replaceAll("/", ".")}${type};`;
                                if (!importLines.includes(importLine)) {
                                    importLines.push(importLine);
                                }
                            }
                        }
                    }
                }
            });
            const newLines = lines.filter(value => value !== "#");
            if (importLines.length > 0) {
                if (!lines[2].startsWith("import ")) {
                    newLines.splice(2, 0, importLines.join("\n"), "");
                } else {
                    newLines.splice(2, 0, importLines.join("\n"));
                }
            }
            fs.writeFileSync(target + '/' + javaFile, newLines.join("\n"));
        } else {
            dirname = file;
            if (file === "enum") {
                dirname += 's';
            }
            let targetPath =  target + '/' + dirname;
            if (!fs.existsSync(targetPath)) {
                fs.mkdirSync(targetPath);
            }
            cleanUp(sourcePath, targetPath, fileMap, root, dirname);
        }
    }

}

function main(source = sourceDirName, target = "generatedCode/" + targetDirName) {
    console.log("Preparing generation");
    const allKnowingSchema = generateAllKnowingSchema();
    console.log("Creating generation_schema");
    const fileMap = addToSchema(allKnowingSchema, source);
    const counter = fileMap.size;
    fileMap.set("stringodernummer", "");
    let schema = allKnowingSchema[0];
    for (let i = 2; i < allKnowingSchema.length; i++) {
        schema += allKnowingSchema[i];
    }
    schema += allKnowingSchema[1];
    console.log("Generation_schema complete");
    const inputData = new InputData();
    const schemaInput = new JSONSchemaInput(new FetchingJSONSchemaStore());
    schemaInput.addSourceSync({name: "StringOderNummer", schema: fs.readFileSync("resource_schemas/StringOderNummerTyp.json", "utf-8")});
    schemaInput.addSourceSync({name: "AllKnowing", schema: schema});
    inputData.addInput(schemaInput);
    console.log("Starting generation");
    quicktypeMultiFile({
        inputData,
        lang: new NewJavaTargetLanguage(),
        allPropertiesOptional: false
    }).then(javaClasses => {
        console.log("Generation complete");
        console.log("Starting output");
        javaClasses.forEach((javaClass, className) => {
            if (className !== "AllKnowing.java" && className !== "StringOderNummerTyp.java" && className !== "StringOderNummer.java") {
                if (!fs.existsSync(target)) {
                    fs.mkdirSync(target, {recursive: true});
                }
                fs.writeFileSync(target + "/" + className, javaClass.lines.join("\n"));
            }
        });
        console.log("Output complete");
        console.log("Starting cleanup");
        cleanUp(source, target, fileMap);
        console.log("Cleanup complete");
        result(counter, source, target);
    });
}

/**
 * logs information about the finished prozess to the console
 * @param counter the number of generated files
 * @param source the path to the directory that contains the schemas
 * @param target the path to the directory that contains the generated classes
 */
function result(counter, source, target) {
    const boCount = fs.readdirSync(source + "/bo").length;
    const comCount = fs.readdirSync(source + "/com").length;
    const enumCount = fs.readdirSync(source + "/enum").length;
    const boCountG = fs.readdirSync(target + "/bo").length;
    const comCountG = fs.readdirSync(target + "/com").length;
    const enumCountG = fs.readdirSync(target + "/enums").length;
    console.log("\nEinzulesende Dateien: " + (fs.readdirSync(source).length - 3 + boCount + comCount + enumCount));
    console.log("Eingelesene Dateien: " + counter);
    console.log("Erstellte Dateien: " + (fs.readdirSync(target).length - 3 + boCountG + comCountG + enumCountG));
    console.log("Bo: " + boCountG + "/" + boCount);
    console.log("Com: " + comCountG + "/" + comCount);
    console.log("Enum: " + enumCountG + "/" + enumCount);
}

main();
