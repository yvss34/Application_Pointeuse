package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import beans.Emargement;

public class EmargementDaoImpl implements EmargementDao{
	
	 private DaoFactory daoFactory;

	 EmargementDaoImpl(DaoFactory daoFactory) {
	        this.daoFactory = daoFactory;
	    }
	 
	@Override
	public void ajouter(Emargement emargement) {
		// TODO Auto-generated method stub
		  Connection connexion = null;
	        PreparedStatement preparedStatement = null;

	        try {
	            connexion = daoFactory.getConnection();
	            preparedStatement = connexion.prepareStatement("INSERT INTO emargement(identifiant,dateArrivee, identifiantEleve,identifiantCours) VALUES(NULL,?,?,?);");
	            preparedStatement.setTimestamp(1, emargement.getDateArrivee());
	            preparedStatement.setInt(2, emargement.getIdentifiantEleve());
	            preparedStatement.setInt(3, emargement.getIdentifiantCours());

	            preparedStatement.executeUpdate();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	}

	@Override
	public List<Emargement> lister() {
		// TODO Auto-generated method stub
		List<Emargement> emargements = new ArrayList<Emargement>();
        Connection connexion = null;
        Statement statement = null;
        ResultSet resultat1 = null;
        
        try {
            connexion = daoFactory.getConnection();
            statement = connexion.createStatement();
	        resultat1 = statement.executeQuery("SELECT identifiant,dateArrivee,identifiantEleve,identifiantCours FROM emargement;");
	        while(resultat1.next()) {
	        	int identifiantEmargement = resultat1.getInt("identifiant");
	        	Timestamp dateEmargement = resultat1.getTimestamp("dateArrivee");
	        	int identifiantEleve = resultat1.getInt("identifiantEleve");
	        	int identifiantCours = resultat1.getInt("identifiantCours");
	        	Emargement emargement = new Emargement(identifiantEmargement,dateEmargement,identifiantEleve,identifiantCours);
	        	emargements.add(emargement);
	        }
	}catch (SQLException e) {
        e.printStackTrace();
    }
        return emargements;
	}

}
