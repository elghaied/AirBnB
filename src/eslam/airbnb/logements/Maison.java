package eslam.airbnb.logements;

import eslam.airbnb.utilisateurs.Hote;

public class Maison extends Logement{
    private boolean possedePiscine;
    private int superficieJardin;
    public Maison(Hote phote, int  ptarifParNuit, String padresse, int psuperficie, int pnbVoyageurMax, boolean possedePiscine, int superficieJardin){
        super(phote,ptarifParNuit,padresse,psuperficie,pnbVoyageurMax);
        this.possedePiscine = possedePiscine;
        this.superficieJardin = superficieJardin;
    }

    public void afficher(){
        super.afficher();
        if (possedePiscine){
            System.out.println("Piscine : Oui");
        }else {
            System.out.println("Piscine : Non");
        }

    if(superficieJardin != 0){
        System.out.println("Jardin : Oui (" + this.superficieJardin + ")");

    }else
        System.out.println("Jardin : Non");

    }
}
