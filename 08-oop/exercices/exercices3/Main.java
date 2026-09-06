public class Main{
	public static void main(String[] args){
		CompteBancaire compte = new CompteBancaire("Alice",1000.0);
		compte.afficherSolde();
		compte.deposer(250.0);
		compte.retirer(150.0);
		try{
			compte.retirer(2000.0);
		}catch(Exception e){
			System.out.println("can't retirer");
		}
		compte.afficherSolde();
	}
}