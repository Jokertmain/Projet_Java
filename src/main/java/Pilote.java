public class Pilote extends Employe{
    String license;
    int heuresdevol;

    public Pilote(String identifiant,String nom,String adresse,String contact, String NumeroEmploye , String DateEmbauche,String license,int heuresdevol){
        super(identifiant,nom,adresse,contact,NumeroEmploye,DateEmbauche);
        this.license = license;
        this.heuresdevol=heuresdevol;
    }

    public String obternirVol(){
        return "Liste des vols pour le pilote " + this.nom;
    }

    public String ObternirRole(){
        return("Pilote avec l'id "+this.identifiant);
    }

    public String affecterVol(){
        return("Le Pilote " + this.nom + " est affecté au vol");
    }
}
