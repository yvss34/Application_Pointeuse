package beans;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Cours {

    /**
     * Attributs
     */
    private static int nbrCours = 0;
    private int identifiant;
    private String nom;
    private LocalDateTime horaires;
    private ArrayList<Emargement> emargements;
    private ArrayList<Retard> retards;

    /**
     * Constructeurs
     */
    public Cours(int identifiant, String nom, LocalDateTime horaires, ArrayList<Emargement> emargements, ArrayList<Retard> retards) {
        this.identifiant = identifiant;
        this.nom = nom;
        this.horaires = horaires;
        this.emargements = emargements;
        this.retards = retards;
    }

    /**
     * Getters & Setters
     */
    public static int getNbrCours() {
        return nbrCours;
    }

    public static void setNbrCours(int nbrCours) {
        Cours.nbrCours = nbrCours;
    }

    public int getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(int identifiant) {
        this.identifiant = identifiant;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public ArrayList<Emargement> getEmargements() {
        return emargements;
    }

    public void setEmargements(ArrayList<Emargement> emargements) {
        this.emargements = emargements;
    }

    public ArrayList<Retard> getRetards() {
        return retards;
    }

    public void setRetards(ArrayList<Retard> retards) {
        this.retards = retards;
    }

    public LocalDateTime getHoraires() {
        return horaires;
    }

    public void setHoraires(LocalDateTime horaires) {
        this.horaires = horaires;
    }
}
