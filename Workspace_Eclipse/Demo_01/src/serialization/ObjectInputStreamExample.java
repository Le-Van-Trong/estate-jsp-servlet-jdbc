package serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStreamExample {
	 
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		ObjectInputStream ois = null;
		
		try {
			ois = new ObjectInputStream(new FileInputStream("testout.txt"));
			 Student student = (Student) ois.readObject();
			 // show student 
			 System.out.println(student.toString());
		} catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		} finally {
			ois.close();
		}
	}
}
