public class Exercice1{
	public static void main(String[] args){
		String nom1 = "Alice";
		String nom2 = "Alice";
		String nom3 = new String("Alice");
		System.out.println(nom1 == nom2);
		System.out.println(nom1 == nom3);
		System.out.println(nom1.equals(nom2));
		System.out.println(nom1.equals(nom3));
	}
}