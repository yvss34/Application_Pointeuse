package beans;

import java.util.ArrayList;

public class SoutienScolaire {

    private int identifiant;
    private String nom;
    private ArrayList<Eleve> eleves;
    private ArrayList<Dirigeant> dirigeants;
    private ArrayList<Emargement> emargements;
    private ArrayList<Retard> retards;

    public SoutienScolaire(int identifiant, String nom, ArrayList<Eleve> eleves, ArrayList<Dirigeant> dirigeants, ArrayList<Emargement> emargements, ArrayList<Retard> retards) {
        this.identifiant = identifiant;
        this.nom = nom;
        this.eleves = eleves;
        this.dirigeants = dirigeants;
        this.emargements = emargements;
        this.retards = retards;
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

    public ArrayList<Eleve> getEleves() {
        return eleves;
    }

    public void setEleves(ArrayList<Eleve> eleves) {
        this.eleves = eleves;
    }

    public ArrayList<Dirigeant> getDirigeants() {
        return dirigeants;
    }

    public void setDirigeants(ArrayList<Dirigeant> dirigeants) {
        this.dirigeants = dirigeants;
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
}
