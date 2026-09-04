public class Challenge{
	public static void main(String[] args){
		double moyenne = calculerMoyenne(15,18,14);
		afficherMoyenne(moyenne);
		if(estAdmis(moyenne)){
			System.out.println("Admis !");
		}else{
			System.out.println("Non Admis !");
		}
		System.out.println("Mention : "+ mention(moyenne));
		
	}
	public static double calculerMoyenne(double note1, double note2, double note3){
		return (note1+note2+note3)/3;
	}
	public static void afficherMoyenne(double moyenne){
		System.out.println("Moyenne : "+moyenne);
	}
	public static boolean estAdmis(double moyenne){
		if(moyenne>=10){
			return true;
		}else{
			return false;
		}
	}
	public static String mention(double moyenne){
		if(moyenne>=16){
			return "Tres Bien";
		}else if (moyenne>=14){
			return "Bien";
		}else if(moyenne>=12){
			return "Assez Bien";
		}else if(moyenne>=10){
			return "Passable";
		}else {
			return "Insuffisant";
		}
	}
}