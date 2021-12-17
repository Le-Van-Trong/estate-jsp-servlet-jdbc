package numberformat;

import java.text.NumberFormat;
import java.util.Locale;

public class Percentages {
	public static void main(String[] args) {
		double x = 25f / 100f;
		NumberFormat pf = NumberFormat.getPercentInstance(new Locale("sk", "SK"));

		System.out.println(pf.format(x));
	}
}
