package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import forms.CreationEleveForm;
import forms.CreationProfesseurForm;

/**
 * Servlet implementation class CreationProfesseur
 */
@WebServlet("/CreationProfesseur")
public class CreationProfesseur extends HttpServlet {
	public static final String ATT_USER = "utilisateur";
	public static final String ATT_FORM = "form";
	public static final String ATT_SESSION_USER = "sessionUtilisateur";
	public static final String VUE = "/WEB-INF/restreint/dirigeant/creationProfesseur.jsp";

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/* Affichage de la page de connexion */
		this.getServletContext().getRequestDispatcher(VUE).forward(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/* Préparation de l'objet formulaire */
		CreationProfesseurForm form = new CreationProfesseurForm();

		/* Traitement de la requête et récupération du bean en résultant */
		form.creationProfesseur(request);

		this.getServletContext().getRequestDispatcher(VUE).forward(request, response);
	}

}
