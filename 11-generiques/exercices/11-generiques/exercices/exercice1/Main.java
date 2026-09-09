public class Main{
	public static void main(String[] args){
		Paire<String, Integer> paire1 = new Paire<>("Age", 25);
		paire1.afficher();
		Paire<String, String> paire2 = new Paire<>("Nom","Alice");
		paire2.afficher();
		paire1.setValeur(26);
		paire1.afficher();
	}
}