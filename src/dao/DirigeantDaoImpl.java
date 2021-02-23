package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import beans.Dirigeant;

public class DirigeantDaoImpl implements DirigeantDao{
	
	 private DaoFactory daoFactory;

	 DirigeantDaoImpl(DaoFactory daoFactory) {
	        this.daoFactory = daoFactory;
	    }
	    
	@Override
	public void ajouter(Dirigeant dirigeant) {
		// TODO Auto-generated method stub
		 Connection connexion = null;
	        PreparedStatement preparedStatement = null;

	        try {
	            connexion = daoFactory.getConnection();
	            preparedStatement = connexion.prepareStatement("INSERT INTO dirigeant(identifiant,nom, prenom,email,password) VALUES(NULL,?,?,?,?);");
	            preparedStatement.setString(1, dirigeant.getNom());
	            preparedStatement.setString(2, dirigeant.getPrenom());
	            preparedStatement.setString(3, dirigeant.getEmail());
	            preparedStatement.setString(4, dirigeant.getMotDePasse());

	            preparedStatement.executeUpdate();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	}

	@Override
	public List<Dirigeant> lister() {
		// TODO Auto-generated method stub
		List<Dirigeant> dirigeants = new ArrayList<Dirigeant>();
        Connection connexion = null;
        Statement statement = null;
        ResultSet resultat1 = null;
        try {
            connexion = daoFactory.getConnection();
            statement = connexion.createStatement();
            resultat1 = statement.executeQuery("SELECT identifiant,nom,prenom,email,password FROM dirigeant;");

            while (resultat1.next()) {
            	int identifiantDirigeant = resultat1.getInt("identifiant");
                String nom = resultat1.getString("nom");
                String prenom = resultat1.getString("prenom");
                String email = resultat1.getString("email");
                String password = resultat1.getString("password");
   
                Dirigeant dirigeant = new Dirigeant(identifiantDirigeant,nom,prenom,email,password);
                dirigeants.add(dirigeant);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dirigeants;
	}

}
