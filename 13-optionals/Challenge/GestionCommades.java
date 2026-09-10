import java.util.List;
import java.util.ArrayList;
import java.util.Optional;
public class GestionCommades{
	public static List<Commande> commandes = new ArrayList<>();
	
	public static Optional<Commande> trouverCommande(String numero){
		for(Commande c : commandes){
			if(c.getNumero().equals(numero)){
				Optional.of(c);
			}
		}
		return Optional.empty();
	}
	public static Optional<Client> trouverClient(String numeroCommande){
		return trouverCommande(numeroCommande)
			.map(Commande::getClient);
	}
	public static Optional<String> trouverEmailClient(String numeroCommande){
		return trouverClient(numeroCommande)
			.map(Client::getEmail)
			.filter(email -> email != null);
	}
	public static Optional<String> trouverTelephoneClient(String numeroCommande){
		return trouverClient(numeroCommande)
			.map(Client::getTelephone);
	}
	public static Optional<Double> calculerMontantTotal(){
		if(commandes.isEmpty()){
			return Optional.empty();
		}
		double total = commandes.stream()
			.mapToDouble(Commande::getMontant)
			.sum();
		return Optional.of(total);
	}
}
	