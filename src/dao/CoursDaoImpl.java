package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import beans.Cours;
import beans.Emargement;

public class CoursDaoImpl implements CoursDao{

	 private DaoFactory daoFactory;

	 CoursDaoImpl(DaoFactory daoFactory) {
	        this.daoFactory = daoFactory;
	    }
	 
	@Override
	public void ajouter(Cours cours) {
		// TODO Auto-generated method stub
		Connection connexion = null;
        PreparedStatement preparedStatement = null;

        try {
            connexion = daoFactory.getConnection();
            preparedStatement = connexion.prepareStatement("INSERT INTO cours(identifiant,nom, horaire,identifiantProfesseur) VALUES(NULL,?,?,?);");
            preparedStatement.setString(1, cours.getNom());
            preparedStatement.setTimestamp(2, cours.getHoraires());
            preparedStatement.setInt(3, cours.getIdentifiantProfesseur());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
	}

	@Override
	public List<Cours> lister() {
		// TODO Auto-generated method stub
		 List<Cours> coursListe = new ArrayList<Cours>();
	        Connection connexion = null;
	        Statement statement1 = null;
	        Statement statement2 = null;
	        ResultSet resultat1 = null;
	        ResultSet resultat2 = null;
	        try {
	            connexion = daoFactory.getConnection();
	            statement1 = connexion.createStatement();
	            statement2 = connexion.createStatement();
	            resultat1 = statement1.executeQuery("SELECT identifiant,nom,horaire,identifiantProfesseur FROM cours;");
                while(resultat1.next()) {
                	int identifiantCours = resultat1.getInt("identifiant");
                	Timestamp dateCours = resultat1.getTimestamp("horaire");
                	String nomCours = resultat1.getString("nom");
                	int identifiantProfesseur = resultat1.getInt("identifiantProfesseur");
                	
                	ArrayList<Emargement> emargements = new ArrayList<Emargement>();
	                
                	resultat2 = statement2.executeQuery("SELECT identifiant,dateArrivee,identifiantEleve,identifiantCours FROM emargement WHERE identifiantCours ="+identifiantCours+ ";");
	                while(resultat2.next()) {
	                	int identifiantEmargement = resultat2.getInt("identifiant");
	                	Timestamp dateEmargement = resultat2.getTimestamp("dateArrivee");
	                	int identifiantEleve = resultat2.getInt("identifiantEleve");
	                	
	                	Emargement emargement = new Emargement(identifiantEmargement,dateEmargement,identifiantEleve,identifiantCours);
	                	emargements.add(emargement);
	                }
                	
                	Cours cours = new Cours(identifiantCours,nomCours,dateCours,emargements,identifiantProfesseur);
                	coursListe.add(cours);
                }
	        }catch (SQLException e) {
	            e.printStackTrace();
	        }
            return coursListe;
	}

}
