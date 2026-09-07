public abstract class Vehicule {
	protected String immatriculation;
	protected String modele;
	protected int annee;
	public Vehicule(String immatriculation, String modele, int annee){
		this.immatriculation  = immatriculation;
		this.modele = modele;
		this.annee = annee;
	}
	public String getImmatriculation(){
		return immatriculation;
	}
	public String getModele(){
		return modele;
	}
	public int getAnnee(){
		return annee;
	}
	public void setImmatriculation(String immatriculation){
		this.immatriculation  = immatriculation;
	}
	public void setModele(String modele){
		this.modele = modele;
	}
	public void setAnnee(int annee){
		this.annee = annee;
	}
	public void afficherInfos(){
		System.out.println("immatriculation est ["+immatriculation+"], modele est ["+modele+"], annee est ["+annee+"]");
	}
	public abstract double calculerEntretien();
	
}
	
	