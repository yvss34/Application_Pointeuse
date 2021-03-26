package forms;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import beans.*;
import dao.DaoFactory;
import dao.DirigeantDao;
import dao.EleveDao;
import dao.ProfesseurDao;

/**
 * Contrôleur du formulaire de Login
 */
public final class ConnexionForm {
    private static final String CHAMP_EMAIL  = "email";
    private static final String CHAMP_PASS   = "motdepasse";

    private String              resultat;
    private Map<String, String> erreurs      = new HashMap<String, String>();

    private Eleve eleve;
    private Professeur professeur;
    private Dirigeant dirigeant;
    
    public String getResultat() {
        return resultat;
    }

    public Map<String, String> getErreurs() {
        return erreurs;
    }

    
    public Eleve getEleve() {
		return eleve;
	}

	public void setEleve(Eleve eleve) {
		this.eleve = eleve;
	}

	public Professeur getProfesseur() {
		return professeur;
	}

	public void setProfesseur(Professeur professeur) {
		this.professeur = professeur;
	}

	public Dirigeant getDirigeant() {
		return dirigeant;
	}

	public void setDirigeant(Dirigeant dirigeant) {
		this.dirigeant = dirigeant;
	}

	/**
	 * 
	 * @return l'utilisateur si la connexion est un succes, null sinon
	 */
	public Utilisateur connecterUtilisateur( HttpServletRequest request ) {
        /* Récupération des champs du formulaire */
        String email = getValeurChamp( request, CHAMP_EMAIL );
        String motDePasse = getValeurChamp( request, CHAMP_PASS );

        /* Validation du champ email. */
        try {
            validationEmail( email );
        } catch ( Exception e ) {
            setErreur( CHAMP_EMAIL, e.getMessage() );
        }

        /* Validation du champ mot de passe. */
        try {
            validationMotDePasse( motDePasse );
        } catch ( Exception e ) {
            setErreur( CHAMP_PASS, e.getMessage() );
        }

        if ( erreurs.isEmpty() ) {
        	try {
        		validation(email,motDePasse);
        		if(eleve==null && dirigeant==null && professeur==null) {
        			setErreur( CHAMP_EMAIL, "Identifiant Incorrect" );
        		}
        		else {
        			if(eleve!=null) {
        				resultat = "Succès de la connexion.";
        				return eleve;
        			}
        			else if(professeur!=null) {
        				resultat = "Succès de la connexion.";
        				return professeur;
        			}else {
        				resultat = "Succès de la connexion.";
        				return dirigeant;
        			}
        		}
        	}catch(Exception e) {
        		setErreur( CHAMP_EMAIL, "Erreur de communication avec la base de données" );
        	}
        }

        System.out.println(erreurs.isEmpty());
        /* Initialisation du résultat global de la validation. */
        if ( erreurs.isEmpty() ) {
            resultat = "Succès de la connexion.";
        } else {
            resultat = "Échec de la connexion.";
        }
        return null;
    }

    /**
     * Valide l'adresse email saisie.
     */
    private void validationEmail( String email ) throws Exception {
        if ( email != null && !email.matches( "([^.@]+)(\\.[^.@]+)*@([^.@]+\\.)+([^.@]+)" ) ) {
            throw new Exception( "Merci de saisir une adresse mail valide." );
        }
    }

    /**
     * Valide le mot de passe saisi.
     */
    private void validationMotDePasse( String motDePasse ) throws Exception {
        if ( motDePasse != null ) {
            if ( motDePasse.length() < 3 ) {
                throw new Exception( "Le mot de passe doit contenir au moins 3 caractères." );
            }
        } else {
            throw new Exception( "Merci de saisir votre mot de passe." );
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
    
    /*
     * Retourne l'utilisateur ou null si n'existe pas
     */
    private void validation(String email, String motdepasse) {
    	
    	try {
	    	DaoFactory daoFactory = DaoFactory.getInstance();
	        
		    EleveDao eleveDao;
	        eleveDao = daoFactory.getEleveDao();
	        eleve = eleveDao.getEleve(email, motdepasse);
	        
	        ProfesseurDao professeurDao;
	        professeurDao = daoFactory.getProfesseurDao();
	        professeur = professeurDao.getProfesseur(email, motdepasse);
	       
	        DirigeantDao dirigeantDao;
	        dirigeantDao = daoFactory.getDirigeantDao();
	        dirigeant = dirigeantDao.getDirigeant(email, motdepasse);
    	}catch(Exception e) {
    		setErreur( CHAMP_EMAIL, "Erreur de communication avec la base de données" );
    	}
    }
}