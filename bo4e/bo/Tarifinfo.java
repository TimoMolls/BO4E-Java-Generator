package bo4e.bo;

import bo4e.enums.Typ;
import bo4e.com.Energiemix;
import bo4e.enums.Kundentyp;
import bo4e.enums.Registeranzahl;
import bo4e.enums.Sparte;
import bo4e.enums.Tarifmerkmal;
import bo4e.enums.Tariftyp;
import bo4e.com.Vertragskonditionen;
import bo4e.com.Zeitraum;

import java.time.OffsetDateTime;
import java.util.List;

/**
 * Das BO Tarifinfo liefert die Merkmale, die einen Endkundentarif identifizierbar machen.
 * Dieses BO dient als Basis für weitere BOs mit erweiterten Anwendungsmöglichkeiten.
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/bo/Tarifinfo.svg" type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Tarifinfo JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/bo/Tarifinfo.json>`_
 */
public class Tarifinfo extends Geschaeftsobjekt {
    /**
     * Typ des Geschaeftsobjekts
     */
    private final Typ typ = Typ.TARIFINFO;
    /**
     * Der Marktteilnehmer (Lieferant), der diesen Tarif anbietet
     */
    private Marktteilnehmer anbieter;
    /**
     * Der Name des Marktpartners, der den Tarif anbietet
     */
    private String anbietername;
    /**
     * Angabe des inklusiven Zeitpunkts, ab dem der Tarif bzw. der Preis angewendet und
     * abgerechnet wird,
     * z.B. "2021-07-20T18:31:48Z"
     */
    private OffsetDateTime anwendungVon;
    /**
     * Freitext
     */
    private String bemerkung;
    /**
     * Name des Tarifs
     */
    private String bezeichnung;
    /**
     * Der Energiemix, der für diesen Tarif gilt
     */
    private Energiemix energiemix;
    /**
     * Kundentypen für den der Tarif gilt, z.B. Privatkunden
     */
    private List<Kundentyp> kundentypen;
    /**
     * Die Art des Tarifes, z.B. Eintarif oder Mehrtarif
     */
    private Registeranzahl registeranzahl;
    /**
     * Strom oder Gas, etc.
     */
    private Sparte sparte;
    /**
     * Weitere Merkmale des Tarifs, z.B. Festpreis oder Vorkasse
     */
    private List<Tarifmerkmal> tarifmerkmale;
    /**
     * Hinweis auf den Tariftyp, z.B. Grundversorgung oder Sondertarif
     */
    private Tariftyp tariftyp;
    /**
     * Mindestlaufzeiten und Kündigungsfristen zusammengefasst
     */
    private Vertragskonditionen vertragskonditionen;
    /**
     * Internetseite auf dem der Tarif zu finden ist
     */
    private String website;
    /**
     * Angabe, in welchem Zeitraum der Tarif gültig ist
     */
    private Zeitraum zeitlicheGueltigkeit;

    public Tarifinfo() {
    }

    private Tarifinfo(TarifinfoBuilder builder) {
        super(builder);
        this.anbieter = builder.anbieter;
        this.anbietername = builder.anbietername;
        this.anwendungVon = builder.anwendungVon;
        this.bemerkung = builder.bemerkung;
        this.bezeichnung = builder.bezeichnung;
        this.energiemix = builder.energiemix;
        this.kundentypen = builder.kundentypen;
        this.registeranzahl = builder.registeranzahl;
        this.sparte = builder.sparte;
        this.tarifmerkmale = builder.tarifmerkmale;
        this.tariftyp = builder.tariftyp;
        this.vertragskonditionen = builder.vertragskonditionen;
        this.website = builder.website;
        this.zeitlicheGueltigkeit = builder.zeitlicheGueltigkeit;
    }

    public Typ getTyp() {
        return typ;
    }

    public Marktteilnehmer getAnbieter() {
        return anbieter;
    }

    public void setAnbieter(Marktteilnehmer anbieter) {
        this.anbieter = anbieter;
    }

    public String getAnbietername() {
        return anbietername;
    }

    public void setAnbietername(String anbietername) {
        this.anbietername = anbietername;
    }

    public OffsetDateTime getAnwendungVon() {
        return anwendungVon;
    }

    public void setAnwendungVon(OffsetDateTime anwendungVon) {
        this.anwendungVon = anwendungVon;
    }

    public String getBemerkung() {
        return bemerkung;
    }

