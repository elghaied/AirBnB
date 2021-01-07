package eslam.airbnb.reservations;

import eslam.airbnb.logements.Logement;

import java.util.Date;

public class SejourLong extends Sejour implements ConditionsTarifairesInterface{
    int PROMOTION_EN_POURCENTAGE;


    int promotion;


    public SejourLong(Date dateArrivee, int nbNuits, Logement logement, int nbVoyageurs,int promotion) {
        super(dateArrivee, nbNuits, logement, nbVoyageurs);
        setPromotion(promotion);


    }
    public void setPromotion(int promotion) {
        this.promotion = promotion;
    }


    public void setPROMOTION_EN_POURCENTAGE(int PROMOTION_EN_POURCENTAGE) {

        this.PROMOTION_EN_POURCENTAGE = PROMOTION_EN_POURCENTAGE;
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

        System.out.println("le tarif est : " + this.tarifTotal +  " ( " + promotion + " euros de promotion )");
    }
}
