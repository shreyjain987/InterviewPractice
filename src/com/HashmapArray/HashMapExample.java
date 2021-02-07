package com.HashmapArray;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hmap = new HashMap<Integer, String>();
		/* Adding elements to HashMap */
		hmap.put(12, "Chaitanya");
		hmap.put(2, "Rahul");
		hmap.put(7, "Singh");
		hmap.put(49, "Ajeet");
		hmap.put(3, "Anuj");

		// print hashmap
		System.out.println(hmap);

		// print Key
		Set kset = hmap.keySet();
		System.out.println(kset);

		// print value using collection
		Collection c = hmap.values();
		System.out.println(c);

		System.out.println("Key = " + kset + " & value = " + c);

		// print value using set
		Set eset = hmap.entrySet();

		// print key value using Iterator
		Iterator itr = eset.iterator();
		while (itr.hasNext()) {
			Map.Entry m1 = (Map.Entry) itr.next();
			System.out.println(m1);
			if (m1.getKey().equals(12)) {
				m1.setValue("Shrey");
			}

			System.out.println(m1);
		}

		// pring key-value using for each loop
		for (Map.Entry<Integer, String> e : hmap.entrySet()) {
			int k = e.getKey();
			String v = e.getValue();

			System.out.println("Key = " + k + " & value = " + v);
		}
	}

}
