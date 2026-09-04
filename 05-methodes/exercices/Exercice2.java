public class Exercice2{
	public static void main(String[] args){
		int x = carre(5);
		int y = carre(10);
		String name = "Alice";
		System.out.println("la valeur de x est "+x);
		System.out.println("la valeur de y est "+y);
		System.out.println("the name is "+ name);
	}
	public static int carre(int x){
		return x*x;
	}
	public static void afficherBonjour(String nom){
		System.out.println("Bonjour, " + nom + " !");
	}
}