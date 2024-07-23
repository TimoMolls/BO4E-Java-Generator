package bo4e.bo;

import bo4e.enums.Typ;
import bo4e.enums.Bilanzierungsmethode;
import bo4e.com.Zeitraum;
import bo4e.enums.Kundengruppe;
import bo4e.enums.Netzebene;
import bo4e.com.Preisposition;
import bo4e.enums.Preisstatus;
import bo4e.enums.Sparte;
import bo4e.ZusatzAttribut;

import java.util.List;

/**
 * Die Variante des Preisblattmodells zur Abbildung der Netznutzungspreise
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/bo/PreisblattNetznutzung.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `PreisblattNetznutzung JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/bo/PreisblattNetznutzung.json>`_
 */
public class PreisblattNetznutzung extends Geschaeftsobjekt {
    /**
     * Typ des Geschaeftsobjekts
     */
    private final Typ typ = Typ.PREISBLATTNETZNUTZUNG;
    /**
     * Eine Bezeichnung für das Preisblatt
     */
    private String bezeichnung;
    /**
     * Die Preise gelten für Marktlokationen der angebebenen Bilanzierungsmethode
     */
    private Bilanzierungsmethode bilanzierungsmethode;
    /**
     * Der Zeitraum für den der Preis festgelegt ist
     */
    private Zeitraum gueltigkeit;
    /**
     * Der Netzbetreiber, der die Preise veröffentlicht hat
     */
    private Marktteilnehmer herausgeber;
    private Kundengruppe kundengruppe;
    /**
     * Die Preise gelten für Marktlokationen in der angebebenen Netzebene
     */
    private Netzebene netzebene;
    /**
     * Die einzelnen Positionen, die mit dem Preisblatt abgerechnet werden können. Z.B.
     * Arbeitspreis, Grundpreis etc
     */
    private List<Preisposition> preispositionen;
    /**
     * Merkmal, das anzeigt, ob es sich um vorläufige oder endgültige Preise handelt
     */
    private Preisstatus preisstatus;
    /**
     * Preisblatt gilt für angegebene Sparte
     */
    private Sparte sparte;

    public PreisblattNetznutzung() {
    }

    private PreisblattNetznutzung(PreisblattNetznutzungBuilder builder) {
        super(builder);
        this.bezeichnung = builder.bezeichnung;
        this.bilanzierungsmethode = builder.bilanzierungsmethode;
        this.gueltigkeit = builder.gueltigkeit;
        this.herausgeber = builder.herausgeber;
        this.kundengruppe = builder.kundengruppe;
        this.netzebene = builder.netzebene;
        this.preispositionen = builder.preispositionen;
        this.preisstatus = builder.preisstatus;
        this.sparte = builder.sparte;
    }

