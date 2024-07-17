package placeholder;

import java.util.List;

/**
 * Mit dieser Komponente können Auf- und Abschläge verschiedener Typen im Zusammenhang
 * mit örtlichen Gültigkeiten abgebildet werden.
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/AufAbschlagProOrt.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `AufAbschlagProOrt JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/com/AufAbschlagProOrt.json>`_
 */
public class AufAbschlagProOrt {
    private String id;
    private String version;
    private String netznr;
    private String ort;
    private String postleitzahl;
    private List<AufAbschlagstaffelProOrt> staffeln;
    private List<ZusatzAttribut> zusatzAttribute;

    /**
     * zusatz_attribute: Optional[list["ZusatzAttribut"]] = None
     *
     * # pylint: disable=duplicate-code
     * model_config = ConfigDict(
     * alias_generator=camelize,
     * populate_by_name=True,
     * extra="allow",
     * # json_encoders is deprecated, but there is no easy-to-use alternative. The best way
     * would be to create
     * # an annotated version of Decimal, but you would have to use it everywhere in the
     * pydantic models.
     * # See this issue for more info: https://github.com/pydantic/pydantic/issues/6375
     * json_encoders={Decimal: str},
     * )
     */
    public String getid() { return id; }
    public void setid(String value) { this.id = value; }

    /**
     * Version der BO-Struktur aka "fachliche Versionierung"
     */
    public String getVersion() { return version; }
    public void setVersion(String value) { this.version = value; }

    /**
     * Die ene't-Netznummer des Netzes in dem der Aufschlag gilt.
     */
    public String getNetznr() { return netznr; }
    public void setNetznr(String value) { this.netznr = value; }

    /**
     * Der Ort für den der Aufschlag gilt.
     */
    public String getOrt() { return ort; }
    public void setOrt(String value) { this.ort = value; }

    /**
     * Die Postleitzahl des Ortes für den der Aufschlag gilt.
     */
    public String getPostleitzahl() { return postleitzahl; }
    public void setPostleitzahl(String value) { this.postleitzahl = value; }

    /**
     * Werte für die gestaffelten Auf/Abschläge mit regionaler Eingrenzung.
     */
    public List<AufAbschlagstaffelProOrt> getStaffeln() { return staffeln; }
    public void setStaffeln(List<AufAbschlagstaffelProOrt> value) { this.staffeln = value; }

    public List<ZusatzAttribut> getZusatzAttribute() { return zusatzAttribute; }
    public void setZusatzAttribute(List<ZusatzAttribut> value) { this.zusatzAttribute = value; }
}
