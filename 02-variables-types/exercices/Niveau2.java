public class Niveau2{
	public static void main(String[] args){
		int a = 12;
		int b = 8;
		System.out.println("La somme de a + b = "+(a+b));
		double prixHT = 100;
		int tva = 20;
		double prixTtc = prixHT + (prixHT*tva / 100);
		System.out.println("Le prixTtc est "+ prixTtc);
		int x = 5.5;
	}
}
