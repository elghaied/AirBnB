package eslam.airbnb.reservations;

import eslam.airbnb.utilisateurs.Personne;
import eslam.airbnb.utilisateurs.Voyageurs;

import java.util.Date;

public class Reservation {
    private int identifiant;
    private Sejour sejour;
    private Voyageurs voyageur;
    private boolean estValidee;
    private Date dateDeReservation;

    public Reservation (int identifiant, Sejour sejour, Voyageurs voyageur) {
        this.identifiant = identifiant;
        this.sejour = sejour;
        this.voyageur = voyageur;
        estValidee = false;
        dateDeReservation = new Date();
    }

    public void afficher() {
        voyageur.afficher();
        System.out.print(" qui a fait une réservation chez ");
        sejour.afficher();
    }
}
