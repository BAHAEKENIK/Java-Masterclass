public class Challenge{
	public static void main(String[] args){
		double solde = 1200.50;
		double montantRetrait = 500.00;
		String typeCompte = "PREMIUM";
		boolean estDecouvertAutorise = true;
		double plafondDecouvet = 200.00;
		double soldeApresRetrait = solde - montantRetrait;
		double plafondDecouvertNegatif = (-1) * plafondDecouvet;
		if(soldeApresRetrait >= plafondDecouvertNegatif && typeCompte == "VIP" && estDecouvertAutorise){
			System.out.println("Retrait VIP effectue avec succes");
			solde=soldeApresRetrait;
		}else if(soldeApresRetrait >= plafondDecouvertNegatif && typeCompte == "PREMIUM" && estDecouvertAutorise){
			System.out.println("Retrait Premium effectue");
			solde = soldeApresRetrait;
		}else if(soldeApresRetrait>= plafondDecouvertNegatif && typeCompte == "STANDARD" && soldeApresRetrait>=0 && estDecouvertAutorise){
			System.out.println("Retrait Standard effectue");
			solde = soldeApresRetrait;
		}else if(soldeApresRetrait>= plafondDecouvertNegatif && typeCompte == "STANDARD" && estDecouvertAutorise){
			System.out.println("Retrait Standard avec decouvert autorise");
			solde = soldeApresRetrait;
		}else{
			System.out.println("Retrait refuse : fonds insufisants");
		}
	}
}

			