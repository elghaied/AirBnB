package eslam.airbnb.utilisateurs;

public class Personne {
    private String prenom;
    private String nom;
    private Integer age;



    public Personne(String firstname, String lastname , int ages){
        this.setPrenom(firstname);
        this.setNom(lastname);
        this.setAge(ages);

    }


    public void afficher(){
        System.out.println(this.prenom + " " + this.nom + "  ( " + this.age + " ).");

    }

    public String getPrenom() {
        return prenom;
    }

    public String getNom() {
        return nom;
    }

    public Integer getAge() {
        return age;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
