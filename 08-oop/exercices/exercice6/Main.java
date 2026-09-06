public class Main{
	public static void main(String[] args){
		Forme[] formes = new Forme[2];
		formes[0] = new Cercle("Rouge",5.0);
		formes[1] = new Rectangle("Bleu",4.0,6.0);
		
		for(Forme forme : formes){
			if(forme instanceof Cercle){
				Cercle cer = (Cercle) forme;
				System.out.println("Couleur est "+cer.couleur+"le rayon est "+cer.rayon);
			}
			if(forme instanceof Rectangle){
				Rectangle reg = (Rectangle) forme;
				System.out.println("Couleur est "+reg.couleur+"longeur de rectangle est "+reg.longeur+" la largeur de rectangle est "+reg.largeur);
			}
		}
	}
}