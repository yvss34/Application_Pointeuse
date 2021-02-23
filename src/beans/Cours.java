package beans;

import java.sql.Timestamp;
import java.util.ArrayList;

public class Cours {

    /**
     * Attributes
     */
    private int identifiant;
    private String nom;
    private Timestamp horaires;
    private ArrayList<Emargement> emargements;
    private int identifiantProfesseur;

    /**
     * Constructors
     */
    public Cours(int identifiant, String nom, Timestamp horaires, ArrayList<Emargement> emargements,int identifiantProfesseur) {
        this.identifiant = identifiant;
        this.nom = nom;
        this.horaires = horaires;
        this.emargements = emargements;
        this.identifiantProfesseur = identifiantProfesseur;
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

    public ArrayList<Emargement> getEmargements() {
        return emargements;
    }

    public void setEmargements(ArrayList<Emargement> emargements) {
        this.emargements = emargements;
    }

    public Timestamp getHoraires() {
        return horaires;
    }

    public void setHoraires(Timestamp horaires) {
        this.horaires = horaires;
    }

	public int getIdentifiantProfesseur() {
		return identifiantProfesseur;
	}

	public void setIdentifiantProfesseur(int identifiantProfesseur) {
		this.identifiantProfesseur = identifiantProfesseur;
	}

	@Override
	public String toString() {
		return "Cours [identifiant=" + identifiant + ", nom=" + nom + ", horaires=" + horaires + ", emargements="
				+ emargements + ", identifiantProfesseur=" + identifiantProfesseur + "]";
	}
    
    
}
