public class Exercice4{
	public static void tenterDeModifier(int nombre){
		System.out.println("Dans la methode, avant modif: " + nombre);
		nombre = 999;
		System.out.println("Dans la methode, apres modif : " + nombre);
	}
	public static void main(String[] args){
		int valeur = 10;
		System.out.println("Avant l'appel : " + valeur);
		tenterDeModifier(valeur);
		System.out.println("Apres l'appel : " + valeur);
	}
	
}
	