import java.util.ArrayList;
public class Exercice1{
	ArrayList<String> villes = new ArrayList<>();
	villes.add("Paris");
	villes.add("Lyon");
	villes.add("Marseille");
	villes.add("Bordeaux");
	villes.add("Toulouse");
	for(String ville : villes){
		System.out.println(ville);
	}
	villes.remove("Lyon");
	villes.add("Nice");
	System.out.println(villes.get(2));
	String containe = (ville.contains("Marseille"))?"exists": "non exists";
	System.out.println(containe);
}