package Date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Date_01 {

	public static void main(String[] args) {
		LocalDate now = LocalDate.now();
		LocalDateTime now2 = LocalDateTime.now();
		LocalTime now3=LocalTime.now();
		
		System.out.println(now);
		now.getDayOfMonth();
		now.getDayOfYear();
		now.getMonth();
		now.isLeapYear();
		now.lengthOfYear();
		now.lengthOfMonth();
		now.plusDays(100);
		now.plusMonths(100);
		now.plusYears(100);
		now.minusYears(100);
		
		LocalDate yesterdy = LocalDate.of(2023, 4, 19);
		now.withYear(2020);
		now.isBefore(yesterdy);
		now.isAfter(yesterdy);
		
	}
}
