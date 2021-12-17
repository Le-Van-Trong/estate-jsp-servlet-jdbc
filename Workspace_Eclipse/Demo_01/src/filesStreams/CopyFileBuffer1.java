package filesStreams;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyFileBuffer1 {
	public static void main(String[] args) throws IOException{
		BufferedInputStream  bufferIn = null;
		BufferedOutputStream buffOut = null;
		
		try {
			InputStream inputStream = new FileInputStream("input.txt");
			OutputStream outputStream = new FileOutputStream("input.txt");
			
			bufferIn = new BufferedInputStream(inputStream);
			buffOut = new BufferedOutputStream(outputStream);
			
			int c;
			while ((c=bufferIn.read()) != -1)
			{
				buffOut.write(c);
			}
		} finally {
			if(bufferIn != null)
			{
				bufferIn.close();
			}
			if(buffOut != null)
			{
				buffOut.close();
			}
		}
	}
}
