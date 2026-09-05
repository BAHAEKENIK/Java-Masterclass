public class Exercice3{
	public static void main(String[] args){
		String s1 = "Java";
		String s2 = "Java";
		String s3 = new String("Java");
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System.out.println(s1.equals(s3));
		// Partie B
		String str = "Hello";
		System.out.println(str);
		str = str + " World";
		System.out.println(str);
		// creer deux object the first object containe "Hello" et second object containe "Hello World"
		//Partie C
		String nul = null;
		try{
			System.out.println(nul.length());
		}catch(NullPointerException e) {// On precise le type d'exception
			System.out.println("La chaine est null, impossible d'appeler length()");
		}
		// i dont know what is try catch but i try 
		
	}
}