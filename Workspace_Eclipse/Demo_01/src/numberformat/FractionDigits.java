package numberformat;

import java.text.NumberFormat;
import java.util.Locale;

public class FractionDigits {

	public static void main(String[] args) {
		double val1 = 4.5678934;
		double val2 = 2.3;
		
		Locale locale = new Locale("sk", "SK");
		NumberFormat nf = NumberFormat.getInstance(locale);
		nf.setMinimumFractionDigits(2);
		nf.setMaximumFractionDigits(4);
		
		System.out.println(nf.format(val1));
		System.out.println(nf.format(val2));
	}
}
