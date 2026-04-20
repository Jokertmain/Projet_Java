public abstract class PersonnelCabine extends Employe{
    String qualification;

    public PersonnelCabine(String identifiant,String nom,String adresse,String contact, String NumeroEmploye , String DateEmbauche,String qualification) {
        super(identifiant, nom, adresse, contact, NumeroEmploye, DateEmbauche);
        this.qualification = qualification;
    }

    public String obtenirRole(){
        return("Personnel Cabine avec l'id "+this.identifiant);
    }

    public String affecterVol(){
        return("Le Pilote " + this.nom + " est affecté au vol");
    }

    public String obternirVol(){
        return "Liste des vols pour le pilote " + this.nom;
    }
}
