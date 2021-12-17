package filesStreams;

import java.io.File;

public class FileChecker {

	public static void main(String[] args) {
		File file = new File("file1.txt");

		if (file.exists())
		{
			System.out.println("File existed ");
		}
		else {
			System.out.println("File not found ");
		}
	}
}
