package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListExample {

	public static void main(String[] args) {

		List <String> list = new ArrayList<String>();
		list.add("Le ");
		list.add("Khanh ");
		list.add("Ngoc");
		list.add("Le ");
		list.add("Trong");
		
		ListIterator<String> itr = list.listIterator();
		System.out.println("Duyet cac phan tu tu dau den cuoi: ");
		while(itr.hasNext()) {
			System.out.println("\t" + itr.next());
		}
		
		System.out.println("Duyet cac phan tu tu cuoi ve dau: ");
		while(itr.hasPrevious()) {
			System.out.println("\t" + itr.previous());
		}

/*
		// create new array
		String[] arr = {"Le ", "Khanh ", "Ngoc "};
		// convert array to List 
		List<String> list = Arrays.asList(arr);
		// show list 
		for(String s : list)
		{
			System.out.println(s);
		}
*/
}
}
