package date;

import java.util.Date;

public class DateExample1 {

	public static void main(String[] args) {
		
		long miliSecons = System.currentTimeMillis();
		// cach 1
		Date date1 = new Date(miliSecons);
		System.out.println(date1);
		// cach 2
		Date date2 = new Date();
		System.out.println(date2);
	}
}
