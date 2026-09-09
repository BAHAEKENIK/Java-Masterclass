import java.util.*;
import java.util.stream.*;
public class Exercice2{
	public static void main(String[] args){
		List<Integer> nombres = Arrays.asList(5, 2, 8, 1, 9, 3, 7, 4, 6, 8, 2);
		System.out.println("Liste origiale : "+nombres);
		List<Integer> resultat = nombres.stream()
			.filter(n -> n>3)
			.distinct()
			.map(n -> n*n)
			.filter(n -> n < 40)
			.sorted()
			.collect(Collectors.toList());
		System.out.println("Liste transformee : "+resultat);
		long count = resultat.stream().count();
		System.out.println("Nombre d'element : "+ count);
		boolean est16 = resultat.stream().anyMatch(n -> n.equals(16));
		System.out.println(" 16 est dans nouvelle liste : " + est16);
		int somme = resultat.stream().reduce(0, (a,b) ->a+b);
		System.out.println("La somme est : " + somme);
	}
}
		
		
		