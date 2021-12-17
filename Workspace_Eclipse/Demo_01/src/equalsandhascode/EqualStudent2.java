package equalsandhascode;

import java.util.ArrayList;
import java.util.List;

public class EqualStudent2 {

	public static void main(String[] args) {
		Student student1 = new Student("123", "Cong", "cong@gmail.com", 22);
	    Student student2 = new Student("123", "Cong", "cong@gmail.com", 22);
	    Student student3 = new Student("456", "Dung", "dung@gmail.com", 18);
	    
	    // create list student 
	    List<Student> listStudents = new ArrayList<>();
	    
	    // add student in listStudent 
	    listStudents.add(student1);
	    listStudents.add(student2);
	    listStudents.add(student3);
	    
	    // tao cac doi tuong student co thuoc tinh ID
	    Student searchStudent1= new Student("123");
	    Student searchStudent4= new Student("789");
	    
	    // tim kiem trong danh sach
	    System.out.println("Search student1: " + listStudents.contains(searchStudent1));
	    System.out.println("Search student4: " + listStudents.contains(searchStudent4));
	}
}
    
