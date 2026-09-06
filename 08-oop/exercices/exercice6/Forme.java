public abstract class Forme{
	public String couleur;
	public Forme(String couleur){
		this.couleur = couleur;
	}
	public void afficherCouleur(){
		System.out.println("Couleur : "+ couleur);
	}
	public abstract double calculerAire();
	public abstract double calculerPerimetre();
}