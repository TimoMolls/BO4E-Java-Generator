package bo4e.com;

import bo4e.enums.Tarifregionskriterium;

import java.util.List;

/**
 * Mit dieser Komponente können Kriterien und deren Werte definiert werden
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/KriteriumWert.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `KriteriumWert JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/com/KriteriumWert.json>`_
 */
public class KriteriumWert extends COM {
    /**
     * Hier steht, für welches Kriterium der Wert gilt. Z.B. Postleitzahlen
     */
    private Tarifregionskriterium kriterium;
    /**
     * Ein Wert, passend zum Kriterium. Z.B. eine Postleitzahl.
     */
    private String wert;

    public Tarifregionskriterium getKriterium() {
        return Kriterium;
    }
    public void setKriterium(Tarifregionskriterium kriterium) {
        this.kriterium = kriterium;
    }

    public String getWert() {
        return Wert;
    }
    public void setWert(String wert) {
        this.wert = wert;
    }
}