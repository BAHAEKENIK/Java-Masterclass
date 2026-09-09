public class GestionnaireBoites {
    public static <T> void transferer(Conteneur<T> source, Conteneur<T> destination, int nombre) {
        int transferts = 0;
        while (transferts < nombre && !source.estVide()) {
            T element = source.retirer();
            destination.ajouter(element);
            transferts++;
            System.out.println("Transfert de " + element);
        }
        System.out.println("Transfert terminé. (" + transferts + " élément(s) déplacé(s))");
    }
}