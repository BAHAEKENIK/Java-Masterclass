public class CompteBancaire{
	private double solde;
	public CompteBancaire(double solde){
		this.solde=solde;
	}
	public double getSolde(){
		return this.solde;
	}
	public void setSolde(double solde){
		this.solde = solde;
	}
	public void retirer(double montant) throws CompteException{
		if(montant <= 0){
			throw new CompteException("Montant Invalide");
		}
		else if(montant >solde){
			throw new CompteException("Solde Insuffisant");
		}
		else{
			solde -=montant;
			System.out.println("Retrait de "+montant +" $ effectue");
		}
	}
	public void afficherSolde(){
		System.out.println("le solde de compte est "+solde);
	}
}
		