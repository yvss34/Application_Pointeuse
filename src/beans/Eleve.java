package beans;


import java.util.ArrayList;


public class Eleve extends Utilisateur{

    /**
     * Attributes
     */
    private ArrayList<Emargement> emargements;

    /**
     * Constructors
     */
    public Eleve(int identifiant,String nom, String prenom, String email, String motDePasse, ArrayList<Emargement> emargements) {
        super(identifiant,nom, prenom, email, motDePasse);
        this.emargements = emargements;
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

	@Override
	public String toString() {
		return "Eleve [emargements=" + emargements + ", toString()=" + super.toString() + "]";
	}

    
    
}
