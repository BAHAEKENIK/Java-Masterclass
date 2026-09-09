public class Paire<K, V>{
	private K cle;
	private V valeur;
	public Paire(K cle, V valeur){
		this.cle = cle;
		this.valeur = valeur;
	}
	public K getcle(){
		return cle;
	}
	public void setCle(K cle){
		this.cle = cle;
	}
	public V getValeur(){
		return valeur;
	}
	public void setValeur(){
		this.valeur = valeur;
	}
	public void afficher(){
		System.out.println("Cle : ["+cle+", Valeur : ["+valeur+"]");
	}
}
public class Main{
	public static void main(String[] args){
		Paire<String, Integer> paire1 = new Paire<>();
		Paire<String, String> paire2 = new Paire<>();
		paire1.setCle("Age");
		paire1.setValeur(25);
		paire1.afficher();
		paire2.setCle("Nom");
		paire2.setValeur("Alice");
		paire2.afficher();
		paire1.setValeur(26);
		paire2.afficher();
	}
}
		