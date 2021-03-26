package servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.Cours;
import beans.Emargement;
import dao.DaoFactory;
import dao.EleveDao;
import dao.ProfesseurDao;

/**
 * Servlet implementation class vueProfesseur
 */
@WebServlet("/vueProfesseur")
public class vueProfesseur extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public vueProfesseur() {
        super();
        // TODO Auto-generated constructor stub
    }


	public static final String VUE = "/WEB-INF/restreint/dirigeant/vueProfesseur.jsp";
	
	public static final String IDENTIFIANT = "identifiant";
	public static final String COURS = "cours";
       
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
     	    ProfesseurDao professeurDao;
     	    professeurDao = daoFactory.getProfesseurDao();
             beans.Professeur professeur = professeurDao.getProfesseur(identifiant);
             
	        String nom = professeur.getNom();
	        String prenom = professeur.getPrenom();
	        ArrayList<Cours> cours = professeur.getCours();
	        
			request.setAttribute("nomProfesseur", nom);
			request.setAttribute("prenomProfesseur", prenom);
			request.setAttribute(COURS, cours);
        }
        this.getServletContext().getRequestDispatcher(VUE).forward(request, response);
        
	}
}
