package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsExample3 {

	public static void main(String[] args) {
		
		List<Double> list = new ArrayList<Double>();
		
		// list add
		list.add(15D);
		list.add(20D);
		list.add(16.5D);
		
		// sort list ASC
		Collections.sort(list);
		System.out.println("Show list ASC");
		for(Double element : list)
		{
			System.out.println(element);
		}
		
		// sort list DESC
		Collections.sort(list, new Comparator<Double>() {

			@Override
			public int compare(Double o1, Double o2) {
				// TODO Auto-generated method stub
				return o1>o2 ? -1 : 1;
			}
		});
		
		// show list 
		System.out.println("Show list DESC");
		for(Double element : list )
		{
			System.out.println(element);
		}
	}
}
