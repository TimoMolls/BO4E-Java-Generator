package bo4e.bo;

import bo4e.enums.Typ;
import bo4e.enums.Mengeneinheit;
import bo4e.enums.Medium;
import bo4e.enums.Messart;
import bo4e.enums.Messgroesse;
import bo4e.com.Zeitreihenwert;
import bo4e.enums.Wertermittlungsverfahren;

import java.util.List;

/**
 * Abbildung einer allgemeinen Zeitreihe mit einem Wertvektor.
 * Die Werte können mit wahlfreier zeitlicher Distanz im Vektor abgelegt sein.
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/bo/Zeitreihe.svg" type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Zeitreihe JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/bo/Zeitreihe.json>`_
 */
public class Zeitreihe extends Geschaeftsobjekt {
    /**
     * Typ des Geschaeftsobjekts
     */
    private Typ typ = Typ.ZEITREIHE;
    /**
     * Beschreibt die Verwendung der Zeitreihe
     */
    private String beschreibung;
    /**
     * Bezeichnung für die Zeitreihe
     */
    private String bezeichnung;
    /**
     * Alle Werte in der Tabelle haben die Einheit, die hier angegeben ist
     */
    private Mengeneinheit einheit;
    /**
     * Medium, das gemessen wurde (z.B. Wasser, Dampf, Strom, Gas)
     */
    private Medium medium;
    /**
     * Beschreibt die Art der Messung (z.B. aktueller Wert, mittlerer Wert, maximaler Wert)
     */
    private Messart messart;
    /**
     * Beschreibt, was gemessen wurde (z.B. Strom, Spannung, Wirkleistung, Scheinleistung)
     */
    private Messgroesse messgroesse;
    /**
     * Version der Zeitreihe
     */
    private String version;
    /**
     * Hier liegen jeweils die Werte
     */
    private List<Zeitreihenwert> werte;
    /**
     * Kennzeichnung, wie die Werte entstanden sind, z.B. durch Messung
     */
    private Wertermittlungsverfahren wertherkunft;

    public String getBeschreibung() {
        return beschreibung;
    }
    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }
    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public Mengeneinheit getEinheit() {
        return einheit;
    }
    public void setEinheit(Mengeneinheit einheit) {
        this.einheit = einheit;
    }

    public Medium getMedium() {
        return medium;
    }
    public void setMedium(Medium medium) {
        this.medium = medium;
    }

    public Messart getMessart() {
        return messart;
    }
    public void setMessart(Messart messart) {
        this.messart = messart;
    }

    public Messgroesse getMessgroesse() {
        return messgroesse;
    }
    public void setMessgroesse(Messgroesse messgroesse) {
        this.messgroesse = messgroesse;
    }

    public String getVersion() {
        return version;
    }
    public void setVersion(String version) {
        this.version = version;
    }

    public List<Zeitreihenwert> getWerte() {
        return werte;
    }
    public void setWerte(List<Zeitreihenwert> werte) {
        this.werte = werte;
    }

    public Wertermittlungsverfahren getWertherkunft() {
        return wertherkunft;
    }
    public void setWertherkunft(Wertermittlungsverfahren wertherkunft) {
        this.wertherkunft = wertherkunft;
    }
}