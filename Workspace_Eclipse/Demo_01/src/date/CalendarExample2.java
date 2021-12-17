package date;

import java.util.Calendar;

public class CalendarExample2 {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		System.out.println("Year : " + calendar.get(Calendar.YEAR));
		System.out.println("Month : " + calendar.get(Calendar.MONTH));
		System.out.println("Day : " + calendar.get(Calendar.DATE));
		System.out.println("Day of week: " + calendar.get(Calendar.DAY_OF_WEEK));
		System.out.println("Ngay gio hien tai: " + calendar.getTime());
	}
}
