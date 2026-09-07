public class CarteBancaire implements Paiment{
	public String numero;
	public String titulaire;
	public CarteBancaire(String numero, String titulaire){
		this.numero = numero;
		this.titulaire = titulaire;
	}
	@Override 
	public void effectuerPaiement(double montant){
		System.out.println("Paiment de [" + montant+"] $ effectue avec la carte ["+numero+"]");
	}
	@Override 
	public void afficherInfos(){
		System.out.println("Carte Bancaire - Titulaire ["+titulaire+"], Numero : ["+numero+"]");
	}
}