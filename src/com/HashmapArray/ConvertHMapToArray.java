package com.HashmapArray;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class ConvertHMapToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> hm = new HashMap<>();
		hm.put("TV", 1);
		hm.put("Fridge", 2);
		hm.put("Micro", 3);
		hm.put("WMachine", 4);
		
		// print key
		Set s1 = hm.keySet();
		ArrayList<String> als = new ArrayList<>(s1);
		System.out.println(als);
		
		// print value
		Collection c = hm.values();
		System.out.println(c);
		
		// print key=value
		Set s2 = hm.entrySet();
		ArrayList ali = new ArrayList<>(s2);
		System.out.println(ali);
	}

}
