package eslam.airbnb;

import eslam.airbnb.logements.Appartement;
import eslam.airbnb.logements.Logement;
import eslam.airbnb.logements.Maison;
import eslam.airbnb.outils.Utile;
import eslam.airbnb.reservations.Reservation;
import eslam.airbnb.reservations.Sejour;
import eslam.airbnb.reservations.SejourCourt;
import eslam.airbnb.reservations.SejourLong;
import eslam.airbnb.utilisateurs.Hote;
import eslam.airbnb.utilisateurs.Personne;
import eslam.airbnb.utilisateurs.Voyageurs;

import java.util.Date;

public class Main {

    public static void main(String[] args) {

        // ----------------------------------------------------
        // Données - Personnes et Logements
        Hote personne1 = new Hote("Eslam", "Elghaied", 28,24);
        Hote personne2 = new Hote("Sam", "Smith", 34,5);
        Voyageurs personne3 = new Voyageurs("Jean", "Mi", 24);
        Voyageurs personne4 = new Voyageurs("Emma", "Martin", 31);

        Appartement logement1 = new Appartement(personne1, 400, "81 rue Colbert", 200, 4,2,80);
        Maison logement2 = new Maison(personne1, 89, "1 allee de la belle fille", 60, 4,true,200);


        // ----------------------------------------------------
        // Critère de séjour
        Date dateArrivee = Utile.stringToDate("07/31/2021");
        int nbNuits = 20;
        int nbVoyageurs = 2;
        int promotion = 20;
        Maison logement = logement2;
        Sejour sejour;
        if(nbNuits > 6) {
            sejour = new SejourLong(dateArrivee, nbNuits, logement, nbVoyageurs,promotion,logement.getTarifParNuit());


        }else {
             sejour = new SejourCourt(dateArrivee, nbNuits, logement, nbVoyageurs,logement.getTarifParNuit());
        }


        Reservation reservation = new Reservation(0, sejour, personne3);
        reservation.afficher();

    }
}
