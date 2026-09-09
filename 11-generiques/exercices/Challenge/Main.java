public class Main {
    public static void main(String[] args) {
        Boite<String> boite1 = new Boite<>();
        Boite<String> boite2 = new Boite<>();

        boite1.ajouter("A");
        boite1.ajouter("B");
        boite1.ajouter("C");
        boite1.ajouter("D");
        boite1.ajouter("E");

        System.out.print("Boîte 1 avant transfert : ");
        boite1.afficher();
        System.out.print("Boîte 2 avant transfert : ");
        boite2.afficher();

        System.out.println("\n--- Transfert ---");
        GestionnaireBoites.transferer(boite1, boite2, 3);

        System.out.print("\nBoîte 1 après transfert : ");
        boite1.afficher();
        System.out.print("Boîte 2 après transfert : ");
        boite2.afficher();
    }
}