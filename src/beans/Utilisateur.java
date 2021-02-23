package beans;

public class Utilisateur {

    /**
     * Attributes
     */
    private int identifiant;
    private String nom;
    private String prenom;
    private String email;
    private String motDePasse;

    /**
     * Constructors
     */

    public Utilisateur(int identifiant, String nom, String prenom, String email, String motDePasse) {
    	this.identifiant = identifiant;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.motDePasse = motDePasse;
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

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }

	@Override
	public String toString() {
		return "Utilisateur [identifiant=" + identifiant + ", nom=" + nom + ", prenom=" + prenom + ", email=" + email
				+ ", motDePasse=" + motDePasse + "]";
	}
    
    
}
