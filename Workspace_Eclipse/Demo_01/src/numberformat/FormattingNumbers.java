package numberformat;

import java.text.NumberFormat;
import java.util.Locale;

public class FormattingNumbers {

	public static void main(String[] args) {
		double n= 1240.35;
		
		NumberFormat nf = NumberFormat.getInstance(new Locale("en", "US"));
		String val =nf.format(n);
		
		System.out.println(val);
		
		NumberFormat nf2 = NumberFormat.getInstance(new Locale("sk", "SK"));
		String val2 = nf2.format(n);
		System.out.println(val2);
	}
}

