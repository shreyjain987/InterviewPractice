package com.javacollections;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class RemoveDuplicates {
	public static void main(String[] args) {
		ArrayList<String> myList = new ArrayList<String>();
		myList.add("Selenium");
		myList.add("Selenium");
		myList.add("Java");
		myList.add("Git");
		myList.add("Python");
		myList.add("Git");
		myList.add("Selenium");
		
		System.out.println("List Before: " + myList);
		
		LinkedHashSet<String> lhs = new LinkedHashSet<>();
		
		lhs.addAll(myList);
		System.out.println("List Mid: " + lhs);
		lhs.clear();
		
		lhs.addAll(myList);
		
		System.out.println("List After: " + lhs);
 	}

}
