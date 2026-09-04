public class Exercice1{
	public static void direBonjour(){
		System.out.println("Bonjour depuis la methode static !");
	}
	public void direAurevoir(){
		System.out.println("Au revoir depuis la methode non-static !");
	}
	public static void main(String[] args){
		direBonjour();
		Exercice1 ex1 = new Exercice1();
		ex1.direAurevoir();
	}
}