package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Classe Factory qui permet d'initialiser le DAO
 */
public class DaoFactory {
    private String url;
    private String username;
    private String password;

    DaoFactory(String url, String username, String password) {
        this.url = url;
        this.username = username;
        this.password = password;
    }

    /**
     * Charge les drivers nécessaires et se connecte à la BDD
     * @return un objet DaoFactory initialisé
     */
    public static DaoFactory getInstance() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {

        }

        DaoFactory instance = new DaoFactory(
                "jdbc:mysql://localhost:3306/pointeuse", "root", "");
        return instance;
    }

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, username, password);
    }

    // Récupération du Dao
    public EleveDao getEleveDao() {
        return new EleveDaoImpl(this);
    }
    
    public ProfesseurDao getProfesseurDao() {
        return new ProfesseurDaoImpl(this);
    }
    
    public DirigeantDao getDirigeantDao() {
        return new DirigeantDaoImpl(this);
    }
    
    public EmargementDao getEmargementDao() {
        return new EmargementDaoImpl(this);
    }
    
    public CoursDao getCoursDao() {
        return new CoursDaoImpl(this);
    }
    
    public SoutienScolaireDao getSoutienScolaireDao() {
        return new SoutienScolaireDaoImpl(this);
    }
}
