import java.util.Optional;
public class Exercice1{
	public static Optional<String> trouverNom(String prenom){
		if(prenom == null || prenom.isEmpty()){
			return Optional.empty();
		}
		if(prenom.startsWith("A")){
			return Optional.of(prenom + " Dupont");
		}
		return Optional.of(prenom + " Martin");
	}
	public static void main(String[] args){
		Optional<String> nom = trouverNom("Alice");
		if(nom.isPresent()){
			System.out.println("Nom trouve " + nom.get());
		}
		else{
			System.out.println("Aucun nom trouve");
		}
		System.out.println(trouverNom("Bob").orElse("Inconnu"));
		System.out.println(trouverNom("").orElse("Inconnu"));
		System.out.println(trouverNom(null).orElse("Inconnu"));
	}
}