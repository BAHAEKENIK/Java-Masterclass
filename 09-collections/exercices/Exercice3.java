import java.util.HashMap;
public class Exercice3{
	public static void main(String[] args){
		HashMap<String, Integer> notes = new HashMap<>();
		notes.put("Alice", 15);
		notes.put("Bob",12);
		notes.put("Charlie",18);
		notes.put("David",10);
		System.out.println(notes.get("Bob"));
		notes.put("Alice",16);
		for(String cle : notes.keySet()){
			System.out.println(cle + " : "+notes.get(cle));
		}
			
		System.out.println(notes.containsKey("David"));
		notes.remove("Charlie");
		System.out.println(notes.size());
	}
}