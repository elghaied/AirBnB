package eslam.airbnb.logements;

import eslam.airbnb.utilisateurs.Hote;

public class Appartement extends Logement {
    private int numeroEtage;
    private int superficieBalcon;
    public Appartement(Hote phote, int  ptarifParNuit, String padresse, int psuperficie, int pnbVoyageurMax,int numeroEtage,int superficieBalcon){
        super(phote,ptarifParNuit,padresse,psuperficie,pnbVoyageurMax);
        this.numeroEtage = numeroEtage;
        this.superficieBalcon = superficieBalcon;
    }

    public void afficher(){
        super.afficher();
        System.out.println("Etage : " + this.numeroEtage);
        System.out.println("Balcon Superficie : " + this.superficieBalcon);

    }

}
