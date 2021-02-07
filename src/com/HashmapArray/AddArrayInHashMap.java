package com.HashmapArray;

import java.util.ArrayList;
import java.util.HashMap;

public class AddArrayInHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, ArrayList<String>> hm1 = new HashMap<String, ArrayList<String>>();
		ArrayList<String> al1 = new ArrayList<String>();
		
		al1.add("Selenium");
		al1.add("Cucumber");
		
		hm1.put("Framework", al1);
		
		System.out.println(hm1.get("Framework"));
		
		HashMap<String, ArrayList<String>> hm2 = new HashMap<String, ArrayList<String>>();
		ArrayList<String> al2 = new ArrayList<String>();
		
		al2.add("Java");
		al2.add("Python");
		
		hm2.put("Language", al2);
		
		System.out.println(hm2.get("Language"));
		
		
	}

}
