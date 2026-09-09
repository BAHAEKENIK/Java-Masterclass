public class GestionnaireBoites{
	public static void transferer(Conteneur<T> source, Conteneur<T> destination, int nombre){
		int transferts = 0;
		while(transferts < nombre && !estVide()){
			T element = source.retirer();
			destination.ajouter(element);
			transferts++;
			System.out.println(element + "trasnfert de source a destination");
		}
		System.out.println("la trasnsmission transfert success");
	}
}
		