package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import beans.Dirigeant;
import beans.Eleve;
import beans.Professeur;
import beans.Utilisateur;
import forms.ConnexionForm;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {

	public static final String ATT_USER = "utilisateur";
	public static final String ATT_FORM = "form";
	public static final String ATT_SESSION_USER = "sessionUtilisateur";
	
	public static final String IDENTIFIANT = "identifiant";
	public static final String NOM = "nom";
	public static final String PRENOM = "prenom";
	
	public static final String EMAIL = "email";
	public static final String PASSWORD = "password";
	
	public static final String VUE = "/WEB-INF/login.jsp";
	public static final String VUE_ELEVE = "/Eleve";
	public static final String VUE_PROFESSEUR = "/Professeur";
	public static final String VUE_DIRIGEANT = "/Dirigeant";

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/* Affichage de la page de connexion */
		this.getServletContext().getRequestDispatcher(VUE).forward(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/* Préparation de l'objet formulaire */
		ConnexionForm form = new ConnexionForm();

		/* Traitement de la requête et récupération du bean en résultant */
		Utilisateur utilisateur = form.connecterUtilisateur(request);
		Eleve eleve = form.getEleve();
		Professeur professeur = form.getProfesseur();
		Dirigeant dirigeant = form.getDirigeant();
		
		/* Récupération de la session depuis la requête */
		HttpSession session = request.getSession();

		/**
		 * Si aucune erreur de validation n'a eu lieu, alors ajout du bean Utilisateur à
		 * la session, sinon suppression du bean de la session.
		 */
		if (form.getErreurs().isEmpty()) {
			if(eleve != null) {
				session.setAttribute(ATT_SESSION_USER, eleve);
				session.setAttribute(IDENTIFIANT, eleve.getIdentifiant());
				session.setAttribute(NOM, eleve.getNom());
				session.setAttribute(PRENOM, eleve.getPrenom());
				session.setAttribute(EMAIL, eleve.getEmail());
				session.setAttribute(PASSWORD, eleve.getMotDePasse());
				this.getServletContext().getRequestDispatcher(VUE_ELEVE).forward(request, response);
			}else if(professeur != null) {
				session.setAttribute(ATT_SESSION_USER, professeur);
				session.setAttribute(IDENTIFIANT, professeur.getIdentifiant());
				session.setAttribute(NOM, professeur.getNom());
				session.setAttribute(PRENOM, professeur.getPrenom());
				session.setAttribute(EMAIL, professeur.getEmail());
				session.setAttribute(PASSWORD, professeur.getMotDePasse());
				this.getServletContext().getRequestDispatcher(VUE_PROFESSEUR).forward(request, response);
			}else if(dirigeant != null) {
				session.setAttribute(ATT_SESSION_USER, dirigeant);
				session.setAttribute(NOM, dirigeant.getNom());
				session.setAttribute(PRENOM, dirigeant.getPrenom());
				this.getServletContext().getRequestDispatcher(VUE_DIRIGEANT).forward(request, response);
			}
		} else {
			/* Stockage du formulaire et du bean dans l'objet request */
			request.setAttribute(ATT_FORM, form);
			request.setAttribute(ATT_USER, utilisateur);
			session.setAttribute(ATT_SESSION_USER, null);
			this.getServletContext().getRequestDispatcher(VUE).forward(request, response);
		}

	}

}
