package servlets;

import beans.Dirigeant;
import beans.Eleve;
import beans.Emargement;
import beans.Retard;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CreationDirigeant extends HttpServlet{

    public void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {
        /*
         * Récupération des données saisies, envoyées en tant que paramètres de
         * la requête GET générée à la validation du formulaire
         */
        String nom = request.getParameter( "nomDirigeant" );
        String prenom = request.getParameter( "prenomDirigeant" );
        String email = request.getParameter( "emailDirigeant" );
        String motDePasse = request.getParameter( "motDePasseDirigeant" );

        String message;
        /*
         * Initialisation du message à afficher : si un des champs obligatoires
         * du formulaire n'est pas renseigné, alors on affiche un message
         * d'erreur, sinon on affiche un message de succès
         */
        if ( nom.trim().isEmpty() || prenom.trim().isEmpty() || email.trim().isEmpty() ||motDePasse.trim().isEmpty()) {
            message = "Erreur - Vous n'avez pas rempli tous les champs obligatoires.";
        } else {
            message = "Client créé avec succès !";
        }
        /*
         * Création du bean Client et initialisation avec les données récupérées
         */
        Dirigeant dirigeant = new Dirigeant(nom,prenom,email,motDePasse);

        /* Ajout du bean et du message à l'objet requête */
        request.setAttribute( "Dirigeant", dirigeant );
        request.setAttribute( "message", message );

        /* Transmission à la page JSP en charge de l'affichage des données */
        this.getServletContext().getRequestDispatcher( "/afficherDirigeant.jsp" ).forward( request, response );
    }

}
