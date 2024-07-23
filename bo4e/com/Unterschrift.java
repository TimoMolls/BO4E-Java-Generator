package bo4e.com;

import java.time.OffsetDateTime;
import java.util.List;

/**
 * Modellierung einer Unterschrift, z.B. für Verträge, Angebote etc.
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/Unterschrift.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Unterschrift JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/com/Unterschrift.json>`_
 */
public class Unterschrift extends COM {
    /**
     * Ort, an dem die Unterschrift geleistet wird
     */
    private OffsetDateTime datum;
    /**
     * Name des Unterschreibers
     */
    private String name;
    /**
     * Ort, an dem die Unterschrift geleistet wird
     */
    private String ort;

    public Unterschrift() {}
    private Unterschrift(UnterschriftBuilder builder) {
        this.datum = builder.datum;
        this.name = builder.name;
        this.ort = builder.ort;
    }

    public OffsetDateTime getDatum() {
        return datum;
    }
    public void setDatum(OffsetDateTime datum) {
        this.datum = datum;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getOrt() {
        return ort;
    }
    public void setOrt(String ort) {
        this.ort = ort;
    }

    public static class UnterschriftBuilder extends COMBuilder {
        /**
         * Ort, an dem die Unterschrift geleistet wird
         */
        private OffsetDateTime datum;
        /**
         * Name des Unterschreibers
         */
        private String name;
        /**
         * Ort, an dem die Unterschrift geleistet wird
         */
        private String ort;
    
        public OffsetDateTime getDatum() {
            return datum;
        }
        public UnterschriftBuilder setDatum(OffsetDateTime datum) {
            this.datum = datum;
            return this;
        }
    
        public String getName() {
            return name;
        }
        public UnterschriftBuilder setName(String name) {
            this.name = name;
            return this;
        }
    
        public String getOrt() {
            return ort;
        }
        public UnterschriftBuilder setOrt(String ort) {
            this.ort = ort;
            return this;
        }
    
        public Unterschrift build() {
            return new Unterschrift(this);
        }
    }
}