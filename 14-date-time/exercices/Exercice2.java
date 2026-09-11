
import java.time.*;

public class Exercice2{
	public static void main(String[] args){
		ZonedDateTime maintenant = ZonedDateTime.now();
		System.out.println(maintenant);
		ZonedDateTime paris = ZonedDateTime.now(ZoneId.of("Europe/Paris"));
		System.out.println(paris);
		ZonedDateTime tokyo = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
		System.out.println(tokyo);
		ZonedDateTime new_york = ZonedDateTime.now(ZoneId.of("America/New_York"));
		System.out.println(new_york);
		LocalDateTime reunion = LocalDateTime.of(2026, 12, 25, 10, 0);
		ZonedDateTime paris2 = ZonedDateTime.of(reunion,ZoneId.of("Europe/Paris"));
		System.out.println("Paris : " + paris2);
		ZonedDateTime tokyo2 = paris2.withZoneSameInstant(ZoneId.of("Asia/Tokyo"));
		System.out.println("Tokyo : "+tokyo2);
		ZonedDateTime newyork2 = paris2.withZoneSameInstant(ZoneId.of("America/New_York"));
		System.out.println("New York : " + newyork2);
		System.out.println(paris2);
		System.out.println(tokyo2);
	}
}