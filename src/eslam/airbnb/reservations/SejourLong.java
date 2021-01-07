package eslam.airbnb.reservations;

import eslam.airbnb.logements.Logement;

import java.util.Date;

public class SejourLong extends Sejour implements ConditionsTarifairesInterface{
    int PROMOTION_EN_POURCENTAGE;
    int promotion;


    public SejourLong(Date dateArrivee, int nbNuits, Logement logement, int nbVoyageurs,int promotion,int tarif) {
        super(dateArrivee, nbNuits, logement, nbVoyageurs,tarif);
    }

    @Override
    public boolean beneficiePromotion() {
        return false;
    }

    @Override
    public int getTarif() {
        return 0;
    }

    @Override
    public void afficher() {
        super.afficher();
//        int tarif = nbNuits * logement.getTarifParNuit();
        System.out.println("le tarif est : " + this.tarif + " euro PROMO ");
    }
}
