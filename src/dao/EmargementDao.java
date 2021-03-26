package dao;

import java.util.List;

import beans.Emargement;

public interface EmargementDao {
	
	/**
	 * Ajoute un objet Emargement � la BDD
	 * @param emargement, objet Emargement
	 */
    void ajouter( Emargement emargement );
    
    /**
     * 
     * @return la liste d'emargements de la BDD
     */
    List<Emargement> lister();
    
    /**
     * Supprime l'emargement de la BDD
     * @param identifiant du cours
     */
    void supprimer(int identifiant);
}
