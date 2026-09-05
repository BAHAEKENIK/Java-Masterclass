public class Exercice4{
	public static void main(String[] args){
		int[][] notes ={
			{15,18,14},
			{8,10,9},
			{12,14,16}
		};
		System.out.println("Matrice des notes :");
		for(int i = 0;i<notes.length;i++){
			for(int j = 0;j<notes[i].length;j++){
					if(j==notes[i].length-1){
						System.out.println(notes[i][j]);
					}else{
						System.out.print(notes[i][j]+" ");
					}
			}
		}
		System.out.println();
		System.out.println();
		double moyenne;
		int somme = 0;
		System.out.println("Moyennes :");
		for(int i = 0;i<notes.length;i++){
			moyenne = 0;
			somme = 0;
			System.out.print("Etudiant " + (i+1) + " : ");
			for(int j = 0;j<notes[i].length;j++){
				somme+=notes[i][j];
			}
			moyenne=(double)somme/notes[i].length;
			System.out.println(moyenne);
		}
	}
}
				
				
			