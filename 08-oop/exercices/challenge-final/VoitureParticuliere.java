public class VoitureParticuliere extends Vehicule implements Assurable{
	public int nombrePlaces;
	public VoitureParticuliere(String immatriculation, String modele, int annee, int nombrePlaces){
		super(immatriculation, modele, annee);
		this.nombrePlaces = nombrePlaces;
	}
	@Override
	public double calculerEntretien(){
		return 100.0+(annee-2020)*10;
	}
	@Override
	public double calculerPrimeAssurance(){
		return 200.0 + nombrePlaces *10;
	}
	@Override 
	public void afficherAssurance(){
		System.out.println("Prime d'assurance: ["+calculerPrimeAssurance()+"$");
	}
}