package eslam.airbnb.reservations;

import eslam.airbnb.logements.Logement;

import java.util.Date;

public class SejourCourt extends Sejour {
    public int tarif;

    public SejourCourt(Date dateArrivee, int nbNuits, Logement logement, int nbVoyageurs) {
        super(dateArrivee, nbNuits, logement, nbVoyageurs);
    }
}
