public class Exercice1{
	public static void main(String[] args){
		System.out.println("10 / 2 = "+diviser(10,2));
		try{
			diviser(10,0);
		}catch(ArithmeticException e){
			System.out.println("Erreur : devision par zero impossible !");
		}
		finally{
			System.out.println("Operation terminee.");
		}
	}
	public static int diviser(int a, int b){
		return a/b;
	}
	
}