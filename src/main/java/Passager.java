public class Passager extends Personnes{
    String passeport;

    public Passager(String identifiant,String nom,String adresse,String contact,String passeport){
       super(identifiant,nom,adresse,contact);
       this.passeport = passeport;
    }

    public void reserverVol(String numeroReservation, String dateResevartion){
        System.out.println("Le passager " + nom + " a réservé un vol.");
    }

    public void annulerReservation(String numeroReservation){
        System.out.println("La réservation du passager " + nom + " a été annulée.");
    }

    public String obtenirReservations(){
        return("Liste des réservations pour le passeport : " + passeport);
    }
}
