
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;

public class DateDemo {
	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d.getDate()+"/"+(d.getMonth()+1)+"/"+d.getYear());	
		
		Date d2 = new Date(47, 7, 15);
		System.out.println(d2);
		
		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		LocalTime time = LocalTime.now();
		System.out.println(time);
	}
}
