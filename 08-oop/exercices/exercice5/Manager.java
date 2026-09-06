public class Manager extends Employe{
	public int nombreEquipes;
	public Manager(String nom, double salaireBase, int nombreEquipes){
		super(nom, salaireBase);
		this.nombreEquipes = nombreEquipes;
	}
	@Override
	public double calculerSalaire(){
		double salaire = 0;
		for(int i = 0;i<nombreEquipes;i++){
			salaire+=500;
		}
		salaireBase = salaireBase + salaire;
		return salaireBase;
	}
	public void manager(){
		System.out.println("["+nom+"] gere l'equipe");
	}
}
	