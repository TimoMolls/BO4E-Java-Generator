package bo4e.bo;

import bo4e.enums.Typ;
import bo4e.enums.Dienstleistungstyp;
import bo4e.enums.Bilanzierungsmethode;
import bo4e.com.Zeitraum;
import bo4e.com.Preisposition;
import bo4e.enums.Preisstatus;
import bo4e.enums.Sparte;

import java.util.List;

/**
 * Variante des Preisblattmodells zur Abbildung der Preise für wahlfreie Dienstleistungen
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/bo/PreisblattDienstleistung.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `PreisblattDienstleistung JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/bo/PreisblattDienstleistung.json>`_
 */
public class PreisblattDienstleistung extends Geschaeftsobjekt {
    /**
     * Typ des Geschaeftsobjekts
     */
    private final Typ typ = Typ.PREISBLATTDIENSTLEISTUNG;
    /**
     * Dienstleistung, für die der Preis abgebildet wird, z.B. Sperrung/Entsperrung
     */
    private Dienstleistungstyp basisdienstleistung;
    /**
     * Eine Bezeichnung für das Preisblatt
     */
    private String bezeichnung;
    /**
     * Die Preise gelten für Marktlokationen der angebebenen Bilanzierungsmethode
     */
    private Bilanzierungsmethode bilanzierungsmethode;
    /**
     * Hier kann der Preis auf bestimmte Geräte eingegrenzt werden. Z.B. auf die Zählergröße
     */
    private Geraet geraetedetails;
    /**
     * Der Zeitraum für den der Preis festgelegt ist
     */
    private Zeitraum gueltigkeit;
    /**
     * Der Netzbetreiber, der die Preise veröffentlicht hat
     */
    private Marktteilnehmer herausgeber;
    /**
     * Weitere Dienstleistungen, die im Preis enthalten sind
     */
    private List<Dienstleistungstyp> inklusiveDienstleistungen;
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

    public PreisblattDienstleistung() {}
    private PreisblattDienstleistung(PreisblattDienstleistungBuilder builder) {
        this.basisdienstleistung = builder.basisdienstleistung;
        this.bezeichnung = builder.bezeichnung;
        this.bilanzierungsmethode = builder.bilanzierungsmethode;
        this.geraetedetails = builder.geraetedetails;
        this.gueltigkeit = builder.gueltigkeit;
        this.herausgeber = builder.herausgeber;
        this.inklusiveDienstleistungen = builder.inklusiveDienstleistungen;
        this.preispositionen = builder.preispositionen;
        this.preisstatus = builder.preisstatus;
        this.sparte = builder.sparte;
    }

    public Typ getTyp() {
        return typ;
    }

    public Dienstleistungstyp getBasisdienstleistung() {
        return basisdienstleistung;
    }
    public void setBasisdienstleistung(Dienstleistungstyp basisdienstleistung) {
        this.basisdienstleistung = basisdienstleistung;
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

    public Geraet getGeraetedetails() {
        return geraetedetails;
    }
    public void setGeraetedetails(Geraet geraetedetails) {
        this.geraetedetails = geraetedetails;
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

    public List<Dienstleistungstyp> getInklusiveDienstleistungen() {
        return inklusiveDienstleistungen;
    }
    public void setInklusiveDienstleistungen(List<Dienstleistungstyp> inklusiveDienstleistungen) {
        this.inklusiveDienstleistungen = inklusiveDienstleistungen;
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

    public static class PreisblattDienstleistungBuilder extends GeschaeftsobjektBuilder {
        /**
         * Dienstleistung, für die der Preis abgebildet wird, z.B. Sperrung/Entsperrung
         */
        private Dienstleistungstyp basisdienstleistung;
        /**
         * Eine Bezeichnung für das Preisblatt
         */
        private String bezeichnung;
        /**
         * Die Preise gelten für Marktlokationen der angebebenen Bilanzierungsmethode
         */
        private Bilanzierungsmethode bilanzierungsmethode;
        /**
         * Hier kann der Preis auf bestimmte Geräte eingegrenzt werden. Z.B. auf die Zählergröße
         */
        private Geraet geraetedetails;
        /**
         * Der Zeitraum für den der Preis festgelegt ist
         */
        private Zeitraum gueltigkeit;
        /**
         * Der Netzbetreiber, der die Preise veröffentlicht hat
         */
        private Marktteilnehmer herausgeber;
        /**
         * Weitere Dienstleistungen, die im Preis enthalten sind
         */
        private List<Dienstleistungstyp> inklusiveDienstleistungen;
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
    
        public Dienstleistungstyp getBasisdienstleistung() {
            return basisdienstleistung;
        }
        public PreisblattDienstleistungBuilder setBasisdienstleistung(Dienstleistungstyp basisdienstleistung) {
            this.basisdienstleistung = basisdienstleistung;
            return this;
        }
    
        public String getBezeichnung() {
            return bezeichnung;
        }
        public PreisblattDienstleistungBuilder setBezeichnung(String bezeichnung) {
            this.bezeichnung = bezeichnung;
            return this;
        }
    
        public Bilanzierungsmethode getBilanzierungsmethode() {
            return bilanzierungsmethode;
        }
        public PreisblattDienstleistungBuilder setBilanzierungsmethode(Bilanzierungsmethode bilanzierungsmethode) {
            this.bilanzierungsmethode = bilanzierungsmethode;
            return this;
        }
    
        public Geraet getGeraetedetails() {
            return geraetedetails;
        }
        public PreisblattDienstleistungBuilder setGeraetedetails(Geraet geraetedetails) {
            this.geraetedetails = geraetedetails;
            return this;
        }
    
        public Zeitraum getGueltigkeit() {
            return gueltigkeit;
        }
        public PreisblattDienstleistungBuilder setGueltigkeit(Zeitraum gueltigkeit) {
            this.gueltigkeit = gueltigkeit;
            return this;
        }
    
        public Marktteilnehmer getHerausgeber() {
            return herausgeber;
        }
        public PreisblattDienstleistungBuilder setHerausgeber(Marktteilnehmer herausgeber) {
            this.herausgeber = herausgeber;
            return this;
        }
    
        public List<Dienstleistungstyp> getInklusiveDienstleistungen() {
            return inklusiveDienstleistungen;
        }
        public PreisblattDienstleistungBuilder setInklusiveDienstleistungen(List<Dienstleistungstyp> inklusiveDienstleistungen) {
            this.inklusiveDienstleistungen = inklusiveDienstleistungen;
            return this;
        }
    
        public List<Preisposition> getPreispositionen() {
            return preispositionen;
        }
        public PreisblattDienstleistungBuilder setPreispositionen(List<Preisposition> preispositionen) {
            this.preispositionen = preispositionen;
            return this;
        }
    
        public Preisstatus getPreisstatus() {
            return preisstatus;
        }
        public PreisblattDienstleistungBuilder setPreisstatus(Preisstatus preisstatus) {
            this.preisstatus = preisstatus;
            return this;
        }
    
        public Sparte getSparte() {
            return sparte;
        }
        public PreisblattDienstleistungBuilder setSparte(Sparte sparte) {
            this.sparte = sparte;
            return this;
        }
    
        public PreisblattDienstleistung build() {
            return new PreisblattDienstleistung(this);
        }
    }
}