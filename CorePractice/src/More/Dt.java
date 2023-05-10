package More;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class Dt {

	public static void main(String[] args) {
		
		
//		LocalDate ld=LocalDate.parse("09-12-2000",DateTimeFormatter.ofPattern("dd-MM-yyyy"));
//		
//		System.out.println(ld.isAfter(LocalDate.now()));
//		
//		LocalTime lt=LocalTime.parse("02:32:33");
//		System.out.println(lt);
//		
//		
//		DateTimeFormatter df=DateTimeFormatter.ofPattern("dd-MM-yyyy", Locale.JAPANESE);
//		LocalDate lds=LocalDate.parse("09-12-2000",df);
//		System.out.println(lds);
		
		
		Duration d=Duration.between(LocalDateTime.now(), LocalDateTime.of(LocalDate.of(2002, 2, 1), LocalTime.of(23, 3)));
		System.out.println(d.toHours());
		
		Period p=Period.between(LocalDate.now(), LocalDate.of(2002, 2, 1));
		System.out.println(p.getYears());
		
		
		System.out.println(ChronoUnit.YEARS.between(LocalDateTime.now(), LocalDateTime.of(LocalDate.of(2002, 2, 1), LocalTime.of(23, 3))));

	}
}  
