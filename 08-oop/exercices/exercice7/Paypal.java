public class Paypal implements Paiment{
	public String email;
	public Paypal(String email){
		this.email = email;
	}
	@Override 
	public void effectuerPaiement(double montant){
		System.out.println("Paiement de [ "+ montant +"] $ effectue avec Paypal (["+email+"]");
	}
	public void afficherInfos(){
		System.out.println("Paypal - Email : ["+email+"]");
	}
	
}