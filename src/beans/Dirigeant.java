package beans;

public class Dirigeant extends Utilisateur{

    /**
     * Constructors
     */
    public Dirigeant(int identifiant,String nom, String prenom, String email, String motDePasse) {
        super(identifiant,nom, prenom, email, motDePasse);
    }

	@Override
	public String toString() {
		return "Dirigeant [toString()=" + super.toString() + "]";
	}
    
    
}
