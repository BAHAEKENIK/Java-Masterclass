public class Rectangle extends Forme{
	public double longeur;
	public double largeur;
	public Rectangle(String couleur, double longeur, double largeur){
		super(couleur);
		this.longeur = longeur;
		this.largeur = largeur;
	}
	@Override 
	public double calculerAire(){
		return longeur * longeur;
	}
	@Override
	public double calculerPerimetre(){
		return 2 * (longeur + largeur);
	}
	
}