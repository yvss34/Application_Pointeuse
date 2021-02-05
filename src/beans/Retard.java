package beans;

import jdk.vm.ci.meta.Local;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Retard extends Emargement{

    private LocalTime retard;

    public Retard(int identifiant, int jour, LocalDateTime dateArrivee, int identifiantEleve, LocalTime retard) {
        super(identifiant, jour, dateArrivee, identifiantEleve);
        this.retard = retard;
    }

    public LocalTime getRetard() {
        return retard;
    }

    public void setRetard(LocalTime retard) {
        this.retard = retard;
    }
}
