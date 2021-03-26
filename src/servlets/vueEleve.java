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
import dao.DaoFactory;
import dao.EleveDao;

/**
 * Servlet implementation class vueEleve
 */
@WebServlet("/vueEleve")
public class vueEleve extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static final String VUE = "/WEB-INF/restreint/dirigeant/vueEleve.jsp";
	
	public static final String IDENTIFIANT = "identifiant";


	
	public static final String EMARGEMENTS = "emargements";
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public vueEleve() {
        super();
        // TODO Auto-generated constructor stub
    }

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
		    EleveDao eleveDao;
		    eleveDao = daoFactory.getEleveDao();
	        beans.Eleve eleve = eleveDao.getEleve(identifiant);
	        
	        String nom = eleve.getNom();
	        String prenom = eleve.getPrenom();
	        ArrayList<Emargement> emargements = eleve.getEmargements();
	        
			request.setAttribute("nomEleve", nom);
			request.setAttribute("prenomEleve", prenom);
			request.setAttribute(EMARGEMENTS, emargements);
        }
        this.getServletContext().getRequestDispatcher(VUE).forward(request, response);
        
	}

}