    public Typ getTyp() {
        return typ;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public Bilanzierungsmethode getBilanzierungsmethode() {
        return bilanzierungsmethode;
    }

    public void setBilanzierungsmethode(Bilanzierungsmethode bilanzierungsmethode) {
        this.bilanzierungsmethode = bilanzierungsmethode;
    }

    public Zeitraum getGueltigkeit() {
        return gueltigkeit;
    }

    public void setGueltigkeit(Zeitraum gueltigkeit) {
        this.gueltigkeit = gueltigkeit;
    }

    public Marktteilnehmer getHerausgeber() {
        return herausgeber;
    }

    public void setHerausgeber(Marktteilnehmer herausgeber) {
        this.herausgeber = herausgeber;
    }

    public Kundengruppe getKundengruppe() {
        return kundengruppe;
    }

    public void setKundengruppe(Kundengruppe kundengruppe) {
        this.kundengruppe = kundengruppe;
    }

    public Netzebene getNetzebene() {
        return netzebene;
    }

    public void setNetzebene(Netzebene netzebene) {
        this.netzebene = netzebene;
    }

    public List<Preisposition> getPreispositionen() {
        return preispositionen;
    }

    public void setPreispositionen(List<Preisposition> preispositionen) {
        this.preispositionen = preispositionen;
    }

    public Preisstatus getPreisstatus() {
        return preisstatus;
    }

    public void setPreisstatus(Preisstatus preisstatus) {
        this.preisstatus = preisstatus;
    }

    public Sparte getSparte() {
        return sparte;
    }

    public void setSparte(Sparte sparte) {
        this.sparte = sparte;
    }

    public static class PreisblattNetznutzungBuilder extends GeschaeftsobjektBuilder {
        /**
         * Eine Bezeichnung für das Preisblatt
         */
        private String bezeichnung;
        /**
         * Die Preise gelten für Marktlokationen der angebebenen Bilanzierungsmethode
         */
        private Bilanzierungsmethode bilanzierungsmethode;
        /**
         * Der Zeitraum für den der Preis festgelegt ist
         */
        private Zeitraum gueltigkeit;
        /**
         * Der Netzbetreiber, der die Preise veröffentlicht hat
         */
        private Marktteilnehmer herausgeber;
        private Kundengruppe kundengruppe;
        /**
         * Die Preise gelten für Marktlokationen in der angebebenen Netzebene
         */
        private Netzebene netzebene;
        /**
         * Die einzelnen Positionen, die mit dem Preisblatt abgerechnet werden können. Z.B.
         * Arbeitspreis, Grundpreis etc
         */
        private List<Preisposition> preispositionen;
        /**
         * Merkmal, das anzeigt, ob es sich um vorläufige oder endgültige Preise handelt
         */
        private Preisstatus preisstatus;
        /**
         * Preisblatt gilt für angegebene Sparte
         */
        private Sparte sparte;
    
        public String getBezeichnung() {
            return bezeichnung;
        }
    
        public PreisblattNetznutzungBuilder setBezeichnung(String bezeichnung) {
            this.bezeichnung = bezeichnung;
            return this;
        }
    
        public Bilanzierungsmethode getBilanzierungsmethode() {
            return bilanzierungsmethode;
        }
    
        public PreisblattNetznutzungBuilder setBilanzierungsmethode(Bilanzierungsmethode bilanzierungsmethode) {
            this.bilanzierungsmethode = bilanzierungsmethode;
            return this;
        }
    
        public Zeitraum getGueltigkeit() {
            return gueltigkeit;
        }
    
        public PreisblattNetznutzungBuilder setGueltigkeit(Zeitraum gueltigkeit) {
            this.gueltigkeit = gueltigkeit;
            return this;
        }
    
        public Marktteilnehmer getHerausgeber() {
            return herausgeber;
        }
    
        public PreisblattNetznutzungBuilder setHerausgeber(Marktteilnehmer herausgeber) {
            this.herausgeber = herausgeber;
            return this;
        }
    
        public Kundengruppe getKundengruppe() {
            return kundengruppe;
        }
    
        public PreisblattNetznutzungBuilder setKundengruppe(Kundengruppe kundengruppe) {
            this.kundengruppe = kundengruppe;
            return this;
        }
    
        public Netzebene getNetzebene() {
            return netzebene;
        }
    
        public PreisblattNetznutzungBuilder setNetzebene(Netzebene netzebene) {
            this.netzebene = netzebene;
            return this;
        }
    
        public List<Preisposition> getPreispositionen() {
            return preispositionen;
        }
    
        public PreisblattNetznutzungBuilder setPreispositionen(List<Preisposition> preispositionen) {
            this.preispositionen = preispositionen;
            return this;
        }
    
        public Preisstatus getPreisstatus() {
            return preisstatus;
        }
    
        public PreisblattNetznutzungBuilder setPreisstatus(Preisstatus preisstatus) {
            this.preisstatus = preisstatus;
            return this;
        }
    
        public Sparte getSparte() {
            return sparte;
        }
    
        public PreisblattNetznutzungBuilder setSparte(Sparte sparte) {
            this.sparte = sparte;
            return this;
        }
    
        public PreisblattNetznutzungBuilder setId(String id) {
            super.setId(id);
            return this;
        }
    
        public PreisblattNetznutzungBuilder setZusatzAttribute(List<ZusatzAttribut> zusatzAttribute) {
            super.setZusatzAttribute(zusatzAttribute);
            return this;
        }
    
        public PreisblattNetznutzung build() {
            return new PreisblattNetznutzung(this);
        }
    }
}