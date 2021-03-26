package dao;

import java.util.List;

import beans.Cours;

public interface CoursDao {
	
	/**
	 * Ajoute un objet cours à la BDD
	 * @param cours, objet Cours
	 */
    void ajouter( Cours cours );
    
    /**
     * 
     * @return la liste de cours de la BDD
     */
    List<Cours> lister();
    
    /**
     * Supprime le cours de la BDD
     * @param identifiant du cours
     */
    void supprimer(int identifiant);
    
    /**
     * 
     * @param identifiant du cours
     * @return l'objet Cours s'il existe, null sinon
     */
    Cours getCours(int identifiant);
}
