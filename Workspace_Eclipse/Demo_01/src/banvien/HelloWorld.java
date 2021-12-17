package banvien;

import java.util.Random;

public class HelloWorld {
	public static void main(String[] args) {
		Random random = new Random();
		int a = random.nextInt(100);
		if (a % 2 == 0) {
		   System.out.printf("%d la so chan.", a);
		  } else {
		   System.out.printf("%d la so le.", a);
		   System.out.printf( "%s\n%s\n",
				   "Welcome to", "Java Programming!" );
		  }
		 }
}


