package dao;

import java.util.ArrayList;

import beans.*;

public class SoutienScolaireDaoImpl implements SoutienScolaireDao{

	
	 private DaoFactory daoFactory;

	 SoutienScolaireDaoImpl(DaoFactory daoFactory) {
	        this.daoFactory = daoFactory;
	    }
	 
	@Override
	public SoutienScolaire getSoutienScolaire() {
		
		try {
		    EleveDao eleveDao;
	        eleveDao = daoFactory.getEleveDao();
	        ArrayList<Eleve> eleves = (ArrayList<Eleve>) eleveDao.lister();
	        
	        ProfesseurDao professeurDao;
	        professeurDao = daoFactory.getProfesseurDao();
	        ArrayList<Professeur> professeurs = (ArrayList<Professeur>) professeurDao.lister();
	       
	        DirigeantDao dirigeantDao;
	        dirigeantDao = daoFactory.getDirigeantDao();
	        ArrayList<Dirigeant> dirigeants = (ArrayList<Dirigeant>) dirigeantDao.lister();
	        
	        CoursDao coursDao;
	        coursDao = daoFactory.getCoursDao();
	        ArrayList<Cours> cours = (ArrayList<Cours>) coursDao.lister();
	        
	        SoutienScolaire soutienScolaire = new SoutienScolaire(1,"Plume et Compas",eleves,dirigeants,professeurs,cours);
	        return soutienScolaire;
    	}catch(Exception e) {
    		System.out.println("Erreur de communication avec la base de données");
    	}
		
		
		return null;
	}

}
