import java.util.*;
import java.util.stream.*;
import java.time.*;

public class GestionReservations {
    public static List<Reservation> reservations = new ArrayList<>();

    public static Optional<Reservation> trouverReservation(String nomPassager) {
        return reservations.stream()
            .filter(r -> r.getNomPassager().equals(nomPassager))
            .findFirst();
    }

    public static List<Reservation> reservationVolsDansFuseau(String fuseau) {
        return reservations.stream()
            .filter(r -> r.getVol().getHeureDepart().getZone().getId().equals(fuseau))
            .collect(Collectors.toList());
    }

    public static Optional<Double> calculerPrixTotal() {
        if (reservations.isEmpty()) {
            return Optional.empty();
        }
        double somme = reservations.stream()
            .map(Reservation::getVol)
            .mapToDouble(Vol::getPrix)
            .sum();
        return Optional.of(somme);
    }

    public static List<Reservation> reservationsTrieesParDate() {
        return reservations.stream()
            .sorted(Comparator.comparing(r -> r.getVol().getHeureDepart()))
            .collect(Collectors.toList());
    }
}