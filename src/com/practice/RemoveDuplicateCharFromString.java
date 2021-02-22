package com.practice;

import java.util.LinkedHashSet;

public class RemoveDuplicateCharFromString {

	// Method 1
	/*
	 * Function removes duplicate characters from the string This function work
	 * in-place
	 */
	public void removeDuplicates() {

		String s = "Helloo Worrldd";

		LinkedHashSet<Character> lhs = new LinkedHashSet<>();
		for (int i = 0; i < s.length(); i++) {
			lhs.add(s.charAt(i));
		}

		// print string after deleting duplicate elements
		for (Character ch : lhs) {
			System.out.print(ch);
		}

	}

	// Method 2 -- Write this one
	public static String removeDuplicateChars() {

		String s = "Helloo World";
		String str = new String();
		int len = s.length();

		// loop to traverse the string and
		// check for repeating chars using
		// IndexOf() method in Java
		for (int i = 0; i < len; i++) {

			// character at i'th index of s
			char c = s.charAt(i);

			// System.out.println(str + " = " + c + " = " + str.indexOf(c));

			// if c is present in str, it returns
			// the index of c, else it returns -1
			if (str.indexOf(c) < 0) {
				// adding c to str if -1 is returned
				str += c;
			}
		}

		System.out.println(str);

		return str;
	}

	public static void main(String[] args) {

		RemoveDuplicateCharFromString rs = new RemoveDuplicateCharFromString();
		rs.removeDuplicates();

		removeDuplicateChars();

	}

}
