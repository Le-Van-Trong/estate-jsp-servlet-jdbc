package serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamExample {
	public static void main(String[] args) throws IOException {
		ObjectOutputStream oos = null;
		
		try {
			oos = new ObjectOutputStream(new FileOutputStream("testout.txt"));
			// create student 
			Student student = new Student(1, "Le Khanh Ngoc", "Cai Be", 18);
			//write student 
			oos.writeObject(student);
			System.out.println("Success...");
		} catch (IOException es) {
			es.printStackTrace();
		} finally {
			oos.close();
		}
	}
}
