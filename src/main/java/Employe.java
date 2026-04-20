public abstract class Employe extends Personnes {
    String NumeroEmploye;
    String DateEmbauche;

    public Employe(String identifiant,String nom,String adresse,String contact, String NumeroEmploye , String DateEmbauche){
        super(identifiant,nom,adresse,contact);
        this.NumeroEmploye = NumeroEmploye;
        this.DateEmbauche = DateEmbauche;
    }

    public abstract String ObternirRole();//Sa appelle la fonction qui eest dans pilote et personnelcabine

    public String getNumeroEmploye() {
        return this.NumeroEmploye;
    }
}

