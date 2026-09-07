public class Main{
	public static void main(String[] args){
		Paiment[] paiments = new Paiment[2];
		paiments[0] = new CarteBancaire("1234-5678-9012-3456", "Alice");
		paiments[1] = new Paypal("alide@gmail.com");
		
		for(Paiment p : paiments){
			p.afficherInfos();
			p.effectuerPaiement(150.0);
		}
	}
	
}
		