import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
public class Main{
	public static void main(String[] args){
		ArrayList<Etudiant> etudiants= new ArrayList<>();
		etudiants.add(new Etudiant("Alice",20,"Master 1"));
		etudiants.add(new Etudiant("Bob",22,"Master 1"));
		etudiants.add(new Etudiant("Charlie",19,"Licence"));
		HashSet<String> matiers = new HashSet<>();
		matiers.add("Maths");
		matiers.add("Physique");
		matiers.add("Informatique");
		matiers.add("Maths");
		
		HashMap<String, ArrayList<Integer>> notes = new HashMap<>();
		ArrayList<Integer> note1 = new ArrayList<>();
		note1.add(15);
		note1.add(18);
		note1.add(14);
		notes.put("Alice",note1);
		ArrayList<Integer> note2 = new ArrayList<>();
		note2.add(12);
		note2.add(10);
		note2.add(13);
		notes.put("Bob",note2);
		ArrayList<Integer> note3 = new ArrayList<>();
		note3.add(16);
		note3.add(15);
		note3.add(17);
		notes.put("Charlie",note3);
		for(Etudiant e : etudiants){
			e.afficherInfos();
		}
		for(String matier : matiers){
			System.out.println(matier);
		}
		double moyenne = 0;
		double somme = 0;
		
		for(String n : notes.keySet()){
			System.out.print(n + " : [");
			ArrayList<Integer> listeNotes = notes.get(n);
			int index = 0;
			
			for(Integer note : notes.get(n)){
				System.out.print(note);
				if(index < listeNotes.size() -1){
					System.out.print(", ");
				}
				somme +=note;
				index++;
			}	
			moyenne  = somme / notes.get(n).size();
			System.out.print("] - Moyenne : "+moyenne + " - ");
			if(moyenne >=16){
				System.out.print("Tres Bien");
			} else if (moyenne >=14){
				System.out.print("Bien");
			}else if(moyenne >= 12){
				System.out.print("Assez Bien");
			
			}else if(moyenne >= 10){
				System.out.print("Passable");
			}else {
				System.out.print("Non Admis");
			}
			System.out.println();
	
			somme  = 0;
		}
	}
}
			
				
				
		
		
		