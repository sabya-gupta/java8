import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;

public class JodaTime {

	public static void main(String[] args) {
		System.out.println(LocalDate.now()+":"+LocalTime.now());
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now.getDayOfMonth());
		System.out.println(now.getDayOfYear());
		System.out.println(now.getMonth().name().toString());
		System.out.println(now.getYear());
		System.out.println(now.getDayOfWeek());
		System.out.println(ZoneId.systemDefault());
	}
}
