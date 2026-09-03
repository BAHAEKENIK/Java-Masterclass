public class CorrigeChallenge {
    public static void main(String[] args) {
        double solde = 1200.50;
        double montantRetrait = 500.00;
        String typeCompte = "PREMIUM";
        boolean estDecouvertAutorise = true;
        double plafondDecouvert = 200.00;

        double soldeApresRetrait = solde - montantRetrait;
        double plafondMin = -plafondDecouvert; // Plus lisible

        // 1. Vérification globale de la faisabilité
        if (soldeApresRetrait >= plafondMin && estDecouvertAutorise) {
            
            // 2. Cas selon le type de compte
            if ("VIP".equals(typeCompte)) {
                System.out.println("Retrait VIP effectue avec succes");
                solde = soldeApresRetrait;
            } else if ("PREMIUM".equals(typeCompte)) {
                System.out.println("Retrait Premium effectue");
                solde = soldeApresRetrait;
            } else if ("STANDARD".equals(typeCompte)) {
                if (soldeApresRetrait >= 0) {
                    System.out.println("Retrait Standard effectue");
                } else {
                    System.out.println("Retrait Standard avec decouvert autorise");
                }
                solde = soldeApresRetrait;
            } else {
                System.out.println("Type de compte inconnu");
            }
        } else {
            System.out.println("Retrait refuse : fonds insuffisants ou decouvert non autorise");
        }

        // 3. Utilisation de l'opérateur ternaire (exigence validée)
        String statutSolde = (solde >= 0) ? "Solde positif" : "Solde negatif (decouvert)";
        System.out.println("Nouveau solde : " + solde + " | Statut : " + statutSolde);
    }
}