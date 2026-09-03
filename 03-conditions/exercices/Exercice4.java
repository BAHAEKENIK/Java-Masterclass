public class Exercice4{
	public static void main(String[] args){
		int age = 25;
		boolean aBadge = true;
		boolean estEnRetard = true;
		if(age >= 18 && aBadge && !estEnRetard){
			System.out.println("Acces autorise");
		}else{
			System.out.println("Acces refuse");
		}
	}
}