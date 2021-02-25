package dao;

import java.util.List;

import beans.Emargement;

public interface EmargementDao {
    void ajouter( Emargement emargement );
    List<Emargement> lister();
    void supprimer(int identifiant);
}
