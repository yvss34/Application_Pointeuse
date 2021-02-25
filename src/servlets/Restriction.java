package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import beans.Utilisateur;

/**
 * Servlet implementation class Restriction
 */
@WebServlet("/Restriction")
public class Restriction extends HttpServlet {
	
	 public static final String ACCES_PUBLIC     = "/accesPublic.jsp";
	    public static final String ACCES_RESTREINT_ELEVE  = "/WEB-INF/restreint/eleve/accesRestreintEleve.jsp";
	    public static final String ACCES_RESTREINT_PROFESSEUR  = "/WEB-INF/restreint/professeur/accesRestreintProfesseur.jsp";
	    public static final String ACCES_RESTREINT_DIRIGEANT  = "/WEB-INF/restreint/dirigeant/accesRestreintDirigeant.jsp";
	    public static final String ATT_SESSION_USER = "sessionUtilisateur";

	    public void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {
	        /* Récupération de la session depuis la requête */
	        HttpSession session = request.getSession();

	        /*
	         * Si l'objet utilisateur n'existe pas dans la session en cours, alors
	         * l'utilisateur n'est pas connecté.
	         */
	        if ( session.getAttribute( ATT_SESSION_USER ) == null ) {
	            /* Redirection vers la page publique */
	            response.sendRedirect( request.getContextPath() + ACCES_PUBLIC );
	        } else {
	        	if(session.getAttribute( ATT_SESSION_USER ).getClass().getName().equals("beans.Eleve")) {
		            /* Affichage de la page restreinte eleve */
		            this.getServletContext().getRequestDispatcher( ACCES_RESTREINT_ELEVE ).forward( request, response );
	        	}
	        	else if(session.getAttribute( ATT_SESSION_USER ).getClass().getName().equals("beans.Professeur")) {
	        		/* Affichage de la page restreinte professeur */
		            this.getServletContext().getRequestDispatcher( ACCES_RESTREINT_PROFESSEUR ).forward( request, response );
	        	}
	        	else if(session.getAttribute( ATT_SESSION_USER ).getClass().getName().equals("beans.Dirigeant")) {
	        		/* Affichage de la page restreinte dirigeant */
		            this.getServletContext().getRequestDispatcher( ACCES_RESTREINT_DIRIGEANT ).forward( request, response );
	        	}
	        }
	    }
}
