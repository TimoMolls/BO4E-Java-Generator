package bo4e.com;

import java.util.List;

/**
 * Komponente zur Abbildung eines Kostenblocks in den Fremdkosten
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/Fremdkostenblock.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Fremdkostenblock JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/com/Fremdkostenblock.json>`_
 */
public class Fremdkostenblock extends COM {
    /**
     * Bezeichnung für einen Kostenblock. Z.B. Netzkosten, Messkosten, Umlagen, etc.
     */
    private String kostenblockbezeichnung;
    /**
     * Hier sind die Details zu einer Kostenposition aufgeführt. Z.B.:
     * Alliander Netz Heinsberg GmbH, 2018-02-01, 2019-01-01, Arbeitspreis HT, 3.660 kWh,
     * 5,8200 ct/kWh, 213,01 €
     */
    private List<Fremdkostenposition> kostenpositionen;
    /**
     * Die Summe aller Kostenpositionen dieses Blocks
     */
    private Betrag summeKostenblock;

    public Fremdkostenblock() {
    }

    private Fremdkostenblock(FremdkostenblockBuilder builder) {
        super(builder);
        this.kostenblockbezeichnung = builder.kostenblockbezeichnung;
        this.kostenpositionen = builder.kostenpositionen;
        this.summeKostenblock = builder.summeKostenblock;
    }

    public String getKostenblockbezeichnung() {
        return kostenblockbezeichnung;
    }

    public void setKostenblockbezeichnung(String kostenblockbezeichnung) {
        this.kostenblockbezeichnung = kostenblockbezeichnung;
    }

    public List<Fremdkostenposition> getKostenpositionen() {
        return kostenpositionen;
    }

    public void setKostenpositionen(List<Fremdkostenposition> kostenpositionen) {
        this.kostenpositionen = kostenpositionen;
    }

    public Betrag getSummeKostenblock() {
        return summeKostenblock;
    }

    public void setSummeKostenblock(Betrag summeKostenblock) {
        this.summeKostenblock = summeKostenblock;
    }

    public static class FremdkostenblockBuilder extends COMBuilder {
        /**
         * Bezeichnung für einen Kostenblock. Z.B. Netzkosten, Messkosten, Umlagen, etc.
         */
        private String kostenblockbezeichnung;
        /**
         * Hier sind die Details zu einer Kostenposition aufgeführt. Z.B.:
         * Alliander Netz Heinsberg GmbH, 2018-02-01, 2019-01-01, Arbeitspreis HT, 3.660 kWh,
         * 5,8200 ct/kWh, 213,01 €
         */
        private List<Fremdkostenposition> kostenpositionen;
        /**
         * Die Summe aller Kostenpositionen dieses Blocks
         */
        private Betrag summeKostenblock;
    
        public String getKostenblockbezeichnung() {
            return kostenblockbezeichnung;
        }
    
        public FremdkostenblockBuilder setKostenblockbezeichnung(String kostenblockbezeichnung) {
            this.kostenblockbezeichnung = kostenblockbezeichnung;
            return this;
        }
    
        public List<Fremdkostenposition> getKostenpositionen() {
            return kostenpositionen;
        }
    
        public FremdkostenblockBuilder setKostenpositionen(List<Fremdkostenposition> kostenpositionen) {
            this.kostenpositionen = kostenpositionen;
            return this;
        }
    
        public Betrag getSummeKostenblock() {
            return summeKostenblock;
        }
    
        public FremdkostenblockBuilder setSummeKostenblock(Betrag summeKostenblock) {
            this.summeKostenblock = summeKostenblock;
            return this;
        }
    
        public Fremdkostenblock build() {
            return new Fremdkostenblock(this);
        }
    }
}