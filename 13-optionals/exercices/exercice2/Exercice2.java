import java.util.Optional;
public class Exercice2{
	public static Optional<Utilisateur> trouverUtilisateur(String nom){
		if(nom ==null || nom.isEmpty()){
			return Optional.empty();
		}
		if(nom.equals("Alice")){
			return Optional.of(new Utilisateur("Alice","alice@mail.com", 25));
		}
		if(nom.equals("Bob")){
			return Optional.of(new Utilisateur("Bob",null, 30));
		}
		return Optional.empty();
	}
	public static void main(String[] args){
		Optional<Utilisateur> alice = trouverUtilisateur("Alice");
		alice.ifPresent(u->{
			System.out.println("Nom : " + u.getNom()+ ", Email : "+u.getEmail());
		});
		alice.map(Utilisateur::getEmail)
		.map(String::toUpperCase)
		.ifPresent(email -> System.out.println("Email en majuscule est : "+email));
		
		Optional<Utilisateur> bob = trouverUtilisateur("Bob");
		String email = bob.map(Utilisateur::getEmail)
				.orElse("Email non reseigne");
		System.out.println("Email : "+email);
		Optional<Utilisateur> charlie = trouverUtilisateur("Charlie");
		charlie.ifPresentOrElse(
			s -> System.out.println(s.toString()),
			() ->System.out.println("Utilisateur non trouve")
		);
	}
}
		