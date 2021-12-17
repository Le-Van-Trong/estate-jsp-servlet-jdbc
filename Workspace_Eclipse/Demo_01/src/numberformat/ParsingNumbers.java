package numberformat;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class ParsingNumbers {

	public static void main(String[] args) throws ParseException {

		NumberFormat nf = NumberFormat.getInstance(new Locale("sk", "SK"));
		nf.setMaximumFractionDigits(3);

		Number num = nf.parse("150000,456");
		System.out.println(num.doubleValue());
	}
}