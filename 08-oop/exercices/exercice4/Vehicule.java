public class Vehicule{
	public String marque;
	public int annee;
	
	public Vehicule(String marque, int annee){
		this.marque = marque;
		this.annee= annee;
	}
	public void demarrer(){
		System.out.println("LE Vehicule demarre.");
	}
	public void afficherInfos(){
		System.out.println("Marque : ["+marque+"], Annee : ["+annee+"]");
	}
}