public class Main{
	public static void main(String[] args){
		Employe[] employes = new Employe[3];
		employes[0] = new Developpeur("Alice",300,3);
		employes[1] = new Manager("Bob",4000,2);
		employes[2] = new Employe("Chalie",2500);
		for (Employe employe : employes){
			employe.afficherInfos();
			System.out.println("le salaire est "+employe.calculerSalaire());
			if(employe instanceof Developpeur){
				Developpeur dev = (Developpeur) employe;
				dev.coder();
			}
			if(employe instanceof Manager){
				Manager mgr = (Manager) employe;
				mgr.manager();
			}
		}
	}
	
}
		