package datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Timer;

public class Demo {

	public static void main(String[] args) {
		System.out.println("FGodd");
		
		DateTimeFormatter df= DateTimeFormatter.ofPattern("dd-MM-YYYY");
		LocalDate ld=LocalDate.now();
		System.out.println(ld.format(df));
	
		LocalDate lof=LocalDate.parse("2002-04-20");
		
		System.out.println(LocalDate.now().getDayOfYear());
		LocalDateTime dt=LocalDateTime.now();
		System.out.println(dt.getSecond());
		
//		LocalDate d=LocalDate.parse("2000-12-09",DateTimeFormatter.ofPattern("DD-MM-YYYY"));
//		System.out.println(d);
		
		
	}
}
