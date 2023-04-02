import java.lang.reflect.InvocationTargetException;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Demo {

	public static void main(String[] jvm) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
	
		
//		Class c= Car.class;
//		
//		Constructor[]  cons= c.getDeclaredConstructors();
//		
//		cons[1].setAccessible(true);
//		Car car=(Car)cons[1].newInstance(10);
//		car.run();
		
		
//		Pattern p=Pattern.compile("([A-Z].*)([a-z.]*)");
//		
//		Matcher m=p.matcher("wfwAfyvun");
//		
//		System.out.println(m.matches());
		
		
		LocalDate lc=LocalDate.parse("09/12/2000",DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		
		System.out.println(lc);
		
		
		Duration d=Duration.between( LocalDateTime.now().plusDays(12).plusHours(2).plusMinutes(23), LocalDateTime.now());
		
		System.out.println(d);
		
	}
}
