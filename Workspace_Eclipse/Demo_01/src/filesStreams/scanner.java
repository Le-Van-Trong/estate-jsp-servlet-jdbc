package filesStreams;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class scanner {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(new File("myNumbers.txt"));
		while (sc.hasNextFloat()) {
			//float afloat = sc.nextFloat();
		}
	}
}
