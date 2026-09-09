import java.util.*;
import java.util.function.*;
public class Exercice1{
	public static void main(String[] args){
		ArrayList<Integer> nombres = new ArrayList<>(Arrays.asList(5, 2, 8, 1, 9, 3, 7, 4, 6));
		Collections.sort(nombres, (a, b) -> b - a);
		Predicate<Integer> superieur5 = n -> n>5;
		System.out.println("7 est superier de 5 ?" + superieur5.test(7));
		System.out.println("3 est superieur de 5 ?" + superieur5.test(3));
		Function<Integer, String> convert =(n)-> (n%2 == 0) ? "Pair" : "Impair";
		System.out.println("7 est Pair ou impair ?" + convert.apply(7));
		System.out.println("3 est pair ou impair ? " + convert.apply(3));
	}
}
		