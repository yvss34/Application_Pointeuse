package beans;

import jdk.vm.ci.meta.Local;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Retard extends Emargement{

    /**
     * Attributs
     */
    private LocalTime retard;

    /**
     * Constructeurs
     */
    public Retard(int identifiant, LocalDateTime dateArrivee, int identifiantEleve, Cours cours, LocalTime retard) {
        super(identifiant, dateArrivee, identifiantEleve, cours);
        this.retard = retard;
    }

    /**
     * Getters & Setters
     */
    public LocalTime getRetard() {
        return retard;
    }

    public void setRetard(LocalTime retard) {
        this.retard = retard;
    }
}
