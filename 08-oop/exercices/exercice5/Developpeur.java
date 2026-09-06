public class Developpeur extends Employe{
	public int nombreProjets;
	
	public Developpeur(String nom, double salaireBase, int nombreProjets){
		super(nom, salaireBase);
		this.nombreProjets = nombreProjets;
	}
	@Override
	public double calculerSalaire(){
		double salaire = 0;
		for(int i = 0;i<nombreProjets;i++){
			salaire+=200;
		}
		return salaireBase + salaire;
	}
	public void coder(){
		System.out.println("["+nom+"] code avec passion");
	}
}
	
	