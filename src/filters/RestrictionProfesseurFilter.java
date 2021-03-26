package filters;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Filtre pour les utilisateurs Professeur
 */
@WebFilter("/RestrictionProfesseurFilter")
public class RestrictionProfesseurFilter implements Filter {

	public static final String ATT_SESSION_USER = "sessionUtilisateur";
	public static final String ACCES_PUBLIC     = "/Login";

    public RestrictionProfesseurFilter() {
        // TODO Auto-generated constructor stub
    }

	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * Si l'objet utilisateur n'est pas un professeur, et qu'il essaye d'acceder à des pages 
	 * reservé aux professeurs, il est redirigé vers la page de connexion
	 */
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {

        /* Cast des objets request et response */
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) res;

        /* Récupération de la session depuis la requête */
        HttpSession session = request.getSession();

        //Si l'objet utilisateur n'existe pas dans la session en cours, alors
        if(!session.getAttribute( ATT_SESSION_USER ).getClass().getName().equals("beans.Professeur")) {
            /* Redirection vers la page publique */
        	request.getRequestDispatcher( ACCES_PUBLIC ).forward( request, response );
        } else {
            /* Affichage de la page restreinte */
            chain.doFilter( request, response );
        }
	}

	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
