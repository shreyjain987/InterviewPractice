package com.javacollections;

import java.util.ArrayList;

public class CompareArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> al1 = new ArrayList<>();
		al1.add("Shrey");
		al1.add("Aditi");
		al1.add("Akshay");
		al1.add("Sachit");

		ArrayList<String> al2 = new ArrayList<>();
		al2.add("Empty");
		al2.add("Sachit");
		al2.add("Aditi");
		al2.add("New");

		ArrayList<String> al3 = new ArrayList<>();
		for (String temp : al1) {
			al3.add(al2.contains(temp) ? "Yes" : "No");
		}
		System.out.println(al3);
	}

}
