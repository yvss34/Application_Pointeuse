package servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import beans.Emargement;
import beans.SoutienScolaire;
import dao.DaoFactory;
import dao.EleveDao;
import dao.SoutienScolaireDao;

/**
 * Servlet implementation class Eleve
 */
@WebServlet("/Eleve")
public class Eleve extends HttpServlet {

	public static final String ATT_SESSION_USER = "sessionUtilisateur";
	public static final String VUE = "/WEB-INF/restreint/eleve/eleve_principale.jsp";
	
	public static final String NOM = "nom";
	public static final String PRENOM = "prenom";
	public static final String EMAIL = "email";
	public static final String PASSWORD = "password";
	
	public static final String EMARGEMENTS = "emargements";
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        /* Cast des objets request et response */
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) res;

        /* Récupération de la session depuis la requête */
        HttpSession session = request.getSession();
        
        String nom = (String)session.getAttribute(NOM);
        String prenom = (String)session.getAttribute(PRENOM);
        String email = (String)session.getAttribute(EMAIL);
        String motDePasse = (String)session.getAttribute(PASSWORD);
        
        DaoFactory daoFactory = DaoFactory.getInstance();
	    EleveDao eleveDao;
	    eleveDao = daoFactory.getEleveDao();
        beans.Eleve eleve = eleveDao.getEleve(email, motDePasse);
        
        ArrayList<Emargement> emargements = eleve.getEmargements();
        
		request.setAttribute(NOM, nom);
		request.setAttribute(PRENOM, prenom);
		request.setAttribute(EMARGEMENTS, emargements);
		
        this.getServletContext().getRequestDispatcher(VUE).forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
