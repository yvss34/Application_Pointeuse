package dao;

import java.util.List;

import beans.Eleve;

public interface EleveDao {
	void ajouter(Eleve eleve);
	List<Eleve> lister();
}