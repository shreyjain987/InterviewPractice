package com.javacollections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Arrays {

	public static void main(String[] args) {
		List<String> al = new ArrayList<String>();
		al.add("Raju");
		al.add("Selenium");
		al.add("Divya");
		al.add("Shivam");

		// iterate using for each loop
		System.out.println(al);
		for (String st : al) {
			System.out.println(st);
		}

		// remove from array list
		al.remove(2);
		System.out.println(al);
		al.add(2, "Shrey");
		System.out.println(al);

		// iterate in array list
		Iterator itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());

		}

	}

}
