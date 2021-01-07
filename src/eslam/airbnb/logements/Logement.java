package eslam.airbnb.logements;

import eslam.airbnb.outils.Msquare;
import eslam.airbnb.utilisateurs.Hote;


public abstract class Logement {
    private Hote hote;
    private int tarifParNuit;
    private String adresse;
    private int superficie;
    private int nbVoyageurMax;





    protected Logement(Hote phote, int  ptarifParNuit, String padresse,int psuperficie, int pnbVoyageurMax){
        this.setAdresse(padresse);
        this.setHote(phote);
        this.setTarifParNuit(ptarifParNuit);
        this.setSuperficie(psuperficie);
        this.setNbVoyageurMax(pnbVoyageurMax);

    }



    /**
     *  THE SETTERS
     * @param adresse = "22 rue de paris,75000 Paris"
     */
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setHote(Hote hote) {
        this.hote = hote;
    }

    public void setNbVoyageurMax(int nbVoyageurMax) {
        this.nbVoyageurMax = nbVoyageurMax;
    }

    public void setSuperficie(int superficie) {
        this.superficie = superficie;
    }

    public void setTarifParNuit(int tarifParNuit) {
        this.tarifParNuit = tarifParNuit;
    }

    /**
     * the Getters
     * @return
     */
    public Hote getHote() {
        return hote;
    }

    public int getNbVoyageurMax() {
        return nbVoyageurMax;
    }

    public int getSuperficie() {
        return superficie;
    }

    public String getAdresse() {
        return adresse;
    }

    /**
     * Methodes
     */

    public int getTarifParNuit() {
        return tarifParNuit;
    }

    public void afficher(){

        hote.afficher();
        System.out.println("Le logement est situe " + this.adresse );
        System.out.println("Superficie : " + Msquare.sq(this.superficie));
    }

}
