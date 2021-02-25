package dao;

import java.util.ArrayList;
import java.util.List;
import java.sql.*;

import beans.Cours;
import beans.Dirigeant;
import beans.Emargement;
import beans.Professeur;

public class ProfesseurDaoImpl implements ProfesseurDao{
	
    private DaoFactory daoFactory;

    ProfesseurDaoImpl(DaoFactory daoFactory) {
        this.daoFactory = daoFactory;
    }
    
	@Override
	public void ajouter(Professeur professeur) {
		// TODO Auto-generated method stub
		  Connection connexion = null;
	        PreparedStatement preparedStatement = null;

	        try {
	            connexion = daoFactory.getConnection();
	            preparedStatement = connexion.prepareStatement("INSERT INTO professeur(identifiant,nom, prenom,email,password) VALUES(NULL,?,?,?,?);");
	            preparedStatement.setString(1, professeur.getNom());
	            preparedStatement.setString(2, professeur.getPrenom());
	            preparedStatement.setString(3, professeur.getEmail());
	            preparedStatement.setString(4, professeur.getMotDePasse());

	            preparedStatement.executeUpdate();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	}

	@Override
	public List<Professeur> lister() {
		// TODO Auto-generated method stub
		 List<Professeur> professeurs = new ArrayList<Professeur>();
	        Connection connexion = null;
	        Statement statement1 = null;
	        Statement statement2 = null;
	        Statement statement3 = null;
	        ResultSet resultat1 = null;
	        ResultSet resultat2 = null;
	        ResultSet resultat3 = null;
	        try {
	            connexion = daoFactory.getConnection();
	            statement1 = connexion.createStatement();
	            statement2 = connexion.createStatement();
	            statement3 = connexion.createStatement();
	            resultat1 = statement1.executeQuery("SELECT identifiant,nom,prenom,email,password FROM professeur;");

	            while (resultat1.next()) {
	            	int identifiantProfesseur = resultat1.getInt("identifiant");
	                String nom = resultat1.getString("nom");
	                String prenom = resultat1.getString("prenom");
	                String email = resultat1.getString("email");
	                String password = resultat1.getString("password");
	                
	                ArrayList<Cours> coursListe = new ArrayList<Cours>();
	                
	                resultat2 = statement2.executeQuery("SELECT identifiant,nom,horaire FROM cours WHERE identifiantProfesseur ="+identifiantProfesseur+ ";");
	                while(resultat2.next()) {
	                	int identifiantCours = resultat2.getInt("identifiant");
	                	Timestamp dateCours = resultat2.getTimestamp("horaire");
	                	String nomCours = resultat2.getString("nom");
	                	
	                	ArrayList<Emargement> emargements = new ArrayList<Emargement>();
		                
		                resultat3 = statement3.executeQuery("SELECT identifiant,dateArrivee,identifiantEleve,identifiantCours FROM emargement WHERE identifiantCours ="+identifiantCours+ ";");
		                while(resultat3.next()) {
		                	int identifiantEmargement = resultat3.getInt("identifiant");
		                	Timestamp dateEmargement = resultat3.getTimestamp("dateArrivee");
		                	int identifiantEleve = resultat3.getInt("identifiantEleve");
		                	
		                	Emargement emargement = new Emargement(identifiantEmargement,dateEmargement,identifiantEleve,identifiantCours);
		                	emargements.add(emargement);
		                }
	                	
	                	Cours cours = new Cours(identifiantCours,nomCours,dateCours,emargements,identifiantProfesseur);
	                	coursListe.add(cours);
	                }
	               
	                Professeur professeur = new Professeur(identifiantProfesseur,nom,prenom,email,password,coursListe);
	                professeurs.add(professeur);
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return professeurs;
	}
	@Override
	public void supprimer(int identifiant) {
		// TODO Auto-generated method stub
		Connection connexion = null;
		PreparedStatement preparedStatement = null;

        try {
            connexion = daoFactory.getConnection();
            
            preparedStatement = connexion.prepareStatement("DELETE FROM professeur WHERE professeur.identifiant = ?;");
            preparedStatement.setInt(1, identifiant);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
	}
	
	@Override
	public Professeur getProfesseur(String email, String motdepasse) {
		// TODO Auto-generated method stub
        Connection connexion = null;
        Statement statement = null;
        Statement statement2 = null;
        Statement statement3 = null;
        ResultSet resultat1 = null;
        ResultSet resultat2 = null;
        ResultSet resultat3 = null;
        try {
            connexion = daoFactory.getConnection();
            statement = connexion.createStatement();
            statement2 = connexion.createStatement();
            statement3 = connexion.createStatement();
            resultat1 = statement.executeQuery("SELECT identifiant,nom,prenom FROM professeur WHERE email = '"+email+"' AND password = '"+motdepasse+"';");

            while (resultat1.next()) {
            	int identifiantProfesseur = resultat1.getInt("identifiant");
                String nom = resultat1.getString("nom");
                String prenom = resultat1.getString("prenom");
                ArrayList<Cours> coursListe = new ArrayList<Cours>();
                
                resultat2 = statement2.executeQuery("SELECT identifiant,nom,horaire FROM cours WHERE identifiantProfesseur ="+identifiantProfesseur+ ";");
                while(resultat2.next()) {
                	int identifiantCours = resultat2.getInt("identifiant");
                	Timestamp dateCours = resultat2.getTimestamp("horaire");
                	String nomCours = resultat2.getString("nom");
                	
                	ArrayList<Emargement> emargements = new ArrayList<Emargement>();
	                
	                resultat3 = statement3.executeQuery("SELECT identifiant,dateArrivee,identifiantEleve,identifiantCours FROM emargement WHERE identifiantCours ="+identifiantCours+ ";");
	                while(resultat3.next()) {
	                	int identifiantEmargement = resultat3.getInt("identifiant");
	                	Timestamp dateEmargement = resultat3.getTimestamp("dateArrivee");
	                	int identifiantEleve = resultat3.getInt("identifiantEleve");
	                	
	                	Emargement emargement = new Emargement(identifiantEmargement,dateEmargement,identifiantEleve,identifiantCours);
	                	emargements.add(emargement);
	                }
                	
                	Cours cours = new Cours(identifiantCours,nomCours,dateCours,emargements,identifiantProfesseur);
                	coursListe.add(cours);
                }
                Professeur professeur = new Professeur(identifiantProfesseur,nom,prenom,email,motdepasse,coursListe);
                return professeur;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
	}
}
