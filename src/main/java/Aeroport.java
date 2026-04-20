import java.util.ArrayList;
import java.util.List;

public class Aeroport {
    String Nom;
    String Ville;
    String Description;
    public static List<Aeroport> listeAeroports = new ArrayList<>();

    public Aeroport(String Nom, String Ville, String Description) {
        this.Nom = Nom;
        this.Ville = Ville;
        this.Description = Description;
    }

    public static void ajouterAeroport(Aeroport a) {
        listeAeroports.add(a);
        System.out.println("Aéroport " + a.Nom + " ajouté.");
    }

    public static Aeroport trouverAeroport(String Nom) {
        for (Aeroport a : listeAeroports) {
            if (a.Nom.equals(Nom)) {
                return a;
            }
        }
        System.out.println("Aeroport introuvable.");
        return null;
    }

    public void modifierAeroport(String nouveauNom, String nouvelleVille) {
        this.Nom = nouveauNom;
        this.Ville = nouvelleVille;
        System.out.println("Infos de l'aéroport mises à jour.");
    }

    public static void supprimerAeroport(String Nom) {
        for (int i = 0; i < listeAeroports.size(); i++) {
            if (listeAeroports.get(i).Nom.equals(Nom)) {
                listeAeroports.remove(i);
                System.out.println("Aéroport supprimé.");
                return;
            }
        }
    }

}
