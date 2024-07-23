package bo4e.com;

import java.util.List;

/**
 * Mit dieser Komponente werden Zählzeitregister modelliert. Ein Zählzeitregister beschreibt
 * eine erweiterte Definition der Zählzeit
 * in Bezug auf ein Register. Dabei werden alle Codes dazu vom Netzbetreiber vergeben.
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/Zaehlzeitregister.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Zaehlzeitregister JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/com/Zaehlzeitregister.json>`_
 */
public class Zaehlzeitregister extends COM {
    /**
     * Zählzeitregister
     */
    private Boolean istSchwachlastfaehig;
    /**
     * Zählzeitdefinition
     */
    private String zaehlzeitDefinition;
    /**
     * Zählzeitdefinition
     */
    private String zaehlzeitRegister;

    public Zaehlzeitregister() {
    }

    private Zaehlzeitregister(ZaehlzeitregisterBuilder builder) {
        super(builder);
        this.istSchwachlastfaehig = builder.istSchwachlastfaehig;
        this.zaehlzeitDefinition = builder.zaehlzeitDefinition;
        this.zaehlzeitRegister = builder.zaehlzeitRegister;
    }

    public Boolean getIstSchwachlastfaehig() {
        return istSchwachlastfaehig;
    }

    public void setIstSchwachlastfaehig(Boolean istSchwachlastfaehig) {
        this.istSchwachlastfaehig = istSchwachlastfaehig;
    }

    public String getZaehlzeitDefinition() {
        return zaehlzeitDefinition;
    }

    public void setZaehlzeitDefinition(String zaehlzeitDefinition) {
        this.zaehlzeitDefinition = zaehlzeitDefinition;
    }

    public String getZaehlzeitRegister() {
        return zaehlzeitRegister;
    }

    public void setZaehlzeitRegister(String zaehlzeitRegister) {
        this.zaehlzeitRegister = zaehlzeitRegister;
    }

    public static class ZaehlzeitregisterBuilder extends COMBuilder {
        /**
         * Zählzeitregister
         */
        private Boolean istSchwachlastfaehig;
        /**
         * Zählzeitdefinition
         */
        private String zaehlzeitDefinition;
        /**
         * Zählzeitdefinition
         */
        private String zaehlzeitRegister;
    
        public Boolean getIstSchwachlastfaehig() {
            return istSchwachlastfaehig;
        }
    
        public ZaehlzeitregisterBuilder setIstSchwachlastfaehig(Boolean istSchwachlastfaehig) {
            this.istSchwachlastfaehig = istSchwachlastfaehig;
            return this;
        }
    
        public String getZaehlzeitDefinition() {
            return zaehlzeitDefinition;
        }
    
        public ZaehlzeitregisterBuilder setZaehlzeitDefinition(String zaehlzeitDefinition) {
            this.zaehlzeitDefinition = zaehlzeitDefinition;
            return this;
        }
    
        public String getZaehlzeitRegister() {
            return zaehlzeitRegister;
        }
    
        public ZaehlzeitregisterBuilder setZaehlzeitRegister(String zaehlzeitRegister) {
            this.zaehlzeitRegister = zaehlzeitRegister;
            return this;
        }
    
        public Zaehlzeitregister build() {
            return new Zaehlzeitregister(this);
        }
    }
}