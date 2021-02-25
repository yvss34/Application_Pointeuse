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
import forms.CreationEleveForm;

/**
 * Servlet implementation class CreationEleve
 */
@WebServlet("/CreationEleve")
public class CreationEleve extends HttpServlet {
	public static final String ATT_USER = "utilisateur";
	public static final String ATT_FORM = "form";
	public static final String ATT_SESSION_USER = "sessionUtilisateur";
	public static final String VUE = "/WEB-INF/restreint/dirigeant/creationEleve.jsp";

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/* Affichage de la page de connexion */
		this.getServletContext().getRequestDispatcher(VUE).forward(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/* Préparation de l'objet formulaire */
		CreationEleveForm form = new CreationEleveForm();

		/* Traitement de la requête et récupération du bean en résultant */
		form.creationEleve(request);

		request.setAttribute(ATT_FORM, form);
		this.getServletContext().getRequestDispatcher(VUE).forward(request, response);
	}

}
