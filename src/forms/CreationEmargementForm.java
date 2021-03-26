package forms;

import java.sql.Timestamp;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import beans.*;
import dao.DaoFactory;
import dao.EleveDao;
import dao.EmargementDao;

/**
 * Contr�leur du formulaire de cr�ation d'un emargement
 */
public class CreationEmargementForm {

	private String              resultat;
    private Map<String, String> erreurs      = new HashMap<String, String>();
	
    public String getResultat() {
        return resultat;
    }

    public Map<String, String> getErreurs() {
        return erreurs;
    }
    
    
    /**
     * Ajoute un emargement dans la BDD, si les informations sont correctes
     * @param identifiantEleve, identifiant de l'eleve qui �marge
     * @param identifiantCours, identifiant du cours
     */
	public void creationEmargement(int identifiantEleve, int identifiantCours) {
		
        try {
        	
        	Timestamp timestamp = new Timestamp(System.currentTimeMillis());
            Emargement emargement = new Emargement(0,timestamp,identifiantEleve,identifiantCours);
            
            DaoFactory daoFactory = DaoFactory.getInstance();
	        
		    EmargementDao emargementDao;
		    emargementDao = daoFactory.getEmargementDao();
		    emargementDao.ajouter(emargement);
        } catch ( Exception e ) {
            setErreur( "validation"," " );
        }
		
        if ( erreurs.isEmpty() ) {
            resultat = "Emargement avec succ�s.";
        } else {
            resultat = "�chec de l'emargement.";
        }
	}

    /*
     * Ajoute un message correspondant au champ sp�cifi� � la map des erreurs.
     */
    private void setErreur( String champ, String message ) {
        erreurs.put( champ, message );
    }
}
