public class Challenge{
	public static void main(String[] args){
		String motDePasseCorrect = "1234";
		String motDePasseSaisi ="12345";
		int tentativesMax = 3;
		int tentativesRestantes = tentativesMax;
		boolean estConnecte = false;
		while(tentativesRestantes > 0 && !estConnecte){
			if(motDePasseSaisi.equals(motDePasseCorrect)){
				System.out.println("Connexion reussie !");
				estConnecte = true;
			}else{
				if(tentativesRestantes>=2){
					System.out.println("Mot de passe incorrect. Il vous reste "+tentativesRestantes+" tentatives.");
				}
				else{
					System.out.println("Mot de passe incorrect. Il vous une seul chance tentative");
				}
				tentativesRestantes--;
			}
		}
		if(!estConnecte){
			System.out.println("Compte bolque. Trop de tentatives.");
		}
	}
}
			
				
			