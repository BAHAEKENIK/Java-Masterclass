public class CompteBancaire{
	private String titulaire;
	private double solde;
	public CompteBancaire(String titulaire, double solde){
		this.titulaire = titulaire;
		this.solde = solde;
	}
	public String getitulaire(String titulaire){
		return titulaire;
	}
	public double getSolde(double Solde){
		return solde;
	}
	public void setTitulaire(String titulaire){
		if(titulaire != null && !titulaire.isEmpty() && !titulaire.isBlank()){
			this.titulaire = titulaire;
		}
	}
	public void deposer(double montant){
		if(montant > 0){
			solde +=montant;
		}
	}
	public void retirer(double montant){
		if( montant > 0 && solde>montant){
			solde -=montant;
		}
	}
	public void afficherSolde(){
		System.out.println("Titulaire : " + titulaire + ", Solde : " + solde + " $");
	}
}
		