package eslam.airbnb.reservations;

import eslam.airbnb.logements.Logement;

import java.util.Date;

public class SejourLong extends Sejour implements ConditionsTarifairesInterface{
    int PROMOTION_EN_POURCENTAGE;
    int promotion;
    int tarif;

    public SejourLong(Date dateArrivee, int nbNuits, Logement logement, int nbVoyageurs,int promotion,int tarif) {
        super(dateArrivee, nbNuits, logement, nbVoyageurs);
    }

    @Override
    public boolean beneficiePromotion() {
        return false;
    }

    @Override
    public int getTarif() {
        return 0;
    }
}
