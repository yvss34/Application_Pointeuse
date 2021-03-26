package dao;

import java.util.List;

import beans.Dirigeant;

public interface DirigeantDao {
	
	/**
	 * Ajoute un dirigeant à la BDD
	 * @param dirigeant, objet Dirigeant
	 */
	void ajouter(Dirigeant dirigeant);
	
	/**
	 * 
	 * @return la liste des dirigeants de la BDD
	 */
	List<Dirigeant> lister();
	
	/**
	 * Supprime le dirigeant de la BDD
	 * @param identifiant du dirigeant
	 */
	void supprimer(int identifiant);
	
	/**
	 * 
	 * @param email du dirigeant
	 * @param motdepasse du dirigeant
	 * @return l'objet Dirigeant s'il existe, null sinon
	 */
	Dirigeant getDirigeant(String email, String motdepasse);
}
