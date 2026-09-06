public class Employe{
	public String nom;
	public double salaireBase;
	
	public Employe(String nom, double salaireBase){
		this.nom = nom;
		this.salaireBase = salaireBase;
	}
	public void afficherInfos(){
		System.out.println("Nom : [" + nom + "], Salaire de base : ["+salaireBase+"]");
	}
	public double calculerSalaire(){
		return salaireBase;
	}
}