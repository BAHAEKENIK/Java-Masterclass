import java.time.*;

public class Vol {
    private String numeroVol;
    private String depart;
    private String arrivee;
    private ZonedDateTime heureDepart;
    private ZonedDateTime heureArrivee;
    private double prix;

    public Vol(String numeroVol, String depart, String arrivee,
               ZonedDateTime heureDepart, ZonedDateTime heureArrivee, double prix) {
        this.numeroVol = numeroVol;
        this.depart = depart;
        this.arrivee = arrivee;
        this.heureDepart = heureDepart;
        this.heureArrivee = heureArrivee;
        this.prix = prix;
    }

    public String getNumeroVol() { return numeroVol; }
    public String getDepart() { return depart; }
    public String getArrivee() { return arrivee; }
    public ZonedDateTime getHeureDepart() { return heureDepart; }
    public ZonedDateTime getHeureArrivee() { return heureArrivee; }
    public double getPrix() { return prix; }

    @Override
    public String toString() {
        return numeroVol + " (" + depart + " → " + arrivee + ")";
    }
}