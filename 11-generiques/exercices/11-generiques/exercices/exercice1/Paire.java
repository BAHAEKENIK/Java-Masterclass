public class Paire<K, V>{
	private K cle;
	private V valeur;
	public Paire(K cle, V valeur){
		this.cle = cle;
		this.valeur = valeur;
	}
	public K getCle(){
		return cle;
	}
	public void setCle(K cle){
		this.cle = cle;
	}
	public V getValeur(){
		return valeur;
	}
	public void setValeur(V valeur){
		this.valeur = valeur;
	}
	public void afficher(){
		System.out.println("Cle : ["+cle+"], Valeur : ["+valeur+"]");
	}
}