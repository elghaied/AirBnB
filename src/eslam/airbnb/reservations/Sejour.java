package eslam.airbnb.reservations;

import eslam.airbnb.logements.Logement;
import eslam.airbnb.outils.Utile;

import java.util.Date;

public abstract class Sejour implements SejourInterface {

    private Date dateArrivee;
    private int nbNuits;
    private Logement logement;
    private int nbVouageurs;
    protected int tarif;

    public Sejour(Date dateArrivee, int nbNuits, Logement logement, int nbVoyageurs,int tarif){
        this.dateArrivee = dateArrivee;
        this.logement = logement;
        this.nbNuits = nbNuits;
        this.nbVouageurs = nbVoyageurs;
        this.tarif =  tarif;
    }

    public  boolean verficationDateArrivee(){
        Date dateArrivee = this.dateArrivee;
        Date dateActuelle = new Date();

        if(dateArrivee.compareTo(dateActuelle) > 0){
            return false;
        }else{
            return true;

        }
    };

    @Override
    public boolean verificationNombreDeNuits() {

        int nbNuits = this.nbNuits;

        if (nbNuits >= 1 && nbNuits <= 31){
            return false;
        }else {
            return true;

        }
    }

    @Override
    public boolean verificationNombreDeVoyageurs() {
        int nbVouageurs = this.nbVouageurs;
        int nbVoyageurMax = this.logement.getNbVoyageurMax();

        if(nbVouageurs > nbVoyageurMax){
            return true;
        }else {
            return false;

        }


    }

    public void afficher(){

        boolean verifyDate = this.verficationDateArrivee();
        boolean verifyDays = this.verificationNombreDeNuits();
        boolean verifyVoyageur = this.verificationNombreDeVoyageurs();

        if (verifyDate || verifyDays || verifyVoyageur){
            String error = "";
            if (true == verifyDate) {
                error += "There's a problem with the arriving date " ;

            } else if (true == verifyDays) {
                error += "  the maximum days can't be more than a month you should choose a number between 1 and 31. ";

            } else if (true == verifyVoyageur) {
                error += " the place can't hold that much of people. ";
            }
            System.out.println("========================================");
            System.out.println("Error : " + error);
        }else {
            logement.afficher();
            System.out.println("la date d'arrivee : " + Utile.dateToString(dateArrivee) + ", pour " + this.nbNuits + " nuits.");

        }


    }


}
