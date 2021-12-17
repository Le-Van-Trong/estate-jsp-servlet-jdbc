package numberformat;

import java.text.NumberFormat;
import java.util.Locale;

public class Currencies {
	public static void main(String[] args) {

		int val = 23_500;
		NumberFormat cf1 = NumberFormat.getCurrencyInstance(new Locale("en", "US"));
		System.out.println(cf1.format(val));
		
		NumberFormat cf2 = NumberFormat.getCurrencyInstance(new Locale("vi","VI"));
		System.out.println(cf2.format(val));
		
		NumberFormat cf3 = NumberFormat.getCurrencyInstance(new Locale("zh", "CN"));
        System.out.println(cf3.format(val));
	}
}
