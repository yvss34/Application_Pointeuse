package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.CoursDao;
import dao.DaoFactory;
import dao.DirigeantDao;

/**
 * Servlet implementation class SupprimerCours
 */
@WebServlet("/SupprimerCours")
public class SupprimerCours extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SupprimerCours() {
        super();
        // TODO Auto-generated constructor stub
    }

    public static final String URL_REDIRECTION = "http://localhost:8080/Projet_Libre_Application_Pointeuse/Dirigeant";
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		/* Cast des objets request et response */
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) res;
        
        String identifiantS = (String) request.getParameter("identifiant");
        if(identifiantS != null) {
	        int identifiant = Integer.parseInt(identifiantS);
	        DaoFactory daoFactory = DaoFactory.getInstance();
	        CoursDao coursDao = daoFactory.getCoursDao();
	        coursDao.supprimer(identifiant);
        }
		
        response.sendRedirect( URL_REDIRECTION );
	}

}
