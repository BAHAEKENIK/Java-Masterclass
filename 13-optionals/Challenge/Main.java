import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        // Initialisation des commandes
        GestionCommandes.commandes.add(new Commande("CMD001",
                new Client("Alice", "alice@mail.com", "0612345678"), 150.0, "Paris"));
        GestionCommandes.commandes.add(new Commande("CMD002",
                new Client("Bob", "bob@mail.com", null), 200.0, "Lyon"));
        GestionCommandes.commandes.add(new Commande("CMD003",
                new Client("Charlie", null, "0698765432"), 75.5, "Marseille"));
        GestionCommandes.commandes.add(new Commande("CMD004",
                new Client("Diana", "diana@mail.com", "0611223344"), 320.0, "Bordeaux"));

        // 1. Trouver la commande CMD001
        System.out.println("--- Commande CMD001 ---");
        GestionCommandes.trouverCommande("CMD001")
                .ifPresentOrElse(
                        c -> System.out.println(c),
                        () -> System.out.println("Commande introuvable"));

        // 2. Email du client de CMD001
        System.out.println("\n--- Email du client de CMD001 ---");
        System.out.println(GestionCommandes.trouverEmailClient("CMD001")
                .orElse("Email non renseigné"));

        // 3. Téléphone du client de CMD002 (téléphone null)
        System.out.println("\n--- Téléphone du client de CMD002 ---");
        System.out.println(GestionCommandes.trouverTelephoneClient("CMD002")
                .orElse("Téléphone non renseigné"));

        // 4. Email du client de CMD003 (email null)
        System.out.println("\n--- Email du client de CMD003 ---");
        System.out.println(GestionCommandes.trouverEmailClient("CMD003")
                .orElse("Email non renseigné"));

        // 5. Commande inexistante
        System.out.println("\n--- Commande CMD999 ---");
        GestionCommandes.trouverCommande("CMD999")
                .ifPresentOrElse(
                        c -> System.out.println(c),
                        () -> System.out.println("Commande introuvable"));

        // 6. Montant total
        System.out.println("\n--- Montant total ---");
        GestionCommandes.calculerMontantTotal()
                .ifPresentOrElse(
                        total -> System.out.println(total),
                        () -> System.out.println("Aucune commande"));
    }
}