import java.time.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Création des vols
        Vol af123 = new Vol("AF123", "Paris", "Tokyo",
            ZonedDateTime.of(LocalDateTime.of(2026, 12, 25, 10, 0), ZoneId.of("Europe/Paris")),
            ZonedDateTime.of(LocalDateTime.of(2026, 12, 26, 7, 0), ZoneId.of("Asia/Tokyo")),
            850.0);

        Vol ua456 = new Vol("UA456", "New York", "Paris",
            ZonedDateTime.of(LocalDateTime.of(2026, 12, 25, 18, 0), ZoneId.of("America/New_York")),
            ZonedDateTime.of(LocalDateTime.of(2026, 12, 26, 7, 0), ZoneId.of("Europe/Paris")),
            650.0);

        Vol jl789 = new Vol("JL789", "Tokyo", "New York",
            ZonedDateTime.of(LocalDateTime.of(2026, 12, 26, 12, 0), ZoneId.of("Asia/Tokyo")),
            ZonedDateTime.of(LocalDateTime.of(2026, 12, 26, 10, 0), ZoneId.of("America/New_York")),
            1200.0);

        // Création des réservations
        GestionReservations.reservations.add(new Reservation("Alice", af123,
            ZonedDateTime.now(), "CONFIRMEE"));
        GestionReservations.reservations.add(new Reservation("Bob", ua456,
            ZonedDateTime.now(), "CONFIRMEE"));
        GestionReservations.reservations.add(new Reservation("Charlie", jl789,
            ZonedDateTime.now(), "CONFIRMEE"));

        // Affichage
        System.out.println("--- Toutes les réservations ---");
        GestionReservations.reservations.forEach(System.out::println);

        System.out.println("\n--- Réservation d'Alice ---");
        GestionReservations.trouverReservation("Alice")
            .ifPresentOrElse(System.out::println, () -> System.out.println("Non trouvée"));

        System.out.println("\n--- Prix total ---");
        GestionReservations.calculerPrixTotal()
            .ifPresentOrElse(System.out::println, () -> System.out.println("Aucune réservation"));

        System.out.println("\n--- Réservations triées par date de départ ---");
        GestionReservations.reservationsTrieesParDate().forEach(System.out::println);

        System.out.println("\n--- Réservations au départ de Paris ---");
        GestionReservations.reservationVolsDansFuseau("Europe/Paris").forEach(System.out::println);
    }
}