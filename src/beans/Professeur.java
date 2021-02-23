package beans;
import java.util.ArrayList;

public class Professeur extends Utilisateur{

    /**
     * Attributes
     */
    private ArrayList<Cours> cours;

    /**
     * Constructors
     */
    public Professeur(int identifiant,String nom, String prenom, String email, String motDePasse,ArrayList<Cours> cours) {
        super(identifiant,nom, prenom, email, motDePasse);
        this.cours = cours;
    }

    /**
     * Getters & Setters
     */

    public ArrayList<Cours> getCours() {
        return cours;
    }

    public void setCours(ArrayList<Cours> cours) {
        this.cours = cours;
    }

	@Override
	public String toString() {
		return "Professeur [cours=" + cours + ", toString()=" + super.toString() + "]";
	}
    
    
}
