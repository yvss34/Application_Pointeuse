package beans;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Emargement {

    /**
     * Attributs
     */
    private int identifiant;
    private LocalDateTime dateArrivee;
    private int identifiantEleve;
    private Cours cours;

    /**
     * Constructeurs
     */
    public Emargement(int identifiant, LocalDateTime dateArrivee, int identifiantEleve, Cours cours) {
        this.identifiant = identifiant;
        this.dateArrivee = dateArrivee;
        this.identifiantEleve = identifiantEleve;
        this.cours = cours;
    }

    /**
     * Getters & Setters
     */
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

    public Cours getCours() {
        return cours;
    }

    public void setCours(Cours cours) {
        this.cours = cours;
    }
}
