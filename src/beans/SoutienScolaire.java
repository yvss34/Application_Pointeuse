package beans;

import java.util.ArrayList;

public class SoutienScolaire {

    /**
     * Attributes
     */
    private int identifiant;
    private String nom;
    private ArrayList<Eleve> eleves;
    private ArrayList<Dirigeant> dirigeants;
    private ArrayList<Professeur> professeurs;
    private ArrayList<Cours> cours;

    /**
     * Constructors
     */
    public SoutienScolaire(int identifiant, String nom, ArrayList<Eleve> eleves, ArrayList<Dirigeant> dirigeants, ArrayList<Professeur> professeurs, ArrayList<Cours> cours) {
        this.identifiant = identifiant;
        this.nom = nom;
        this.eleves = eleves;
        this.dirigeants = dirigeants;
        this.professeurs = professeurs;
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

    public ArrayList<Professeur> getProfesseurs() {
        return professeurs;
    }

    public void setProfesseurs(ArrayList<Professeur> professeurs) {
        this.professeurs = professeurs;
    }

    public ArrayList<Cours> getCours() {
        return cours;
    }

    public void setCours(ArrayList<Cours> cours) {
        this.cours = cours;
    }
}
