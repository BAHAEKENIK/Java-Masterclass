import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		int choix = 0;
		Scanner scanner = new Scanner(System.in);
			System.out.print("Entre vote nom");
			String nom = scanner.nextLine();
			System.out.print("Entre votre solde");
			double solde = scanner.nextDouble();
			CompteBancaire compte = new CompteBancaire(nom, solde);
		do{
			afficherMenu();
			System.out.print("Votre choix : ");
			choix = scanner.nextInt();
			try{
				if(choix ==1){
					System.out.print("Montant a deposer : ");
					double montant = scanner.nextDouble();
					compte.deposer(montant);
				}else if(choix == 2){
					System.out.print("Montant a retirer : ");
					double montant = scanner.nextDouble();
					compte.retirer(montant);
				}else if(choix == 3){
					compte.afficherSolde();
				}else if (choix == 4){
					break;

				}else{
					System.out.println("choix invalide");
				}
			}
			catch(CompteException e){
				System.out.println("Erreur : " + e.getMessage());
			}
		}while(choix != 4);
		System.out.println("Au revoir");
		
	}
	public static void afficherMenu(){
		System.out.println("1 . Deposer\n2. Retirer\n3. Afficher le solde\n4. Quitter");
	}
}