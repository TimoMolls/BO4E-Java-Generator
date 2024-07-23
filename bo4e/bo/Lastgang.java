package bo4e.bo;

import bo4e.enums.Typ;
import bo4e.enums.Mengeneinheit;
import bo4e.enums.Sparte;
import bo4e.com.Zeitreihenwert;
import bo4e.com.Menge;

import java.util.List;

/**
 * Modell zur Abbildung eines Lastganges;
 * In diesem Modell werden die Messwerte mit einem vollständigen Zeitintervall
 * (zeit_intervall_laenge) angegeben und es bietet daher eine hohe Flexibilität in der
 * Übertragung jeglicher zeitlich veränderlicher Messgrössen.
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/bo/Lastgang.svg" type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Lastgang JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/bo/Lastgang.json>`_
 */
public class Lastgang extends Geschaeftsobjekt {
    /**
     * Typ des Geschaeftsobjekts
     */
    private final Typ typ = Typ.LASTGANG;
    /**
     * Marktlokation, zu der der Lastgang gehört
     */
    private Marktlokation marktlokation;
    /**
     * Definition der gemessenen Größe anhand ihrer Einheit
     */
    private Mengeneinheit messgroesse;
    /**
     * Marktlokation, zu der der Lastgang gehört
     */
    private Messlokation messlokation;
    /**
     * Die OBIS-Kennzahl für den Wert, die festlegt, welche Größe mit dem Stand gemeldet wird,
     * z.B. '1-0:1.8.1'
     */
    private String obisKennzahl;
    /**
     * Angabe, ob es sich um einen Gas- oder Stromlastgang handelt
     */
    private Sparte sparte;
    /**
     * Versionsnummer des Lastgangs
     */
    private String version;
    /**
     * Die im Lastgang enthaltenen Messwerte
     */
    private List<Zeitreihenwert> werte;
    private Menge zeitIntervallLaenge;

    public Lastgang() {
    }

    private Lastgang(LastgangBuilder builder) {
        super(builder);
        this.marktlokation = builder.marktlokation;
        this.messgroesse = builder.messgroesse;
        this.messlokation = builder.messlokation;
        this.obisKennzahl = builder.obisKennzahl;
        this.sparte = builder.sparte;
        this.version = builder.version;
        this.werte = builder.werte;
        this.zeitIntervallLaenge = builder.zeitIntervallLaenge;
    }

    public Typ getTyp() {
        return typ;
    }

    public Marktlokation getMarktlokation() {
        return marktlokation;
    }

    public void setMarktlokation(Marktlokation marktlokation) {
        this.marktlokation = marktlokation;
    }

    public Mengeneinheit getMessgroesse() {
        return messgroesse;
    }

    public void setMessgroesse(Mengeneinheit messgroesse) {
        this.messgroesse = messgroesse;
    }

    public Messlokation getMesslokation() {
        return messlokation;
    }

    public void setMesslokation(Messlokation messlokation) {
        this.messlokation = messlokation;
    }

    public String getObisKennzahl() {
        return obisKennzahl;
    }

    public void setObisKennzahl(String obisKennzahl) {
        this.obisKennzahl = obisKennzahl;
    }

    public Sparte getSparte() {
        return sparte;
    }

    public void setSparte(Sparte sparte) {
        this.sparte = sparte;
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

    public Menge getZeitIntervallLaenge() {
        return zeitIntervallLaenge;
    }

    public void setZeitIntervallLaenge(Menge zeitIntervallLaenge) {
        this.zeitIntervallLaenge = zeitIntervallLaenge;
    }

    public static class LastgangBuilder extends GeschaeftsobjektBuilder {
        /**
         * Marktlokation, zu der der Lastgang gehört
         */
        private Marktlokation marktlokation;
        /**
         * Definition der gemessenen Größe anhand ihrer Einheit
         */
        private Mengeneinheit messgroesse;
        /**
         * Marktlokation, zu der der Lastgang gehört
         */
        private Messlokation messlokation;
        /**
         * Die OBIS-Kennzahl für den Wert, die festlegt, welche Größe mit dem Stand gemeldet wird,
         * z.B. '1-0:1.8.1'
         */
        private String obisKennzahl;
        /**
         * Angabe, ob es sich um einen Gas- oder Stromlastgang handelt
         */
        private Sparte sparte;
        /**
         * Versionsnummer des Lastgangs
         */
        private String version;
        /**
         * Die im Lastgang enthaltenen Messwerte
         */
        private List<Zeitreihenwert> werte;
        private Menge zeitIntervallLaenge;
    
        public Marktlokation getMarktlokation() {
            return marktlokation;
        }
    
        public LastgangBuilder setMarktlokation(Marktlokation marktlokation) {
            this.marktlokation = marktlokation;
            return this;
        }
    
        public Mengeneinheit getMessgroesse() {
            return messgroesse;
        }
    
        public LastgangBuilder setMessgroesse(Mengeneinheit messgroesse) {
            this.messgroesse = messgroesse;
            return this;
        }
    
        public Messlokation getMesslokation() {
            return messlokation;
        }
    
        public LastgangBuilder setMesslokation(Messlokation messlokation) {
            this.messlokation = messlokation;
            return this;
        }
    
        public String getObisKennzahl() {
            return obisKennzahl;
        }
    
        public LastgangBuilder setObisKennzahl(String obisKennzahl) {
            this.obisKennzahl = obisKennzahl;
            return this;
        }
    
        public Sparte getSparte() {
            return sparte;
        }
    
        public LastgangBuilder setSparte(Sparte sparte) {
            this.sparte = sparte;
            return this;
        }
    
        public String getVersion() {
            return version;
        }
    
        public LastgangBuilder setVersion(String version) {
            this.version = version;
            return this;
        }
    
        public List<Zeitreihenwert> getWerte() {
            return werte;
        }
    
        public LastgangBuilder setWerte(List<Zeitreihenwert> werte) {
            this.werte = werte;
            return this;
        }
    
        public Menge getZeitIntervallLaenge() {
            return zeitIntervallLaenge;
        }
    
        public LastgangBuilder setZeitIntervallLaenge(Menge zeitIntervallLaenge) {
            this.zeitIntervallLaenge = zeitIntervallLaenge;
            return this;
        }
    
        public Lastgang build() {
            return new Lastgang(this);
        }
    }
}