package dao;

import java.util.List;

import beans.Professeur;

public interface ProfesseurDao {
	
	/**
	 * Ajoute l'objet Professeur à la BDD
	 * @param professeur, objet professeur
	 */
	void ajouter(Professeur professeur);
	
	/**
	 * 
	 * @return la liste des professeurs de la BDD
	 */
	List<Professeur> lister();
	
	/**
	 * Supprime le professeur de la BDD
	 * @param identifiant du professeur
	 */
	void supprimer(int identifiant);
	
	/**
	 * 
	 * @param email du professeur
	 * @param motdepasse du professeur
	 * @return l'objet Professeur s'il existe, null sinon
	 */
	Professeur getProfesseur(String email, String motdepasse);
	
	/**
	 * 
	 * @param identifiant du professeur
	 * @return l'objet Professeur s'il existe, null sinon
	 */
	Professeur getProfesseur(int identifiant);
}
