package filesStreams;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyFileExample {
	public static void main(String[] args) throws IOException {
		InputStream inStream = null;
		OutputStream outputStream = null;
		
		try {
			inStream = new FileInputStream(new File("file1.txt"));
			outputStream = new FileOutputStream(new File("file2.txt"));
			int lengh;
			byte[] buffer = new byte [1024];
			
			// coppy the file content in byte 
			while ((lengh = inStream.read(buffer))>0)
			{
				outputStream.write(buffer, 0,lengh);
			}
			System.out.println("file is cpoied successful!");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			inStream.close();
			outputStream.close();
		}
	}
}
