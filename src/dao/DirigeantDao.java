package dao;

import java.util.List;

import beans.Dirigeant;

public interface DirigeantDao {
	void ajouter(Dirigeant dirigeant);
	List<Dirigeant> lister();
	void supprimer(int identifiant);
	Dirigeant getDirigeant(String email, String motdepasse);
}
