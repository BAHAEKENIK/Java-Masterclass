public class Exercice3{
	public static void main(String[] args){
		afficher(10);
		afficher("Test");
		afficher(5, "Java");
	}
	public static void afficher(int x){
		System.out.println("Entier: " + x);
	}
	public static void afficher(String s){
		System.out.println("Chaine: " + s);
	}
	public static void afficher(int x, String s){
		System.out.println("Entier : " + x +",  Chaine : " + s);
	}
}