package eslam.airbnb.reservations;

import eslam.airbnb.logements.Logement;

import java.util.Date;

public class SejourCourt extends Sejour {




    public SejourCourt(Date dateArrivee, int nbNuits, Logement logement, int nbVoyageurs, int tarif) {
        super(dateArrivee, nbNuits, logement, nbVoyageurs,tarif);

    }


    @Override
    public void afficher() {
        super.afficher();
//        int tarif = nbNuits * logement.getTarifParNuit();
        System.out.println("le tarif est : " + this.tarif + " euro ");
    }
}
