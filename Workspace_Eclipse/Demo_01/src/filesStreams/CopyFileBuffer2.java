package filesStreams;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class CopyFileBuffer2 {
	public static void main(String [] args) throws IOException {
		BufferedReader bufferedReader = null;
		BufferedWriter bufferedWriter = null;

		try {
			Reader reader = new FileReader("input.txt");
			Writer writer = new FileWriter("output.txt");

			bufferedReader = new BufferedReader(reader);
			bufferedWriter = new BufferedWriter(writer);

			int c;                    
			while ((c = bufferedReader.read()) != -1) {
				bufferedWriter.write(c);
			}            
		} finally {
			if (bufferedReader != null) {
				bufferedReader.close();
			}
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}            
		}         
	}    
}