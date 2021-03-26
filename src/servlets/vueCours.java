package servlets;

import java.io.IOException;
import java.sql.Timestamp;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.Emargement;
import dao.CoursDao;
import dao.DaoFactory;
import dao.EleveDao;

/**
 * Servlet implementation class vueCours
 */
@WebServlet("/vueCours")
public class vueCours extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static final String VUE = "/WEB-INF/restreint/dirigeant/vueCours.jsp";
	
	public static final String IDENTIFIANT = "identifiant";
	public static final String EMARGEMENTS = "emargements";

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
        /* Cast des objets request et response */
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) res;

        
        String identifiantS = (String)request.getParameter(IDENTIFIANT);
        if(identifiantS != null) {
        	int identifiant = Integer.parseInt(identifiantS);
	        DaoFactory daoFactory = DaoFactory.getInstance();
		    CoursDao coursDao;
		    coursDao = daoFactory.getCoursDao();
	        beans.Cours cours = coursDao.getCours(identifiant);
	        
	        String nom = cours.getNom();
	        Timestamp horaire = cours.getHoraires();
	        ArrayList<Emargement> emargements = cours.getEmargements();
	        
			request.setAttribute("nomCours", nom);
			request.setAttribute("horaireCours", horaire);
			request.setAttribute(EMARGEMENTS, emargements);
        }
        this.getServletContext().getRequestDispatcher(VUE).forward(request, response);
        
	}

}
