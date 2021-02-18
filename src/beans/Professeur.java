package beans;
import java.util.ArrayList;

public class Professeur extends Utilisateur{

    /**
     * Attributs
     */
    private String specialite;
    private ArrayList<Cours> cours;

    /**
     * Constructeurs
     */
    public Professeur(int identifiant, String nom, String prenom, String email, String motDePasse, String specialite, ArrayList<Cours> cours) {
        super(identifiant, nom, prenom, email, motDePasse);
        this.specialite = specialite;
        this.cours = cours;
    }

    /**
     * Getters & Setters
     */

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

    public ArrayList<Cours> getCours() {
        return cours;
    }

    public void setCours(ArrayList<Cours> cours) {
        this.cours = cours;
    }
}
