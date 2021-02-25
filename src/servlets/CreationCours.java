package servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import beans.Cours;
import beans.SoutienScolaire;
import dao.DaoFactory;
import dao.SoutienScolaireDao;
import forms.CreationCoursForm;
import forms.CreationEmargementForm;

/**
 * Servlet implementation class CreationCours
 */
@WebServlet("/CreationCours")
public class CreationCours extends HttpServlet {
	
	public static final String ATT_USER = "utilisateur";
	public static final String ATT_FORM = "form";
	public static final String ATT_SESSION_USER = "sessionUtilisateur";
	public static final String VUE = "/WEB-INF/restreint/professeur/creationCours.jsp";
	public static final String COURS = "cours";
	public static final String IDENTIFIANT = "identifiant";	
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher(VUE).forward(req, res);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 /* Récupération de la session depuis la requête */
        HttpSession session = request.getSession();
        int identifiantProfesseur = (int)session.getAttribute(IDENTIFIANT);

		/* Préparation de l'objet formulaire */
		CreationCoursForm form = new CreationCoursForm();

		/* Traitement de la requête et récupération du bean en résultant */
		form.creationCours(request,identifiantProfesseur);
		request.setAttribute(ATT_FORM, form);
		
		this.getServletContext().getRequestDispatcher(VUE).forward(request, response);
	}

}
