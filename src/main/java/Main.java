import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        // 1. Création d'un Avion
        System.out.println("Création de l'avion");
        System.out.print("Immatriculation : ");
        String immat = sc.nextLine();
        System.out.print("Modèle : ");
        String modele = sc.nextLine();
        System.out.print("Capacité : ");
        int capacite = sc.nextInt();

        Avion monAvion = new Avion(immat, modele, capacite);

        // 2. Création d'un Vol
        System.out.println("Création du vol");
        System.out.print("Numéro de vol : ");
        String numeroVol = sc.nextLine();
        System.out.print("Destination : ");
        String destination = sc.nextLine();

        Vol monVol = new Vol(numeroVol, "Paris", destination, "13/12/2026", "Planifié");

        System.out.println("Exécution de l'affectation");
        monVol.affecterVol(monAvion);

        // 4. TEST DU PILOTE
        System.out.println("Test Personnel");
        Pilote p = new Pilote("P01", "Thomas", "Paris", "0606", "EMP01", "2023", "A320", 5000);
        System.out.println("Rôle détecté : " + p.ObternirRole());

        System.out.println("--- TEST TERMINÉ ---");
    }
}