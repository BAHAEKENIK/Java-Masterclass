public class Main{
	public static void main(String[] args){
		CompteBancaire compte = new CompteBancaire(1000.0);
		try{
			compte.retirer(-100.0);
		}catch(CompteException e){
			System.out.println("Erreur : "+e.getMessage());
		}
	}
}