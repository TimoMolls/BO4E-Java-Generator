package bo4e.bo;

import bo4e.enums.Typ;
import bo4e.enums.Marktrolle;
import bo4e.enums.Rollencodetyp;
import bo4e.enums.Sparte;

import java.util.List;

/**
 * Objekt zur Aufnahme der Information zu einem Marktteilnehmer
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/bo/Marktteilnehmer.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Marktteilnehmer JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/bo/Marktteilnehmer.json>`_
 */
public class Marktteilnehmer extends Geschaeftsobjekt {
    /**
     * Typ des Geschaeftsobjekts
     */
    private Typ typ = Typ.MARKTTEILNEHMER;
    /**
     * Der zu diesem Marktteilnehmer gehörende Geschäftspartner
     */
    private Geschaeftspartner geschaeftspartner;
    /**
     * Die 1:1-Kommunikationsadresse des Marktteilnehmers. Diese wird in der Marktkommunikation
     * verwendet. Konkret kann dies eine eMail-Adresse oder ein AS4-Endpunkt sein.
     */
    private List<String> makoadresse;
    /**
     * Gibt im Klartext die Bezeichnung der Marktrolle an
     */
    private Marktrolle marktrolle;
    /**
     * Gibt die Codenummer der Marktrolle an
     */
    private String rollencodenummer;
    /**
     * Gibt den Typ des Codes an
     */
    private Rollencodetyp rollencodetyp;
    /**
     * Sparte des Marktteilnehmers, z.B. Gas oder Strom
     */
    private Sparte sparte;

    public Typ getTyp() {
        return typ;
    }

    public Geschaeftspartner getGeschaeftspartner() {
        return geschaeftspartner;
    }
    public void setGeschaeftspartner(Geschaeftspartner geschaeftspartner) {
        this.geschaeftspartner = geschaeftspartner;
    }

    public List<String> getMakoadresse() {
        return makoadresse;
    }
    public void setMakoadresse(List<String> makoadresse) {
        this.makoadresse = makoadresse;
    }

    public Marktrolle getMarktrolle() {
        return marktrolle;
    }
    public void setMarktrolle(Marktrolle marktrolle) {
        this.marktrolle = marktrolle;
    }

    public String getRollencodenummer() {
        return rollencodenummer;
    }
    public void setRollencodenummer(String rollencodenummer) {
        this.rollencodenummer = rollencodenummer;
    }

    public Rollencodetyp getRollencodetyp() {
        return rollencodetyp;
    }
    public void setRollencodetyp(Rollencodetyp rollencodetyp) {
        this.rollencodetyp = rollencodetyp;
    }

    public Sparte getSparte() {
        return sparte;
    }
    public void setSparte(Sparte sparte) {
        this.sparte = sparte;
    }
}