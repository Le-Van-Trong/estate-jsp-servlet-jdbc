package filesStreams;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class AppendToFileExample {
	
	private static final String FILENAME = "testout.txt";
	
	public static void main(String[] args) {
		BufferedWriter bw = null;
		FileWriter fw = null;
		
		try {
			String data = " This is new content ";
			File file = new File(FILENAME);
			
			// if file doesnt exixsts, then create it 
			if(!file.exists()) {
				file.createNewFile();
			}
			//true = append file 
			fw = new FileWriter(file.getAbsoluteFile(), true);
			bw = new BufferedWriter(fw);
			bw.write(data);
			System.out.println("Success...");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(bw != null)
					bw.close();
				if(fw != null)
					fw.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}
}
