package bo4e.bo;

import bo4e.enums.Typ;
import bo4e.com.Regionskriterium;
import bo4e.com.Regionskriterium;

import java.util.List;

/**
 * Modellierung einer Region als Menge von Kriterien, die eine Region beschreiben
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/bo/Region.svg" type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Region JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/bo/Region.json>`_
 */
public class Region extends Geschaeftsobjekt {
    /**
     * Typ des Geschaeftsobjekts
     */
    private Typ typ = Typ.REGION;
    /**
     * Bezeichnung der Region
     */
    private String bezeichnung;
    /**
     * Negativliste der Kriterien zur Definition der Region
     */
    private List<Regionskriterium> negativListe;
    /**
     * Positivliste der Kriterien zur Definition der Region
     */
    private List<Regionskriterium> positivListe;

    public String getBezeichnung() {
        return Bezeichnung;
    }
    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public List<Regionskriterium> getNegativListe() {
        return NegativListe;
    }
    public void setNegativListe(List<Regionskriterium> negativListe) {
        this.negativListe = negativListe;
    }

    public List<Regionskriterium> getPositivListe() {
        return PositivListe;
    }
    public void setPositivListe(List<Regionskriterium> positivListe) {
        this.positivListe = positivListe;
    }
}