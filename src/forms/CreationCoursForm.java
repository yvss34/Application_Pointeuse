package forms;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import beans.Cours;
import beans.Emargement;
import dao.CoursDao;
import dao.DaoFactory;
import dao.EmargementDao;
import dao.ProfesseurDao;

public class CreationCoursForm {
	
	private String              resultat;
    private Map<String, String> erreurs      = new HashMap<String, String>();
	
    public String getResultat() {
        return resultat;
    }

    public Map<String, String> getErreurs() {
        return erreurs;
    }
    
	public void creationCours(HttpServletRequest request,int identifiantProfesseur) {
		
		
		
        try {	
        	
        	String nom = getValeurChamp(request,"nom");
    		
    		int annee = Integer.parseInt(getValeurChamp(request,"annee")) - 1900;
    		int mois =Integer.parseInt(getValeurChamp(request,"mois")) -1;
    		int jour =Integer.parseInt(getValeurChamp(request,"jour"));
    		int heure =Integer.parseInt(getValeurChamp(request,"heure"));
    		int minute =Integer.parseInt(getValeurChamp(request,"minute"));
    		
    		Timestamp horaires = new Timestamp(annee,mois,jour,heure,minute,0,0);
            Cours cours = new Cours(0, nom, horaires, null,identifiantProfesseur);
       
            DaoFactory daoFactory = DaoFactory.getInstance();
	        
		    CoursDao coursDao;
		    coursDao = daoFactory.getCoursDao();
		    coursDao.ajouter(cours);
        } catch ( Exception e ) {
            setErreur( "validation"," " );
        }
		
        if ( erreurs.isEmpty() ) {
            resultat = "Ajout du cours avec succès.";
        } else {
            resultat = "Échec d'ajout.";
        }
	}

    /*
     * Ajoute un message correspondant au champ spécifié à la map des erreurs.
     */
    private void setErreur( String champ, String message ) {
        erreurs.put( champ, message );
    }
    
    /*
     * Méthode utilitaire qui retourne null si un champ est vide, et son contenu
     * sinon.
     */
    private static String getValeurChamp( HttpServletRequest request, String nomChamp ) {
        String valeur = request.getParameter( nomChamp );
        if ( valeur == null || valeur.trim().length() == 0 ) {
            return null;
        } else {
            return valeur;
        }
    }
}
