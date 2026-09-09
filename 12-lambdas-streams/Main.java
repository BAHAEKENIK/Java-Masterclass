import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        // 1. Liste d'étudiants
        List<Etudiant> etudiants = Arrays.asList(
            new Etudiant("Alice", 22, 18.5, "Informatique"),
            new Etudiant("Bob", 20, 16.0, "Mathematiques"),
            new Etudiant("Charlie", 23, 14.2, "Informatique"),
            new Etudiant("Diana", 21, 19.0, "Physique"),
            new Etudiant("Evan", 22, 15.0, "Mathematiques"),
            new Etudiant("Fiona", 22, 15.0, "Informatique"),
            new Etudiant("George", 19, 13.8, "Physique"),
            new Etudiant("Hannah", 21, 17.5, "Mathematiques")
        );

        // a) Tous les étudiants triés par moyenne décroissante
        System.out.println("--- Étudiants triés par moyenne décroissante ---");
        etudiants.stream()
            .sorted((a, b) -> Double.compare(b.getMoyenne(), a.getMoyenne()))
            .forEach(System.out::println);

        // b) Étudiants en Informatique (noms uniques)
        System.out.println("\n--- Étudiants en Informatique ---");
        etudiants.stream()
            .filter(e -> e.getFiliere().equals("Informatique"))
            .map(Etudiant::getNom)
            .distinct()
            .forEach(System.out::println);

        // c) Moyenne générale
        double moyenneGenerale = etudiants.stream()
            .mapToDouble(Etudiant::getMoyenne)
            .average()
            .orElse(0.0);
        System.out.println("\nMoyenne générale : " + moyenneGenerale);

        // d) Meilleur étudiant
        Etudiant meilleur = etudiants.stream()
            .max(Comparator.comparingDouble(Etudiant::getMoyenne))
            .orElse(null);
        System.out.println("\n--- Meilleur étudiant ---");
        System.out.println(meilleur);

        // e) Étudiants majeurs (>= 18) triés par âge croissant
        System.out.println("\n--- Étudiants majeurs ---");
        etudiants.stream()
            .filter(e -> e.getAge() >= 18)
            .sorted(Comparator.comparingInt(Etudiant::getAge))
            .forEach(System.out::println);

        // f) Moyenne des étudiants en Mathématiques
        double moyenneMaths = etudiants.stream()
            .filter(e -> e.getFiliere().equals("Mathematiques"))
            .mapToDouble(Etudiant::getMoyenne)
            .average()
            .orElse(0.0);
        System.out.println("\nMoyenne des étudiants en Mathématiques : " + moyenneMaths);

        // g) Grouper par filière et compter
        System.out.println("\n--- Étudiants par filière ---");
        Map<String, Long> groupement = etudiants.stream()
            .collect(Collectors.groupingBy(Etudiant::getFiliere, Collectors.counting()));
        groupement.forEach((filiere, count) -> System.out.println(filiere + " : " + count));

        // h) Étudiants dont le nom commence par "A"
        System.out.println("\n--- Étudiants commençant par A ---");
        etudiants.stream()
            .filter(e -> e.getNom().startsWith("A"))
            .forEach(System.out::println);
    }
}