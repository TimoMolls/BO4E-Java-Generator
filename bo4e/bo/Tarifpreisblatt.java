package bo4e.bo;

import bo4e.enums.Typ;
import bo4e.com.Tarifberechnungsparameter;
import bo4e.com.Energiemix;
import bo4e.enums.Kundentyp;
import bo4e.com.Preisgarantie;
import bo4e.enums.Registeranzahl;
import bo4e.enums.Sparte;
import bo4e.com.AufAbschlag;
import bo4e.com.Tarifeinschraenkung;
import bo4e.enums.Tarifmerkmal;
import bo4e.com.Tarifpreisposition;
import bo4e.enums.Tariftyp;
import bo4e.com.Vertragskonditionen;
import bo4e.com.Zeitraum;

import java.time.OffsetDateTime;
import java.util.List;

/**
 * Tarifinformation mit Preisen, Aufschlägen und Berechnungssystematik
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/bo/Tarifpreisblatt.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Tarifpreisblatt JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/bo/Tarifpreisblatt.json>`_
 */
public class Tarifpreisblatt extends Geschaeftsobjekt {
    /**
     * Typ des Geschaeftsobjekts
     */
    private Typ typ = Typ.TARIFPREISBLATT;
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
     * Für die Berechnung der Kosten sind die hier abgebildeten Parameter heranzuziehen
     */
    private Tarifberechnungsparameter berechnungsparameter;
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
     * Festlegung von Garantien für bestimmte Preisanteile
     */
    private Preisgarantie preisgarantie;
    /**
     * Gibt an, wann der Preis zuletzt angepasst wurde
     */
    private OffsetDateTime preisstand;
    /**
     * Die Art des Tarifes, z.B. Eintarif oder Mehrtarif
     */
    private Registeranzahl registeranzahl;
    /**
     * Strom oder Gas, etc.
     */
    private Sparte sparte;
    /**
     * Auf- und Abschläge auf die Preise oder Kosten
     */
    private List<AufAbschlag> tarifAufAbschlaege;
    /**
     * Die Bedingungen und Einschränkungen unter denen ein Tarif angewendet werden kann
     */
    private Tarifeinschraenkung tarifeinschraenkung;
    /**
     * Weitere Merkmale des Tarifs, z.B. Festpreis oder Vorkasse
     */
    private List<Tarifmerkmal> tarifmerkmale;
    /**
     * Die festgelegten Preise, z.B. für Arbeitspreis, Grundpreis etc.
     */
    private List<Tarifpreisposition> tarifpreise;
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

    public Tarifberechnungsparameter getBerechnungsparameter() {
        return berechnungsparameter;
    }
    public void setBerechnungsparameter(Tarifberechnungsparameter berechnungsparameter) {
        this.berechnungsparameter = berechnungsparameter;
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

    public Preisgarantie getPreisgarantie() {
        return preisgarantie;
    }
    public void setPreisgarantie(Preisgarantie preisgarantie) {
        this.preisgarantie = preisgarantie;
    }

    public OffsetDateTime getPreisstand() {
        return preisstand;
    }
    public void setPreisstand(OffsetDateTime preisstand) {
        this.preisstand = preisstand;
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

    public List<AufAbschlag> getTarifAufAbschlaege() {
        return tarifAufAbschlaege;
    }
    public void setTarifAufAbschlaege(List<AufAbschlag> tarifAufAbschlaege) {
        this.tarifAufAbschlaege = tarifAufAbschlaege;
    }

    public Tarifeinschraenkung getTarifeinschraenkung() {
        return tarifeinschraenkung;
    }
    public void setTarifeinschraenkung(Tarifeinschraenkung tarifeinschraenkung) {
        this.tarifeinschraenkung = tarifeinschraenkung;
    }

    public List<Tarifmerkmal> getTarifmerkmale() {
        return tarifmerkmale;
    }
    public void setTarifmerkmale(List<Tarifmerkmal> tarifmerkmale) {
        this.tarifmerkmale = tarifmerkmale;
    }

    public List<Tarifpreisposition> getTarifpreise() {
        return tarifpreise;
    }
    public void setTarifpreise(List<Tarifpreisposition> tarifpreise) {
        this.tarifpreise = tarifpreise;
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
}