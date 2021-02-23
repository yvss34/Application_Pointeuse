package beans;

import java.sql.Timestamp;

public class Emargement {

    /**
     * Attributes
     */
    private int identifiant;
    private Timestamp dateArrivee;
    private int identifiantEleve;
    private int identifiantCours;

    /**
     * Constructors
     */
    public Emargement(int identifiant , Timestamp dateArrivee, int identifiantEleve, int identifiantCours) {
    	this.identifiant = identifiant;
        this.dateArrivee = dateArrivee;
        this.identifiantEleve = identifiantEleve;
        this.identifiantCours = identifiantCours;
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

    public Timestamp getDateArrivee() {
        return dateArrivee;
    }

    public void setDateArrivee(Timestamp dateArrivee) {
        this.dateArrivee = dateArrivee;
    }

    public int getIdentifiantEleve() {
        return identifiantEleve;
    }

    public void setIdentifiantEleve(int identifiantEleve) {
        this.identifiantEleve = identifiantEleve;
    }

	public int getIdentifiantCours() {
		return identifiantCours;
	}

	public void setIdentifiantCours(int identifiantCours) {
		this.identifiantCours = identifiantCours;
	}

	@Override
	public String toString() {
		return "Emargement [identifiant=" + identifiant + ", dateArrivee=" + dateArrivee + ", identifiantEleve="
				+ identifiantEleve + ", identifiantCours=" + identifiantCours + "]";
	}
	
	
}
