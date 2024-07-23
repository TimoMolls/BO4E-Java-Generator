package bo4e.com;

import bo4e.enums.BDEWArtikelnummer;
import bo4e.enums.Kalkulationsmethode;
import bo4e.enums.Mengeneinheit;
import bo4e.enums.Leistungstyp;
import bo4e.enums.Waehrungseinheit;
import bo4e.enums.Tarifzeit;
import bo4e.enums.Mengeneinheit;
import bo4e.enums.Bemessungsgroesse;

import java.util.List;

/**
 * Preis für eine definierte Lieferung oder Leistung innerhalb eines Preisblattes
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/Preisposition.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Preisposition JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/com/Preisposition.json>`_
 */
public class Preisposition extends COM {
    /**
     * Mit der Menge der hier angegebenen Größe wird die Staffelung/Zonung durchgeführt. Z.B.
     * Vollbenutzungsstunden
     */
    private BDEWArtikelnummer bdewArtikelnummer;
    /**
     * Das Modell, das der Preisbildung zugrunde liegt
     */
    private Kalkulationsmethode berechnungsmethode;
    /**
     * Hier wird festgelegt, auf welche Bezugsgrösse sich der Preis bezieht, z.B. kWh oder Stück
     */
    private Mengeneinheit bezugsgroesse;
    /**
     * Der Anteil der Menge der Blindarbeit in Prozent von der Wirkarbeit, für die keine
     * Abrechnung erfolgt
     */
    private Double freimengeBlindarbeit;
    /**
     * gruppenartikel_id: Optional[str] = None
     */
    private Double freimengeLeistungsfaktor;
    /**
     * Übergeordnete Gruppen-ID, die sich ggf. auf die Artikel-ID in der Preisstaffel bezieht
     */
    private String gruppenartikelId;
    /**
     * Bezeichnung für die in der Position abgebildete Leistungserbringung
     */
    private String leistungsbezeichnung;
    /**
     * Standardisierte Bezeichnung für die abgerechnete Leistungserbringung
     */
    private Leistungstyp leistungstyp;
    /**
     * Festlegung, mit welcher Preiseinheit abgerechnet wird, z.B. Ct. oder €
     */
    private Waehrungseinheit preiseinheit;
    /**
     * Preisstaffeln, die zu dieser Preisposition gehören
     */
    private List<Preisstaffel> preisstaffeln;
    /**
     * Festlegung, für welche Tarifzeit der Preis hier festgelegt ist
     */
    private Tarifzeit tarifzeit;
    /**
     * Festlegung, für welche Tarifzeit der Preis hier festgelegt ist
     */
    private Mengeneinheit zeitbasis;
    /**
     * Mit der Menge der hier angegebenen Größe wird die Staffelung/Zonung durchgeführt. Z.B.
     * Vollbenutzungsstunden
     */
    private Bemessungsgroesse zonungsgroesse;

    public BDEWArtikelnummer getBdewArtikelnummer() {
        return bdewArtikelnummer;
    }
    public void setBdewArtikelnummer(BDEWArtikelnummer bdewArtikelnummer) {
        this.bdewArtikelnummer = bdewArtikelnummer;
    }

    public Kalkulationsmethode getBerechnungsmethode() {
        return berechnungsmethode;
    }
    public void setBerechnungsmethode(Kalkulationsmethode berechnungsmethode) {
        this.berechnungsmethode = berechnungsmethode;
    }

    public Mengeneinheit getBezugsgroesse() {
        return bezugsgroesse;
    }
    public void setBezugsgroesse(Mengeneinheit bezugsgroesse) {
        this.bezugsgroesse = bezugsgroesse;
    }

    public Double getFreimengeBlindarbeit() {
        return freimengeBlindarbeit;
    }
    public void setFreimengeBlindarbeit(Double freimengeBlindarbeit) {
        this.freimengeBlindarbeit = freimengeBlindarbeit;
    }

    public Double getFreimengeLeistungsfaktor() {
        return freimengeLeistungsfaktor;
    }
    public void setFreimengeLeistungsfaktor(Double freimengeLeistungsfaktor) {
        this.freimengeLeistungsfaktor = freimengeLeistungsfaktor;
    }

    public String getGruppenartikelId() {
        return gruppenartikelId;
    }
    public void setGruppenartikelId(String gruppenartikelId) {
        this.gruppenartikelId = gruppenartikelId;
    }

    public String getLeistungsbezeichnung() {
        return leistungsbezeichnung;
    }
    public void setLeistungsbezeichnung(String leistungsbezeichnung) {
        this.leistungsbezeichnung = leistungsbezeichnung;
    }

    public Leistungstyp getLeistungstyp() {
        return leistungstyp;
    }
    public void setLeistungstyp(Leistungstyp leistungstyp) {
        this.leistungstyp = leistungstyp;
    }

    public Waehrungseinheit getPreiseinheit() {
        return preiseinheit;
    }
    public void setPreiseinheit(Waehrungseinheit preiseinheit) {
        this.preiseinheit = preiseinheit;
    }

    public List<Preisstaffel> getPreisstaffeln() {
        return preisstaffeln;
    }
    public void setPreisstaffeln(List<Preisstaffel> preisstaffeln) {
        this.preisstaffeln = preisstaffeln;
    }

    public Tarifzeit getTarifzeit() {
        return tarifzeit;
    }
    public void setTarifzeit(Tarifzeit tarifzeit) {
        this.tarifzeit = tarifzeit;
    }

    public Mengeneinheit getZeitbasis() {
        return zeitbasis;
    }
    public void setZeitbasis(Mengeneinheit zeitbasis) {
        this.zeitbasis = zeitbasis;
    }

    public Bemessungsgroesse getZonungsgroesse() {
        return zonungsgroesse;
    }
    public void setZonungsgroesse(Bemessungsgroesse zonungsgroesse) {
        this.zonungsgroesse = zonungsgroesse;
    }
}