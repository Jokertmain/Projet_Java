import java.util.ArrayList;
import java.util.List;

public abstract class Personnes {
    String identifiant;
    String nom;
    String adresse;
    String contact;
    public static List<Personnes> listePersonnes = new ArrayList<>();

    public Personnes(String identifiant, String nom, String adresse, String contact) {
        this.identifiant = identifiant;
        this.nom = nom;
        this.adresse = adresse;
        this.contact = contact;
    }

    public String getIdentifiant() {
        return this.identifiant;
    }

    public static void ajouterPersonnes(Personnes p) {
        listePersonnes.add(p);
        System.out.println("Personne ajoutée.");
    }

    public static Personnes trouverPersonne(String identifiant) {
        for (int i = 0; i < listePersonnes.size(); i++) {
            Personnes p = listePersonnes.get(i);
            if (p.getIdentifiant().equals(identifiant)) {
                return p;
            }
        }
        System.out.println("Erreur : Aucune personne trouvée avec l'ID " + identifiant);
        return null;
    }

    public void modifierInfos(String nouveauNom, String nouvelleAdresse, String nouveauContact) {
        this.nom = nouveauNom;
        this.adresse = nouvelleAdresse;
        this.contact = nouveauContact;
        System.out.println("Informations mises à jour pour l'ID " + this.identifiant);
    }

    public static void supprimerPersonne(String idCherche) {
        for (int i = 0; i < listePersonnes.size(); i++) {
            Personnes p = listePersonnes.get(i);
            if (p.getIdentifiant().equals(idCherche)) {
                listePersonnes.remove(i);
                System.out.println("Supprimé.");
                return;
            }
        }
        System.out.println("ID non trouvé");
    }

    public void obternirinfos(){
        System.out.println("Identifiant: "+identifiant + "Nom: "+nom + "Adresse: "+adresse + "Contact: "+contact);
    }


}
