public class Cercle extends Forme{
	public double rayon;
	public Cercle(String couleur, double rayon){
		super(couleur);
		this.rayon = rayon;
	}
	@Override
	public double calculerAire(){
		return Math.PI * rayon *rayon;
	}
	@Override
	public double calculerPerimetre(){
		return 2 * Math.PI * rayon;
	}
}
	