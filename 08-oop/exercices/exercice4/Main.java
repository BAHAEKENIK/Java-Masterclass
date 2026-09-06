public class Main{
	public static void main(String[] args){
		Vehicule veh = new Vehicule("Toyota",2020);
		Voiture voi = new Voiture("Peugeut", 2022,5);
		veh.demarrer();
		veh.afficherInfos();
		voi.demarrer();
		voi.afficherInfos();
	}
}