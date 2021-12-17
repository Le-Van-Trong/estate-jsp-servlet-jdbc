package filesStreams;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class TestDita {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws IOException {
		
		@SuppressWarnings("resource")
		BufferedReader read= new BufferedReader(new FileReader("F:\\RENASAS\\Eclipse_2020_03\\Dita_Convert\\Dita_convert_20211215130138.log"));
		@SuppressWarnings("rawtypes")
		ArrayList list = new ArrayList();

		String dataRow = read.readLine(); 
		while (dataRow != null){
		    list.add(dataRow);
		    dataRow = read.readLine(); 
		}

		FileWriter writer = new FileWriter("F:\\RENASAS\\Eclipse_2020_03\\Dita_Convert\\Dita_convert_20211215130138.log"); //same as your file name above so that it will replace it
		writer.append("Chung ta se ve voi nhau ");

		for (int i = 0; i < list.size(); i++){
		    writer.append(System.getProperty("line.separator"));
		    writer.append((CharSequence) list.get(i));
		}
		writer.flush();
		writer.close();
	}
}
