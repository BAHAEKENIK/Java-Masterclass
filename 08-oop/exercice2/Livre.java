public class Livre{
	public String titre;
	public String auteur;
	public int nombrePages;
	public Livre(String titre, String auteur, int nombrePages){
		this.titre = titre;
		this.auteur = auteur;
		this.nombrePages = nombrePages;
	}
	public void afficherDetails(){
		System.out.println("Titre : ["+titre+"], Auteur : ["+auteur+"], Pages : ["+nombrePages+"]");
	}
}