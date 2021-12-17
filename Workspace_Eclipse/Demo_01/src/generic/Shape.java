package generic;

import java.util.ArrayList;
import java.util.List;

public abstract class Shape {

	abstract void draw();
}

class Rectangle extends Shape{
	void draw() {
		System.out.println("Ve hinh chu nhat");
	}
}

class Circle extends Shape{
	void draw() {
		System.out.println(" Ve hinh tron ");
	}
}

class GenericTest{
	
	// tao phuong thuc chap nhan lop con cua Shape
	public static void drawShape(List<? extends Shape> lists) {
		for (Shape s : lists)
		{
			s.draw();
		}
	}
	
	public static void main(String[] args) {
		
		List<Rectangle> list1 = new ArrayList<Rectangle>();
		list1.add(new Rectangle());
		
		List<Circle> list2 = new ArrayList<Circle>();
		Circle c1 = new Circle();
		Circle c2 = new Circle();
		
		list2.add(c1);
		list2.add(c2);
		
		drawShape(list1);
		drawShape(list2);
	}
}