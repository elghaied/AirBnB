package eslam.airbnb.reservations;

import eslam.airbnb.logements.Logement;

import java.util.Date;

public class SejourCourt extends Sejour {
    public int tarif;



    public SejourCourt(Date dateArrivee, int nbNuits, Logement logement, int nbVoyageurs, int tarif) {
        super(dateArrivee, nbNuits, logement, nbVoyageurs);
        setTarif(tarif);
    }

    public void setTarif(int tarif) {
        this.tarif = tarif;
    }

    @Override
    public void afficher() {
        super.afficher();
        int tarif = nbNuits * logement.getTarifParNuit();
        System.out.println("le tarif est : " + tarif + " euro ");
    }
}
