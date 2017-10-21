package ch2.exercise;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class pb01 {
	public static void main(String[] args) {

		LocalDate date = LocalDate.now().withDayOfMonth(1); // System.out.println("date:"+date);
		int month;
		// System.out.println("args:"+args);
		// System.out.println("args.length:"+args.length);
		if (args.length >= 2) {
			month = Integer.parseInt(args[0]);
			System.out.println("month:" + month);
			int year = Integer.parseInt(args[1]);
			System.out.println("year:" + year);
			date = LocalDate.of(year, month, 1);
			System.out.println("date:" + date);
		} else {
			month = date.getMonthValue();
			System.out.println("month:" + month);
		}

		// System.out.println(" Mon Tue Wed Thu Fri Sat Sun");
		System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
		DayOfWeek weekday = date.getDayOfWeek(); // System.out.println("weekday:"+weekday);
		int value = weekday.getValue() + 1; // 1 = Sunday, ... 7 = Saturday

		for (int i = 1; i < value; i++)
			System.out.print("    ");
		while (date.getMonthValue() == month) {
			System.out.printf("%4d", date.getDayOfMonth());
			date = date.plusDays(1);
			if (date.getDayOfWeek().getValue() == 7)
				System.out.println();
		}
		if (date.getDayOfWeek().getValue() != 1)
			System.out.println();
	}
}
