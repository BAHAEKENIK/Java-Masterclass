public class Voiture extends Vehicule{
	public int nombrePortes;
	
	public Voiture(String marque,int annee, int nombrePortes){
		super(marque, annee);
		this.nombrePortes = nombrePortes;
	}
	public void klaxonner(){
		System.out.println("La voiture klaxonne : Pouet Pouet !");
	}
	@Override
	public void demarrer(){
		System.out.println("La voiture demarre avec le moteur.");
	}
}