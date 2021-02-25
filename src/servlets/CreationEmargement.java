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
import forms.CreationEleveForm;
import forms.CreationEmargementForm;

/**
 * Servlet implementation class CreationEmargement
 */
@WebServlet("/CreationEmargement")
public class CreationEmargement extends HttpServlet {
	
	public static final String ATT_USER = "utilisateur";
	public static final String ATT_FORM = "form";
	public static final String ATT_SESSION_USER = "sessionUtilisateur";
	public static final String VUE = "/WEB-INF/restreint/eleve/creationEmargement.jsp";
	public static final String COURS = "cours";
	public static final String IDENTIFIANT = "identifiant";	
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		/* Cast des objets request et response */
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) res;
        
		DaoFactory daoFactory = DaoFactory.getInstance();
	    SoutienScolaireDao soutienScolaireDao;
	    soutienScolaireDao = daoFactory.getSoutienScolaireDao();
        SoutienScolaire soutienScolaire = soutienScolaireDao.getSoutienScolaire();
        
        ArrayList<Cours> cours = soutienScolaire.getCours();
		
        request.setAttribute(COURS, cours);
		this.getServletContext().getRequestDispatcher(VUE).forward(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
        /* Récupération de la session depuis la requête */
        HttpSession session = request.getSession();
        int identifiantEleve = (int)session.getAttribute(IDENTIFIANT);
        String cours = request.getParameter("selectionCours").toString();

        String[] tokens = cours.split("=");
        tokens = tokens[1].split(",");

        int identifiantCours = Integer.parseInt(tokens[0]);

		/* Préparation de l'objet formulaire */
		CreationEmargementForm form = new CreationEmargementForm();

		/* Traitement de la requête et récupération du bean en résultant */
		form.creationEmargement(identifiantEleve,identifiantCours);
		request.setAttribute(ATT_FORM, form);
		
		this.getServletContext().getRequestDispatcher(VUE).forward(request, response);
	}

}
