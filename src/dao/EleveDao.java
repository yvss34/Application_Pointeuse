package dao;

import java.util.List;

import beans.Eleve;

public interface EleveDao {
	
	/**
	 * Ajoute un objet eleve à la BDD
	 * @param eleve objet Eleve
	 */
	void ajouter(Eleve eleve);
	
	/**
	 * 
	 * @return la liste d'eleves de la BDD
	 */
	List<Eleve> lister();
	
	/**
	 * Supprime l'eleve de la BDD
	 * @param identifiant de l'eleve
	 */
	void supprimer(int identifiant);
	
	/**
	 * 
	 * @param email de l'eleve
	 * @param motdepasse de l'eleve
	 * @return l'objet eleve s'il existe, null sinon
	 */
	Eleve getEleve(String email, String motdepasse);
	
	/**
	 * 
	 * @param identifiant de l'eleve
	 * @return l'objet eleve s'il existe, null sinon
	 */
	Eleve getEleve(int identifiant);
}
