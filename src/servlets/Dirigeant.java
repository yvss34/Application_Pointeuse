package servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import beans.*;
import dao.DaoFactory;
import dao.SoutienScolaireDao;

/**
 * Servlet implementation class Dirigeant
 */
@WebServlet("/Dirigeant")
public class Dirigeant extends HttpServlet {
	public static final String ATT_SESSION_USER = "sessionUtilisateur";
	public static final String VUE = "/WEB-INF/restreint/dirigeant/dirigeant_principale.jsp";
	
	public static final String NOM = "nom";
	public static final String PRENOM = "prenom";
	
	public static final String COURS = "cours";
	
	public static final String DIRIGEANTS = "dirigeants";
	public static final String PROFESSEURS = "professeurs";
	public static final String ELEVES = "eleves";
	
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        /* Cast des objets request et response */
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) res;

        /* Récupération de la session depuis la requête */
        HttpSession session = request.getSession();
        
        String nom = (String)session.getAttribute(NOM);
        String prenom = (String)session.getAttribute(PRENOM);
        
        DaoFactory daoFactory = DaoFactory.getInstance();
        
	    SoutienScolaireDao soutienScolaireDao;
	    soutienScolaireDao = daoFactory.getSoutienScolaireDao();
        SoutienScolaire soutienScolaire = soutienScolaireDao.getSoutienScolaire();
        
        
        ArrayList<Cours> cours = soutienScolaire.getCours();
        ArrayList<beans.Dirigeant> dirigeants = soutienScolaire.getDirigeants();
        ArrayList<beans.Professeur> professeurs = soutienScolaire.getProfesseurs();
        ArrayList<beans.Eleve> eleves = soutienScolaire.getEleves();
        
        
		request.setAttribute(NOM, nom);
		request.setAttribute(PRENOM, prenom);
		request.setAttribute(COURS, cours);
		request.setAttribute(DIRIGEANTS, dirigeants);
		request.setAttribute(PROFESSEURS, professeurs);
		request.setAttribute(ELEVES, eleves);
		
        this.getServletContext().getRequestDispatcher(VUE).forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
