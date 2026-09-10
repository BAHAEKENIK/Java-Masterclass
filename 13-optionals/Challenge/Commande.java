public class Commande{
	private String numero;
	private Client client;
	private double montant;
	private String adresseLivraison;
	
	public Commande(String numero, Client client, double montant, String adresseLivraison){
		this.numero = numero;
		this.client = client;
		this.montant = montant ;
		this.adresseLivraison = adresseLivraison;
	}
	public String getNumero(){
		return numero;
	}
	public Client getClient(){
		return client;
	}
	public double getMontant(){
		return montant;
	}
	public String getAdresseLivraison(){
		return adresseLivraison;
	}
	public void setNumero(String numero){
		this.numero = numero;
	}
	public void setClient(Client client){
		this.client = client;
	}
	public void setMontant(double montant){
		this.montant = montant;
	}
	public void setAdresseLivraison(String adresseLivraison){
		this.adresseLivraison = adresseLivraison;
	}
}