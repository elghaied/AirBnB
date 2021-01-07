package eslam.airbnb.reservations;

import eslam.airbnb.logements.Logement;

import java.util.Date;

public class SejourCourt extends Sejour {




    public SejourCourt(Date dateArrivee, int nbNuits, Logement logement, int nbVoyageurs) {
        super(dateArrivee, nbNuits, logement, nbVoyageurs);

    }


    @Override
    public void afficher() {
        super.afficher();
        System.out.println("le tarif est : " + this.tarifTotal + " euro ");
    }
}
