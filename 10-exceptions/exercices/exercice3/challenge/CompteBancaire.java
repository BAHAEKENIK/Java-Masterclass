public class CompteBancaire{
	private double solde;
	private String titulaire;
	public CompteBancaire(String titulaire, double solde) throws CompteException{
		if(solde<0){
			throw new CompteException("Le solde initial ne peut pas etre negatif");
		}
		this.titulaire = titulaire;
		this.solde = solde;
	}
	public double getSolde(){
		return this.solde;
	}
	public String getTitulaire(){
		return this.titulaire;
	}
	public void setSolde(double solde){
		this.solde = solde;
	}
	public void setTitulaire(String titulaire){
		this.titulaire = titulaire;
	}
	public void deposer(double montant) throws CompteException{
		if(montant<=0){
			throw new CompteException("Montant de depot invalide");
		}
		else{
			this.solde  +=montant;
			System.out.println("Depot "+ montant +" $ effectue.");
		}
	}
	public void retirer(double montant) throws CompteException{
		if(montant <=0){	
			throw new CompteException("Montant de retrait invalide");
		}
		else if (montant > this.solde){
			throw new CompteException("Solde insuffisant");
		}
		else{
			this.solde -=montant;
			System.out.println("Retrait de "+ montant +"effectue");
		}
	}
	public void afficherSolde(){
		System.out.println("Titulaire : "+ titulaire +", Solde: "+ solde +" $");
	}
}
	