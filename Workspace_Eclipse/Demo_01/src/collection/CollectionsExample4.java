package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsExample4 {

	public static void main(String[] args) {
		List<Student> listStudents = new ArrayList<Student>();
		
		listStudents.add(new Student(1,"Le" ,19, "Ha Noi" ));
        listStudents.add(new Student(2, "Hoa", 19, "Hanoi"));
        listStudents.add(new Student(3, "Phu", 20, "Hanoi"));
        listStudents.add(new Student(4, "Quy", 22, "Hanoi"));
        
        // sort list student 
        Collections.sort(listStudents, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				return o1.getName().compareTo(o2.getName());
			}
        });
        
        for(Student student : listStudents) {
        	System.out.println(student.toString());
        }
	}
}


