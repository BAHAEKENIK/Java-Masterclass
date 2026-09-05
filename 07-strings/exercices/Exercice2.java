public class Exercice2{
	public static void main(String[] args){
		String texte = " Java est un langage puissant ";
		System.out.println("la longeur de chaine de caracters est " + texte.length());
		System.out.println("la longeur son espace de debut est fin est " + texte.trim());
		System.out.println("le texte en majuscule est " + texte.toUpperCase());
		System.out.println("le texte en miniscule est " + texte.toLowerCase());
		System.out.println("le texte commence par ' Java' est "+texte.startsWith(" Java"));
		System.out.println("le texte containes mot 'langage' est "+ texte.contains("langage"));
		System.out.println("le texte termine par mot 'puissant ' est "+texte.endsWith("puissant "));
		System.out.println("la sous-chaine de caractres 3 au caractere 10 est "+texte.substring(3,10));
	}
}