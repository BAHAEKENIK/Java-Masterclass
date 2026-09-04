public class Exercice5{
	public static void main(String[] args){
		System.out.println(estPair(10));
		System.out.println(estPair(7));
		System.out.println(maxDeux(15,22));
		System.out.println(maxDeux(30, 12));
	}
	public static boolean estPair(int nombre){
		if(nombre % 2 == 0){
			return true;
		}
		return false;
	}
	public static int maxDeux(int a, int b){
		if(a>b){
			return a;
		}
		return b;
	}
}