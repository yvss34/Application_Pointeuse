package dao;

import java.util.List;

import beans.Cours;

public interface CoursDao {
    void ajouter( Cours cours );
    List<Cours> lister();
    void supprimer(int identifiant);
}
