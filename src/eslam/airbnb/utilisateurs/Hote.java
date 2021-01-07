package eslam.airbnb.utilisateurs;

public class Hote extends Personne{
    private int delaiDeReponse;
    public Hote(String firstname, String lastname , int ages,int delaiDeReponse){
        super(firstname,lastname,ages);
        this.delaiDeReponse = delaiDeReponse;
    }
    public void afficher(){
        super.afficher();
        System.out.println("he'll replay on : " + this.delaiDeReponse );

    }

}
