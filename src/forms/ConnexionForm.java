package forms;

import javax.servlet.http.HttpServletRequest;

public class ConnexionForm {
	private String resultat;
	private boolean dirigeant;
	private boolean professeur;
	private boolean eleve;

	public void verifierIdentifiants(HttpServletRequest request) {
		String login = request.getParameter("login");
		String pass = request.getParameter("pass");
		
		if(pass.equals(login+"123")) {
			resultat = "Vous êtes bien connecté !";
			if(true) {
				//Mettre boolean
			}
		}else {
			resultat = "Identifiant incorrect !";
			
			dirigeant = false;
			professeur = false;
			eleve = false;
		}
	}
	
	public String getResultat() {
		return resultat;
	}

	public void setResultat(String resultat) {
		this.resultat = resultat;
	}

	public boolean isDirigeant() {
		return dirigeant;
	}

	public void setDirigeant(boolean dirigeant) {
		this.dirigeant = dirigeant;
	}

	public boolean isProfesseur() {
		return professeur;
	}

	public void setProfesseur(boolean professeur) {
		this.professeur = professeur;
	}

	public boolean isEleve() {
		return eleve;
	}

	public void setEleve(boolean eleve) {
		this.eleve = eleve;
	}
	
	
	
}
