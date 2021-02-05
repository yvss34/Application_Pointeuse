package beans;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashMap;

public class Eleve extends Utilisateur{

    /**
     * Une liste d'horraires d'arrivées en fonction des jours de la semaine
     */
    private HashMap<Integer, ArrayList<LocalTime>> emploiDuTemps;

    public Eleve(int identifiant, String nom, String prenom, HashMap<Integer, ArrayList<LocalTime>> emploiDuTemps) {
        super(identifiant, nom, prenom);
        this.emploiDuTemps = emploiDuTemps;
    }

    public HashMap<Integer, ArrayList<LocalTime>> getEmploiDuTemps() {
        return emploiDuTemps;
    }

    public void setEmploiDuTemps(HashMap<Integer, ArrayList<LocalTime>> emploiDuTemps) {
        this.emploiDuTemps = emploiDuTemps;
    }
}
