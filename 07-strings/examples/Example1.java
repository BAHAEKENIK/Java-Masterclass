public class Example1{
	public static void main(String[] args){
		String message = "  Bonjour tout le monde !  ";
		
		System.out.println(message.length());//26
		System.out.println(message.trim()); // "Bonjour tout le monde !";
		System.out.println(message.toUpperCase()); // " Bonjour tout le MONDE ! "
		System.out.println(message.contains("tout")); // true
		System.out.println(message.startsWith("  Bon")); // true
	}
}