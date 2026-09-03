public class Exercice5{
	public static void main(String[] args){
		int choix = 7;
		switch(choix){
			case 1:
				System.out.println("Creer un compte");
				break;
			case 2:
				System.out.println("Se connecter");
				break;
			case 3:
				System.out.println("Voir le profil");
				break;
			case 4:
				System.out.println("Quitter");
				break;
			default:
				System.out.println("Choix invalide");
				break;
		}
	}
}