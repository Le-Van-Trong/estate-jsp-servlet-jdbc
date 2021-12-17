package generic;

public class TestGenerics {

	public static void main(String[] args) {
		// use string 
		MyGeneric<Integer> m1 = new MyGeneric<Integer>();
		m1.add(1999);
		System.out.println(m1.get());
		
		// use String 
		MyGeneric <String> m2 = new MyGeneric<String>();
		m2.add("le khanh ngoc");
		System.out.println(m2.get());
	}
}
