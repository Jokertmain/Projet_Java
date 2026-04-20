import java.util.ArrayList;
import java.util.List;

public class Avion {
    String immatriculation;
    String modele;
    int capacite;
    public static List<Avion> listeAvions = new ArrayList<>();

    public Avion(String immatriculation, String modele, int capacite) {
        this.immatriculation = immatriculation;
        this.modele = modele;
        this.capacite = capacite;
    }

    public static void ajouterAvion(Avion a) {
        listeAvions.add(a);
        System.out.println("Avion ajouté.");
    }

    public static Avion trouverAvion(String immat) {
        for (int i = 0; i < listeAvions.size(); i++) {
            Avion a = listeAvions.get(i);
            if (a.immatriculation.equals(immat)) {
                return a;
            }
        }
        System.out.println("Avion introuvable.");
        return null;
    }

    public void modifierAvion(String nouveauModele, int nouvelleCapacite) {
        this.modele = nouveauModele;
        this.capacite = nouvelleCapacite;
        System.out.println("Informations de l'avion " + this.immatriculation + " mises à jour.");
    }

    public static void supprimerAvion(String immatriculation) {
        for (int i = 0; i < listeAvions.size(); i++) {
            Avion a = listeAvions.get(i);
            if (listeAvions.get(i).immatriculation.equals(immatriculation)) {
                listeAvions.remove(i);
                System.out.println("Avion " + immatriculation + " supprimé.");
                return;
            }
        }
        System.out.println("ID non trouvé");
    }

    public void obtenirInfos() {
        System.out.println("Immatriculation: "+immatriculation+ " Modèle: " + modele + "Capacité: " + capacite);
}
}
