import java.util.ArrayList;
import java.util.List;

public class Vol {
     String numeroVol;
     String origine;
     String destination;
     String dateHeureDepart;
     String etat;
    Avion avionAffecte;

    public static List<Vol> listeVols = new ArrayList<>();

     public Vol(String numeroVol,String origine,String destination,String dateheuredepart,String etat){
         this.numeroVol=numeroVol;
         this.origine=origine;
         this.destination=destination;
         this.dateHeureDepart=dateheuredepart;
         this.etat=etat;
     }

    public static void ajouterVol(Vol v) {
        listeVols.add(v);
        System.out.println("Vol " + v.numeroVol + " ajouté.");
    }

    public static Vol trouverVol(String num) {
        for (int i = 0; i < listeVols.size(); i++) {
            Vol v = listeVols.get(i);
            if (listeVols.get(i).numeroVol.equals(num)) {
                return listeVols.get(i);
            }
        }
        System.out.println("Vol introuvable.");
        return null;
    }

    public void modifierVol(String nouvelleOrigine, String nouvelleDestination, String nouvelleDate) {
        this.origine = nouvelleOrigine;
        this.destination = nouvelleDestination;
        this.dateHeureDepart = nouvelleDate;

        System.out.println("Le vol " + this.numeroVol + " a été mis à jour.");
    }

    public static void supprimerVol(String num) {
        for (int i = 0; i < listeVols.size(); i++) {
            if (listeVols.get(i).numeroVol.equals(num)) {
                listeVols.remove(i);
                System.out.println("Vol " + num + " supprimé.");
                return;
            }
        }
    }

    public void affecterVol(Avion a) {
        this.avionAffecte = a;
        System.out.println("L'avion " + a.immatriculation + " a été affecté au vol " + this.numeroVol);
    }

     public void planifierVol(){
         this.etat = "Planifié";
         System.out.println("Le vol " + numeroVol + " est planifié.");
     }

     public void annulerVol(){
         this.etat = "Annulé";
         System.out.println("Le vol " + numeroVol + " a été annulé.");
     }

     public void listingPassager(){
         System.out.println("Affichage de la liste des passagers pour le vol " + numeroVol);
     }
}
