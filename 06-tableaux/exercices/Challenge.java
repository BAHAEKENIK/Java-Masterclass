public class Challenge {
    public static void main(String[] args) {
        int[][] notes = {
            {15, 18, 14, 16},
            {8, 10, 9, 11},
            {12, 14, 16, 13},
            {10, 15, 12, 17}
        };

        afficherMatrice(notes);

        System.out.println("Moyenne de l'etudiant 1 : " + calculerMoyenneEtudiant(notes, 0));
        System.out.println("Moyenne de la matiere 2 : " + calculerMoyenneMatiere(notes, 1));
        System.out.println("Meilleure note : " + meilleureNote(notes));
        System.out.println("Pire note : " + pireNote(notes));

        if (rechercherNote(notes, 16)) {
            System.out.println("La note 16 est presente.");
        } else {
            System.out.println("La note 16 n'est pas presente.");
        }

        System.out.println("Nombre de notes >= 12 : " + compterNotesSuperieures(notes, 12));
    }

    public static void afficherMatrice(int[][] matrice) {
        System.out.println("Matrices des notes : ");
        for (int i = 0; i < matrice.length; i++) {
            System.out.print("Etudiant " + (i + 1) + " : ");
            for (int j = 0; j < matrice[i].length; j++) {
                System.out.print(matrice[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static double calculerMoyenneEtudiant(int[][] matrice, int etudiantIndex) {
        int somme = 0;
        for (int i = 0; i < matrice[etudiantIndex].length; i++) {
            somme += matrice[etudiantIndex][i];  // ← j corrigé en i
        }
        return (double) somme / matrice[etudiantIndex].length;
    }

    public static double calculerMoyenneMatiere(int[][] matrice, int matiereIndex) {
        int somme = 0;
        for (int i = 0; i < matrice.length; i++) {
            somme += matrice[i][matiereIndex];
        }
        return (double) somme / matrice.length;
    }

    public static int meilleureNote(int[][] matrice) {
        int max = matrice[0][0];
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                if (matrice[i][j] > max) {
                    max = matrice[i][j];
                }
            }
        }
        return max;
    }

    public static int pireNote(int[][] matrice) {
        int min = matrice[0][0];
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                if (matrice[i][j] < min) {
                    min = matrice[i][j];
                }
            }
        }
        return min;
    }

    public static boolean rechercherNote(int[][] matrice, int valeur) {
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                if (matrice[i][j] == valeur) {
                    return true; // On peut retourner directement
                }
            }
        }
        return false;
    }

    public static int compterNotesSuperieures(int[][] matrice, int seuil) {
        int nombre = 0;
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                if (matrice[i][j] >= seuil) { // ← >= au lieu de >
                    nombre++;
                }
            }
        }
        return nombre;
    }
}