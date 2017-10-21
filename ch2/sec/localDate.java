package ch2.sec;
import java.time.DayOfWeek;
import java.time.LocalDate;

public class localDate{

	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2017, 8, 1);
		//System.out.println(date);
		
		//date = date.plusDays(1);
		//System.out.println(date);
		
		while ( date.getMonthValue() == 8 ){
			System.out.printf("%4d", date.getDayOfMonth());
			date = date.plusDays(1);
		}
		DayOfWeek weekday = date.getDayOfWeek();
		int value = weekday.getValue();
		
		for (int i=1; i<value; i++){
			System.out.println("");
		}
		
		
		
	}

}
