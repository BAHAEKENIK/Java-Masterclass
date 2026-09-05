public class Exercice3{
	public static void main(String[] args){
		int[] notes = {12, 8, 15, 10, 18, 14, 11, 9, 16, 13};
		int somme=0;
		for(int i = 0;i<notes.length;i++){
			somme +=notes[i];
		}
		System.out.println("Somme : "+somme);
		double moyenne = (double) somme/notes.length;
		System.out.println("Moyenne : "+ moyenne);
		int min=notes[0];
		int max = notes[0];
		for(int i = 0;i<notes.length;i++){
			if(notes[i]>max){
				max = notes[i];
			}
			if(notes[i]<min){
				min = notes[i];
			}
			
		}
		System.out.println("Note la plus eleves : " + max);
		System.out.println("Note la plus basses : " + min);
		//cherche si la note 15 existe 
		boolean estTrouve = false;
		for(int i = 0;i<notes.length;i++){
			if(notes[i]==15){
				estTrouve = true;
				break;
			}
		}
		if (estTrouve){
			System.out.println("15 est present dqns le tableau");
		}else{
			System.out.println("15 pas present");
		}
	}
}
		