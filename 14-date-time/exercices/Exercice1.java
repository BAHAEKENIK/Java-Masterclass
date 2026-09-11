import java.time.*;
import java.time.format.DateTimeFormatter;
public class Exercice1{
	public static void main(String[] args){
		LocalDate datejour = LocalDate.now();
		LocalTime dateheure = LocalTime.now();
		System.out.println("Date actual en jour : "+datejour);
		System.out.println("Date actual en heure : "+dateheure);
		LocalDateTime datejourheure = LocalDateTime.now();
		System.out.println("La date jour et heure : " + datejourheure);
		LocalDate date1 = LocalDate.of(1998, 5, 15);
		Period periodYear = Period.between(date1, datejour);
		System.out.println("La period en annee est : " + periodYear.getYears());
		System.out.println("le jour de la semaine de la naissance "+date1.getDayOfWeek());
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String formate = date1.format(formatter);
		System.out.println(formate);
		LocalDate dans100jours = date1.plusDays(100);
		System.out.println(dans100jours);
	}
}
		