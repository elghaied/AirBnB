package eslam.airbnb.reservations;

import eslam.airbnb.logements.Logement;

import java.util.Date;

public class SejourLong extends Sejour implements ConditionsTarifairesInterface{
    int PROMOTION_EN_POURCENTAGE;

    int promotion;
    int tarifTotal;

    public SejourLong(Date dateArrivee, int nbNuits, Logement logement, int nbVoyageurs,int PROMOTION_EN_POURCENTAGE) {
        super(dateArrivee, nbNuits, logement, nbVoyageurs);
        this.PROMOTION_EN_POURCENTAGE = PROMOTION_EN_POURCENTAGE;


        setPromotion();
    }

    public void setPromotion() {
        this.promotion = super.tarifTotal * PROMOTION_EN_POURCENTAGE/100  ;
        this.tarifTotal = super.tarifTotal - this.promotion;
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

        System.out.println("le tarif est : " + super.tarifTotal +  " ( " + this.promotion + " euros de promotion, eco " + this.PROMOTION_EN_POURCENTAGE + "% "+ tarifTotal +"  )");

    }
}
