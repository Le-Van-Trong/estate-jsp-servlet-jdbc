package generic;


public class TestGenerics2 {

	public static <E> void printArray(E[] elements) {
		for (E element : elements)
		{
			System.out.println(element +" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {

		Integer[] intArr = {10, 50 , 90 , 30, 80};
		Character[] charArr = {'N', 'G', 'O', 'C' };

		System.out.println("In ra ma so nguyen: ");
		printArray(intArr);
		System.out.println("In ra mang ky tu: ");
		printArray(charArr);
	}		
}