    public void setBemerkung(String bemerkung) {
        this.bemerkung = bemerkung;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public Energiemix getEnergiemix() {
        return energiemix;
    }

    public void setEnergiemix(Energiemix energiemix) {
        this.energiemix = energiemix;
    }

    public List<Kundentyp> getKundentypen() {
        return kundentypen;
    }

    public void setKundentypen(List<Kundentyp> kundentypen) {
        this.kundentypen = kundentypen;
    }

    public Registeranzahl getRegisteranzahl() {
        return registeranzahl;
    }

    public void setRegisteranzahl(Registeranzahl registeranzahl) {
        this.registeranzahl = registeranzahl;
    }

    public Sparte getSparte() {
        return sparte;
    }

    public void setSparte(Sparte sparte) {
        this.sparte = sparte;
    }

    public List<Tarifmerkmal> getTarifmerkmale() {
        return tarifmerkmale;
    }

    public void setTarifmerkmale(List<Tarifmerkmal> tarifmerkmale) {
        this.tarifmerkmale = tarifmerkmale;
    }

    public Tariftyp getTariftyp() {
        return tariftyp;
    }

    public void setTariftyp(Tariftyp tariftyp) {
        this.tariftyp = tariftyp;
    }

    public Vertragskonditionen getVertragskonditionen() {
        return vertragskonditionen;
    }

    public void setVertragskonditionen(Vertragskonditionen vertragskonditionen) {
        this.vertragskonditionen = vertragskonditionen;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public Zeitraum getZeitlicheGueltigkeit() {
        return zeitlicheGueltigkeit;
    }

    public void setZeitlicheGueltigkeit(Zeitraum zeitlicheGueltigkeit) {
        this.zeitlicheGueltigkeit = zeitlicheGueltigkeit;
    }

    public static class TarifinfoBuilder extends GeschaeftsobjektBuilder {
        /**
         * Der Marktteilnehmer (Lieferant), der diesen Tarif anbietet
         */
        private Marktteilnehmer anbieter;
        /**
         * Der Name des Marktpartners, der den Tarif anbietet
         */
        private String anbietername;
        /**
         * Angabe des inklusiven Zeitpunkts, ab dem der Tarif bzw. der Preis angewendet und
         * abgerechnet wird,
         * z.B. "2021-07-20T18:31:48Z"
         */
        private OffsetDateTime anwendungVon;
        /**
         * Freitext
         */
        private String bemerkung;
        /**
         * Name des Tarifs
         */
        private String bezeichnung;
        /**
         * Der Energiemix, der für diesen Tarif gilt
         */
        private Energiemix energiemix;
        /**
         * Kundentypen für den der Tarif gilt, z.B. Privatkunden
         */
        private List<Kundentyp> kundentypen;
        /**
         * Die Art des Tarifes, z.B. Eintarif oder Mehrtarif
         */
        private Registeranzahl registeranzahl;
        /**
         * Strom oder Gas, etc.
         */
        private Sparte sparte;
        /**
         * Weitere Merkmale des Tarifs, z.B. Festpreis oder Vorkasse
         */
        private List<Tarifmerkmal> tarifmerkmale;
        /**
         * Hinweis auf den Tariftyp, z.B. Grundversorgung oder Sondertarif
         */
        private Tariftyp tariftyp;
        /**
         * Mindestlaufzeiten und Kündigungsfristen zusammengefasst
         */
        private Vertragskonditionen vertragskonditionen;
        /**
         * Internetseite auf dem der Tarif zu finden ist
         */
        private String website;
        /**
         * Angabe, in welchem Zeitraum der Tarif gültig ist
         */
        private Zeitraum zeitlicheGueltigkeit;
    
        public Marktteilnehmer getAnbieter() {
            return anbieter;
        }
    
        public TarifinfoBuilder setAnbieter(Marktteilnehmer anbieter) {
            this.anbieter = anbieter;
            return this;
        }
    
        public String getAnbietername() {
            return anbietername;
        }
    
        public TarifinfoBuilder setAnbietername(String anbietername) {
            this.anbietername = anbietername;
            return this;
        }
    
        public OffsetDateTime getAnwendungVon() {
            return anwendungVon;
        }
    
        public TarifinfoBuilder setAnwendungVon(OffsetDateTime anwendungVon) {
            this.anwendungVon = anwendungVon;
            return this;
        }
    
        public String getBemerkung() {
            return bemerkung;
        }
    
        public TarifinfoBuilder setBemerkung(String bemerkung) {
            this.bemerkung = bemerkung;
            return this;
        }
    
        public String getBezeichnung() {
            return bezeichnung;
        }
    
        public TarifinfoBuilder setBezeichnung(String bezeichnung) {
            this.bezeichnung = bezeichnung;
            return this;
        }
    
        public Energiemix getEnergiemix() {
            return energiemix;
        }
    
        public TarifinfoBuilder setEnergiemix(Energiemix energiemix) {
            this.energiemix = energiemix;
            return this;
        }
    
        public List<Kundentyp> getKundentypen() {
            return kundentypen;
        }
    
        public TarifinfoBuilder setKundentypen(List<Kundentyp> kundentypen) {
            this.kundentypen = kundentypen;
            return this;
        }
    
        public Registeranzahl getRegisteranzahl() {
            return registeranzahl;
        }
    
        public TarifinfoBuilder setRegisteranzahl(Registeranzahl registeranzahl) {
            this.registeranzahl = registeranzahl;
            return this;
        }
    
        public Sparte getSparte() {
            return sparte;
        }
    
        public TarifinfoBuilder setSparte(Sparte sparte) {
            this.sparte = sparte;
            return this;
        }
    
        public List<Tarifmerkmal> getTarifmerkmale() {
            return tarifmerkmale;
        }
    
        public TarifinfoBuilder setTarifmerkmale(List<Tarifmerkmal> tarifmerkmale) {
            this.tarifmerkmale = tarifmerkmale;
            return this;
        }
    
        public Tariftyp getTariftyp() {
            return tariftyp;
        }
    
        public TarifinfoBuilder setTariftyp(Tariftyp tariftyp) {
            this.tariftyp = tariftyp;
            return this;
        }
    
        public Vertragskonditionen getVertragskonditionen() {
            return vertragskonditionen;
        }
    
        public TarifinfoBuilder setVertragskonditionen(Vertragskonditionen vertragskonditionen) {
            this.vertragskonditionen = vertragskonditionen;
            return this;
        }
    
        public String getWebsite() {
            return website;
        }
    
        public TarifinfoBuilder setWebsite(String website) {
            this.website = website;
            return this;
        }
    
        public Zeitraum getZeitlicheGueltigkeit() {
            return zeitlicheGueltigkeit;
        }
    
        public TarifinfoBuilder setZeitlicheGueltigkeit(Zeitraum zeitlicheGueltigkeit) {
            this.zeitlicheGueltigkeit = zeitlicheGueltigkeit;
            return this;
        }
    
        public Tarifinfo build() {
            return new Tarifinfo(this);
        }
    }
}