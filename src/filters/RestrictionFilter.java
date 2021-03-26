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
 * Filtre pour les utilisateurs Lambda
 */
@WebFilter("/RestrictionFilter")
public class RestrictionFilter implements Filter {

	  public static final String ACCES_PUBLIC     = "/Login";
	  public static final String ATT_SESSION_USER = "sessionUtilisateur";

	public void destroy() {

	}

	/**
	 * Si l'objet utilisateur n'est pas connect�, et qu'il essaye d'acceder � des pages 
	 * reserv� aux utilisateurs, il est redirig� vers la page de connexion
	 */
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {

        /* Cast des objets request et response */
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) res;

        /* R�cup�ration de la session depuis la requ�te */
        HttpSession session = request.getSession();

        //Si l'objet utilisateur n'existe pas dans la session en cours, alors
        if ( session.getAttribute( ATT_SESSION_USER ) == null ) {
            /* Redirection vers la page publique */
        	request.getRequestDispatcher( ACCES_PUBLIC ).forward( request, response );
        } else {
            /* Affichage de la page restreinte */
            chain.doFilter( request, response );
        }
	}

	public void init(FilterConfig fConfig) throws ServletException {

	}

}
