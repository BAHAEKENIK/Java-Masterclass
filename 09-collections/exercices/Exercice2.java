import java.util.HashSet;
public class Exercice2{
	public static void main(String[] args){
		HashSet<String> langages =  new HashSet<>();
		langages.add("Java");
		langages.add("Python");
		langages.add("JavaScript");
		langages.add("Java");
		langages.add("C++");
		System.out.println(langages.size());
		
		for(String langage : langages){
			System.out.println(langage);
		}
		langages.remove("C++");
		System.out.println(langages.size());
	}
}
		