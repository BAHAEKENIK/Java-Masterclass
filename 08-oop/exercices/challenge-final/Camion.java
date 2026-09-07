public class Camion extends Vehicule implements Assurable{
	public int poidsMax;
	public Camion(String immatriculation, String modele, int annee, int poidsMax){
		super(immatriculation, modele, annee);
		this.poidsMax  = poidsMax;
	}
	@Override
	public double calculerEntretien(){
		return 200.0 + poidsMax *20;
	}
	@Override
	public double calculerPrimeAssurance(){
		return 500.0 + poidsMax * 50;
	}
	@Override 
	public void afficherAssurance(){
		System.out.println("Prime d'assurance : [" + calculerPrimeAssurance() +"] $");
	}
}