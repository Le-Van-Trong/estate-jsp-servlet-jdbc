package numberformat;

import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Locale;

public class RoundingNumbers {
	public static void main(String[] args) {
		
		double nums[] = {2.32, 2.55, 3.19, 4.88, 5.54, 3.22, 8.78};
		
		NumberFormat nf = NumberFormat.getInstance(new Locale("en", "US"));
		nf.setMaximumFractionDigits(1);
		nf.setRoundingMode(RoundingMode.UP);
		
		for(double num : nums) {
			String number =nf.format(num);
			System.out.printf("%s  ", number);
		}
		System.out.println();
		nf.setRoundingMode(RoundingMode.DOWN);
		for(double num : nums ) {
			String number = nf.format(num);
			System.out.printf("%s  ",number);
		}
	}
}
