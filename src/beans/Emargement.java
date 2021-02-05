package beans;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Emargement {

    private int identifiant;
    private LocalDateTime dateArrivee;
    private int identifiantEleve;

    public Emargement(int identifiant, int jour, LocalDateTime dateArrivee, int identifiantEleve) {
        this.identifiant = identifiant;
        this.dateArrivee = dateArrivee;
        this.identifiantEleve = identifiantEleve;
    }

    public int getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(int identifiant) {
        this.identifiant = identifiant;
    }

    public LocalDateTime getDateArrivee() {
        return dateArrivee;
    }

    public void setDateArrivee(LocalDateTime dateArrivee) {
        this.dateArrivee = dateArrivee;
    }

    public int getIdentifiantEleve() {
        return identifiantEleve;
    }

    public void setIdentifiantEleve(int identifiantEleve) {
        this.identifiantEleve = identifiantEleve;
    }
}
