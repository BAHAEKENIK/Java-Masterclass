public class Utilitaires {
    public static <T> void afficherTableau(T[] tableau) {
        for (T element : tableau) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static <T> boolean estEgal(T a, T b) {
        if (a == null && b == null) return true;
        if (a == null || b == null) return false;
        return a.equals(b); // ✅ Utilise equals()
    }

    public static <T extends Comparable<T>> T plusGrand(T a, T b) {
        return (a.compareTo(b) > 0) ? a : b;
    }

    @SuppressWarnings("unchecked")
    public static <T> T[] inverser(T[] tableau) {
        int len = tableau.length;
        T[] newTableau = (T[]) new Object[len]; // ✅ Cast nécessaire
        int index = 0;
        for (int i = len - 1; i >= 0; i--) {
            newTableau[index] = tableau[i];
            index++;
        }
        return newTableau;
    }

    public static void main(String[] args) {
        Integer[] tableau = {1, 2, 3, 4, 5};
        System.out.print("Tableau original : ");
        afficherTableau(tableau);

        tableau = inverser(tableau); // ✅ Capture de la valeur de retour
        System.out.print("Tableau inversé : ");
        afficherTableau(tableau);

        System.out.println("\"Bonjour\" et \"Bonjour\" sont égaux ? " + estEgal("Bonjour", "Bonjour"));
        System.out.println("15 et 22 : le plus grand est " + plusGrand(15, 22));
    }
}