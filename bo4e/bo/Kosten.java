package bo4e.bo;

import bo4e.enums.Typ;
import bo4e.com.Zeitraum;
import bo4e.com.Kostenblock;
import bo4e.enums.Kostenklasse;
import bo4e.com.Betrag;

import java.util.List;

/**
 * Dieses BO wird zur Übertagung von hierarchischen Kostenstrukturen verwendet.
 * Die Kosten werden dabei in Kostenblöcke und diese wiederum in Kostenpositionen
 * strukturiert.
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/bo/Kosten.svg" type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Kosten JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/bo/Kosten.json>`_
 */
public class Kosten extends Geschaeftsobjekt {
    /**
     * Typ des Geschaeftsobjekts
     */
    private Typ typ = Typ.KOSTEN;
    /**
     * Für diesen Zeitraum wurden die Kosten ermittelt
     */
    private Zeitraum gueltigkeit;
    /**
     * In Kostenblöcken werden Kostenpositionen zusammengefasst. Beispiele: Netzkosten, Umlagen,
     * Steuern etc
     */
    private List<Kostenblock> kostenbloecke;
    /**
     * Klasse der Kosten, beispielsweise Fremdkosten
     */
    private Kostenklasse kostenklasse;
    /**
     * Die Gesamtsumme über alle Kostenblöcke und -positionen
     */
    private List<Betrag> summeKosten;

    public Zeitraum getGueltigkeit() {
        return Gueltigkeit;
    }
    public void setGueltigkeit(Zeitraum gueltigkeit) {
        this.gueltigkeit = gueltigkeit;
    }

    public List<Kostenblock> getKostenbloecke() {
        return Kostenbloecke;
    }
    public void setKostenbloecke(List<Kostenblock> kostenbloecke) {
        this.kostenbloecke = kostenbloecke;
    }

    public Kostenklasse getKostenklasse() {
        return Kostenklasse;
    }
    public void setKostenklasse(Kostenklasse kostenklasse) {
        this.kostenklasse = kostenklasse;
    }

    public List<Betrag> getSummeKosten() {
        return SummeKosten;
    }
    public void setSummeKosten(List<Betrag> summeKosten) {
        this.summeKosten = summeKosten;
    }
}