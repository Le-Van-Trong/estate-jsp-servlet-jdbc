package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsExample2 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Java");
		list.add("C");
		list.add("C++");
		list.add("PHP");
		list.add("Python");
		// sort list 
		Collections.sort(list);
		// show list 
		for(String s : list ) {
			System.out.println(s);
		}
		
		System.out.println("\n Sap xep giam dan");
		
		// sort list 
		Collections.sort(list, new Comparator<String>() {
			public int compare(String o1, String o2) {
				return o2.compareTo(o1);
			}
		});
		// show list 
		for(String el : list) {
			System.out.println(el);
		}
	}
}
