package dao;

import java.util.ArrayList;
import java.util.List;
import java.sql.*;

import beans.Dirigeant;
import beans.Eleve;
import beans.Emargement;

public class EleveDaoImpl implements EleveDao{
	
    private DaoFactory daoFactory;

    EleveDaoImpl(DaoFactory daoFactory) {
        this.daoFactory = daoFactory;
    }
    
	@Override
	public void ajouter(Eleve eleve) {
		// TODO Auto-generated method stub
		  Connection connexion = null;
	        PreparedStatement preparedStatement = null;

	        try {
	            connexion = daoFactory.getConnection();
	            preparedStatement = connexion.prepareStatement("INSERT INTO eleve(identifiant,nom, prenom,email,password) VALUES(NULL,?,?,?,?);");
	            preparedStatement.setString(1, eleve.getNom());
	            preparedStatement.setString(2, eleve.getPrenom());
	            preparedStatement.setString(3, eleve.getEmail());
	            preparedStatement.setString(4, eleve.getMotDePasse());

	            preparedStatement.executeUpdate();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	}

	@Override
	public List<Eleve> lister() {
		// TODO Auto-generated method stub
		 List<Eleve> eleves = new ArrayList<Eleve>();
	        Connection connexion = null;
	        Statement statement1 = null;
	        Statement statement2 = null;
	        ResultSet resultat1 = null;
	        ResultSet resultat2 = null;
	        try {
	            connexion = daoFactory.getConnection();
	            statement1 = connexion.createStatement();
	            statement2 = connexion.createStatement();
	            resultat1 = statement1.executeQuery("SELECT identifiant,nom,prenom,email,password FROM eleve;");

	            while (resultat1.next() == true) {
	            	int identifiantEleve = resultat1.getInt("identifiant");
	                String nom = resultat1.getString("nom");
	                String prenom = resultat1.getString("prenom");
	                String email = resultat1.getString("email");
	                String password = resultat1.getString("password");
	                
	                ArrayList<Emargement> emargements = new ArrayList<Emargement>();
	                
	                resultat2 = statement2.executeQuery("SELECT identifiant,dateArrivee,identifiantEleve,identifiantCours FROM emargement WHERE identifiantEleve ="+identifiantEleve+ ";");
	                while(resultat2.next()) {
	                	int identifiantEmargement = resultat2.getInt("identifiant");
	                	Timestamp date = resultat2.getTimestamp("dateArrivee");
	                	int identifiantCours = resultat2.getInt("identifiantCours");
	                	
	                	Emargement emargement = new Emargement(identifiantEmargement,date,identifiantEleve,identifiantCours);
	                	emargements.add(emargement);
	                }
	                
	                Eleve eleve = new Eleve(identifiantEleve,nom,prenom,email,password,emargements);
	                eleves.add(eleve);
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return eleves;
	}

	@Override
	public void supprimer(int identifiant) {
		// TODO Auto-generated method stub
		Connection connexion = null;
		PreparedStatement preparedStatement = null;

        try {
            connexion = daoFactory.getConnection();
            
            preparedStatement = connexion.prepareStatement("DELETE FROM eleve WHERE eleve.identifiant = ?;");
            preparedStatement.setInt(1, identifiant);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
	}
	
	@Override
	public Eleve getEleve(String email, String motdepasse) {
		// TODO Auto-generated method stub
        Connection connexion = null;
        Statement statement = null;
        Statement statement2 = null;
        ResultSet resultat1 = null;
        ResultSet resultat2 = null;
        try {
            connexion = daoFactory.getConnection();
            statement = connexion.createStatement();
            statement2 = connexion.createStatement();
            resultat1 = statement.executeQuery("SELECT identifiant,nom,prenom FROM eleve WHERE email = '"+email+"' AND password = '"+motdepasse+"';");

            System.out.println("SELECT identifiant,nom,prenom FROM eleve WHERE email = '"+email+"' AND password = '"+motdepasse+"';");
            while (resultat1.next()) {
            	int identifiantEleve = resultat1.getInt("identifiant");
                String nom = resultat1.getString("nom");
                String prenom = resultat1.getString("prenom");
                System.out.println(identifiantEleve + nom + prenom);
                ArrayList<Emargement> emargements = new ArrayList<Emargement>();
                
                resultat2 = statement2.executeQuery("SELECT identifiant,dateArrivee,identifiantEleve,identifiantCours FROM emargement WHERE identifiantEleve ="+identifiantEleve+ ";");
                while(resultat2.next()) {
                	int identifiantEmargement = resultat2.getInt("identifiant");
                	Timestamp date = resultat2.getTimestamp("dateArrivee");
                	int identifiantCours = resultat2.getInt("identifiantCours");
                	
                	Emargement emargement = new Emargement(identifiantEmargement,date,identifiantEleve,identifiantCours);
                	emargements.add(emargement);
                }
                Eleve eleve = new Eleve(identifiantEleve,nom,prenom,email,motdepasse,emargements);
                return eleve;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
	}
	
	@Override
	public Eleve getEleve(int identifiant) {
		// TODO Auto-generated method stub
        Connection connexion = null;
        Statement statement = null;
        Statement statement2 = null;
        ResultSet resultat1 = null;
        ResultSet resultat2 = null;
        try {
            connexion = daoFactory.getConnection();
            statement = connexion.createStatement();
            statement2 = connexion.createStatement();
            resultat1 = statement.executeQuery("SELECT identifiant,nom,prenom FROM eleve WHERE identifiant = "+identifiant+";");

            while (resultat1.next()) {
            	int identifiantEleve = resultat1.getInt("identifiant");
                String nom = resultat1.getString("nom");
                String prenom = resultat1.getString("prenom");
                System.out.println(identifiantEleve + nom + prenom);
                ArrayList<Emargement> emargements = new ArrayList<Emargement>();
                
                resultat2 = statement2.executeQuery("SELECT identifiant,dateArrivee,identifiantEleve,identifiantCours FROM emargement WHERE identifiantEleve ="+identifiantEleve+ ";");
                while(resultat2.next()) {
                	int identifiantEmargement = resultat2.getInt("identifiant");
                	Timestamp date = resultat2.getTimestamp("dateArrivee");
                	int identifiantCours = resultat2.getInt("identifiantCours");
                	
                	Emargement emargement = new Emargement(identifiantEmargement,date,identifiantEleve,identifiantCours);
                	emargements.add(emargement);
                }
                Eleve eleve = new Eleve(identifiantEleve,nom,prenom," "," ",emargements);
                return eleve;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
	}
}
