public class Exercice4{
	public static void main(String[] args){
		String[] tableau = "Java,Spring,Hibernate,MySQL".split(",");
		for(int i = 0; i<tableau.length;i++){
			System.out.println(tableau[i]);
		}
		String string1 = "Java est un langage";
		string1.replace('a','@');
		System.out.println(string1);
		String s1 = "";
		String s2 = " ";
		String s3 = "Bonjour";
		System.out.println("'' isEmpty() : "+ s1.isEmpty()+", isBlank : "+s1.isBlank());
		System.out.println("' '  isEmpty() : "+ s2.isEmpty()+", isBlank : "+s2.isBlank());
		System.out.println(" 'Bonjour' isEmpty : "+ s3.isEmpty()+", isBlank : "+s3.isBlank());
		String string2 = "Ha".repeat(5);
		System.out.println(string2);
		String string3 = "123Java456Developer789".replaceAll("\\d","");
		System.out.println(string3);
	}
}