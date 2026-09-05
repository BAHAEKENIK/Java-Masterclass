public class Challenge{
	public static void main(String[] args){
	}
	public static boolean estEmailValide(String email){
		return (email.contains("@") && email.contains(".")) || email.indexOf(' ') == -1;
	}
	public static boolean estTelephoneValide(String telephone){
		telephone = telephone.trim();
		telephone = telephone.replace(" ","").replace("-","");
		return telephone.length()==10;
	}
	public static boolean estNomValide(String nom){
		if(nom==null || nom.isEmpty()){
			return false;
		}
		return !nom.matches(".*\\d.*")
	}
	public static String formaterEmail(String email){
		email = email.toLowerCase();
		email = email.replace(" ","");
		return email;
	}
	public static String formaterTelephone(String telephone){
		telephone = telephone.replace(" ","");
		telephone = telephone.trim();
		return telephone.substring(0,10);
	}
	public static String formaterNom(String nom){
		String nomFromate = nom.substring(0,1).toUpperCase() + nom.substring(1).toLowerCase();
	}
}
		