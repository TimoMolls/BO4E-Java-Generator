package com.example.bo4e.com;

import com.example.bo4e.enums.Messwertstatus;
import com.example.bo4e.enums.Messwertstatuszusatz;

/**
 * Abbildung eines Zeitreihenwertes bestehend aus Zeitraum, Wert und Statusinformationen.
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/Zeitreihenwert.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Zeitreihenwert JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/Hochfrequenz/BO4E-Schemas/v202401.0.0-/src/bo4e_schemas/com/Zeitreihenwert.json>`_
 */
public class Zeitreihenwert extends COM {
    private Messwertstatus status;
    private Messwertstatuszusatz statuszusatz;
    private String wert;
    private Zeitspanne zeitspanne;

    public Messwertstatus getStatus() { return status; }
    public void setStatus(Messwertstatus value) { this.status = value; }

    public Messwertstatuszusatz getStatuszusatz() { return statuszusatz; }
    public void setStatuszusatz(Messwertstatuszusatz value) { this.statuszusatz = value; }

    public String getWert() { return wert; }
    public void setWert(String value) { this.wert = value; }

    public Zeitspanne getZeitspanne() { return zeitspanne; }
    public void setZeitspanne(Zeitspanne value) { this.zeitspanne = value; }

}
