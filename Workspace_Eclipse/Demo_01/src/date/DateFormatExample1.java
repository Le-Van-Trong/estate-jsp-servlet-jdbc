package date;

import java.text.DateFormat;
import java.util.Date;

public class DateFormatExample1 {
	public static void main(String[] args) {
		Date currentDate =  new Date();
		System.out.println("Current Date: " + currentDate);

		String dateToStr = DateFormat.getInstance().format(currentDate);
		System.out.println(" Date Format using getInstance():  " + dateToStr);

		String dateToStr1 = DateFormat.getDateInstance().format(currentDate);
		System.out.println("Date Format using getDateInstance(): " + dateToStr1);

		String datetoStr2 = DateFormat.getTimeInstance().format(currentDate);
		System.out.println("Date Format using getTimeInstance()" + datetoStr2);

		String dateToStr3 = DateFormat.getDateTimeInstance().format(currentDate);
		System.out.println("Date Format using getDateTimeInstance()" + dateToStr3);

		String dateToStr4 = DateFormat.getTimeInstance(DateFormat.SHORT).format(currentDate);
		System.out.println("Date Format using getTimeInstance(DateFormat.SHORT)" + dateToStr4);

		String dateToStr5 = DateFormat.getTimeInstance(DateFormat.MEDIUM).format(currentDate);
		System.out.println("Date Format using getTimeInstance(DateFormat.MEDIUM): "+ dateToStr5);

		String dateToStr6 = DateFormat.getTimeInstance(DateFormat.LONG).format(currentDate);
		System.out.println("Date Format using getTimeInstance(DateFormat.LONG): "+ dateToStr6);

		String dateToStr7 = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.SHORT).format(currentDate);
		System.out.println("Date Format using "+ "getDateTimeInstance(DateFormat.LONG,DateFormat.SHORT): "+ dateToStr7);
	}
}
