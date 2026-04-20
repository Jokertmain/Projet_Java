import java.util.ArrayList;
import java.util.List;

public class Reservation {
    String numeroReservation;
    String dateReservation;
    String statut;
    public static List<Reservation> listeReservations = new ArrayList<>();

    public Reservation(String numeroReservation, String dateReservation, String statut) {
        this.numeroReservation = numeroReservation;
        this.dateReservation = dateReservation;
        this.statut = statut;
    }

    public static void ajouterReservation(Reservation r) {
        listeReservations.add(r);
        System.out.println("Réservation " + r.numeroReservation + " ajoutée.");
    }

    public static Reservation trouverReservation(String numeroReservation) {
        for (int i = 0; i < listeReservations.size(); i++) {
            Reservation r = listeReservations.get(i);
            if (listeReservations.get(i).numeroReservation.equals(numeroReservation)) {
                return listeReservations.get(i);
            }
        }
        System.out.println("Reservation introuvable.");
        return null;
    }

    public static void supprimerReservation(String numeroReservation) {
        for (int i = 0; i < listeReservations.size(); i++) {
            if (listeReservations.get(i).numeroReservation.equals(numeroReservation)) {
                listeReservations.remove(i);
                System.out.println("Reservation " + numeroReservation + " supprimé.");
                return;
            }
        }
    }

    public String getNumeroReservation() {
        return numeroReservation;
    }

    public String confirmerReservation(){
        this.statut = "Confirmée";
        return "La réservation " + numeroReservation + " est confirmée.";
    }
    public String annulerReservation() {
        this.statut = "Annulée";
        return "La réservation " + numeroReservation + " a été annulée.";
    }
}
