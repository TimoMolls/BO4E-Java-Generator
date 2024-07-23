package bo4e.com;

import bo4e.enums.Mengeneinheit;
import bo4e.ZusatzAttribut;

import java.time.OffsetDateTime;
import java.util.List;

/**
 * Diese Komponente wird zur Abbildung von Zeiträumen in Form von Dauern oder der Angabe von
 * Start und Ende verwendet.
 * Es muss daher eine der drei Möglichkeiten angegeben sein:
 * - Einheit und Dauer oder
 * - Zeitraum: Startdatum bis Enddatum oder
 * - Zeitraum: Startzeitpunkt (Datum und Uhrzeit) bis Endzeitpunkt (Datum und Uhrzeit)
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/Zeitraum.svg" type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Zeitraum JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/com/Zeitraum.json>`_
 */
public class Zeitraum extends COM {
    private Double dauer;
    private Mengeneinheit einheit;
    private OffsetDateTime enddatum;
    private OffsetDateTime endzeitpunkt;
    private OffsetDateTime startdatum;
    private OffsetDateTime startzeitpunkt;

    public Zeitraum() {
    }

    private Zeitraum(ZeitraumBuilder builder) {
        super(builder);
        this.dauer = builder.dauer;
        this.einheit = builder.einheit;
        this.enddatum = builder.enddatum;
        this.endzeitpunkt = builder.endzeitpunkt;
        this.startdatum = builder.startdatum;
        this.startzeitpunkt = builder.startzeitpunkt;
    }

    public Double getDauer() {
        return dauer;
    }

    public void setDauer(Double dauer) {
        this.dauer = dauer;
    }

    public Mengeneinheit getEinheit() {
        return einheit;
    }

    public void setEinheit(Mengeneinheit einheit) {
        this.einheit = einheit;
    }

    public OffsetDateTime getEnddatum() {
        return enddatum;
    }

    public void setEnddatum(OffsetDateTime enddatum) {
        this.enddatum = enddatum;
    }

    public OffsetDateTime getEndzeitpunkt() {
        return endzeitpunkt;
    }

    public void setEndzeitpunkt(OffsetDateTime endzeitpunkt) {
        this.endzeitpunkt = endzeitpunkt;
    }

    public OffsetDateTime getStartdatum() {
        return startdatum;
    }

    public void setStartdatum(OffsetDateTime startdatum) {
        this.startdatum = startdatum;
    }

    public OffsetDateTime getStartzeitpunkt() {
        return startzeitpunkt;
    }

    public void setStartzeitpunkt(OffsetDateTime startzeitpunkt) {
        this.startzeitpunkt = startzeitpunkt;
    }

    public static class ZeitraumBuilder extends COMBuilder {
        private Double dauer;
        private Mengeneinheit einheit;
        private OffsetDateTime enddatum;
        private OffsetDateTime endzeitpunkt;
        private OffsetDateTime startdatum;
        private OffsetDateTime startzeitpunkt;
    
        public Double getDauer() {
            return dauer;
        }
    
        public ZeitraumBuilder setDauer(Double dauer) {
            this.dauer = dauer;
            return this;
        }
    
        public Mengeneinheit getEinheit() {
            return einheit;
        }
    
        public ZeitraumBuilder setEinheit(Mengeneinheit einheit) {
            this.einheit = einheit;
            return this;
        }
    
        public OffsetDateTime getEnddatum() {
            return enddatum;
        }
    
        public ZeitraumBuilder setEnddatum(OffsetDateTime enddatum) {
            this.enddatum = enddatum;
            return this;
        }
    
        public OffsetDateTime getEndzeitpunkt() {
            return endzeitpunkt;
        }
    
        public ZeitraumBuilder setEndzeitpunkt(OffsetDateTime endzeitpunkt) {
            this.endzeitpunkt = endzeitpunkt;
            return this;
        }
    
        public OffsetDateTime getStartdatum() {
            return startdatum;
        }
    
        public ZeitraumBuilder setStartdatum(OffsetDateTime startdatum) {
            this.startdatum = startdatum;
            return this;
        }
    
        public OffsetDateTime getStartzeitpunkt() {
            return startzeitpunkt;
        }
    
        public ZeitraumBuilder setStartzeitpunkt(OffsetDateTime startzeitpunkt) {
            this.startzeitpunkt = startzeitpunkt;
            return this;
        }
    
        public ZeitraumBuilder setId(String id) {
            super.setId(id);
            return this;
        }
    
        public ZeitraumBuilder setZusatzAttribute(List<ZusatzAttribut> zusatzAttribute) {
            super.setZusatzAttribute(zusatzAttribute);
            return this;
        }
    
        public Zeitraum build() {
            return new Zeitraum(this);
        }
    }
}