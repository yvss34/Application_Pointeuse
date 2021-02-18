package beans;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashMap;

public class Eleve extends Utilisateur{

    /**
     * Attributs
     */
    private ArrayList<Emargement> emargements;
    private ArrayList<Retard> retards;

    /**
     * Constructeurs
     */
    public Eleve(int identifiant, String nom, String prenom, String email, String motDePasse, ArrayList<Emargement> emargements, ArrayList<Retard> retards) {
        super(identifiant, nom, prenom, email, motDePasse);
        this.emargements = emargements;
        this.retards = retards;
    }

    /**
     * Getters & Setters
     */
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
}
