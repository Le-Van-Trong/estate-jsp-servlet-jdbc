package date;

import java.util.Calendar;

public class CalendarExample4 {

	public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        int maximum = calendar.getMaximum(Calendar.DAY_OF_WEEK);
        System.out.println("Gia tri MAX cua so ngay trong tuan: " + maximum);
        maximum = calendar.getMaximum(Calendar.WEEK_OF_YEAR);
        System.out.println("Gia tri MAX cua so tuan trong nam: " + maximum);
		
	}
}

