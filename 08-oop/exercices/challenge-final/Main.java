public class Main{
	public static void main(String[] args){
		Vehicule[] vehicules  = new Vehicule[2];
		vehicules[0] = new VoitureParticuliere("AB-123-CD","Clio", 2022,5);
		vehicules[1] =new Camion("XY-789-ZZ","Mega",2021,15);
		
		for(Vehicule v : vehicules){
			v.afficherInfos();
			v.calculerEntretien();
			if(v instanceof Assurable){
				((Assurable) v).afficherAssurance();
			}
		}
	}
}