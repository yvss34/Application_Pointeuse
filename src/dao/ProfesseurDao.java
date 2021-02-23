package dao;

import java.util.List;

import beans.Professeur;

public interface ProfesseurDao {
	void ajouter(Professeur professeur);
	List<Professeur> lister();
}
