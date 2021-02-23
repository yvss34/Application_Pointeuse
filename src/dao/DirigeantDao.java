package dao;

import java.util.List;

import beans.Dirigeant;

public interface DirigeantDao {
	void ajouter(Dirigeant dirigeant);
	List<Dirigeant> lister();
}
