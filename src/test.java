
import java.sql.Timestamp;
import java.util.List;

import beans.*;
import dao.*;

public class test {

	public static void main(String[] args) {
		
        DaoFactory daoFactory = DaoFactory.getInstance();
        
	    EleveDao eleveDao;
        eleveDao = daoFactory.getEleveDao();
        List<Eleve> eleves = eleveDao.lister();	
        for(int i=0 ; i<eleves.size();i++) {
        	System.out.println(eleves.get(i));
        }
        
        ProfesseurDao professeurDao;
        professeurDao = daoFactory.getProfesseurDao();
        List<Professeur> professeurs = professeurDao.lister();
        for(int i=0 ; i<professeurs.size();i++) {
        	System.out.println(professeurs.get(i));
        }
        
        DirigeantDao dirigeantDao;
        dirigeantDao = daoFactory.getDirigeantDao();
        List<Dirigeant> dirigeants = dirigeantDao.lister();
        for(int i=0 ; i<dirigeants.size();i++) {
        	System.out.println(dirigeants.get(i));
        }
        
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        
        CoursDao coursDao;
        coursDao = daoFactory.getCoursDao();
        List<Cours> cours = coursDao.lister();
        for(int i=0 ; i<cours.size();i++) {
        	System.out.println(cours.get(i));
        }
    	
        EmargementDao emargementDao;
        emargementDao = daoFactory.getEmargementDao();
        List<Emargement> emargements = emargementDao.lister();
        for(int i=0 ; i<emargements.size();i++) {
        	System.out.println(emargements.get(i));
        }
	}
}
