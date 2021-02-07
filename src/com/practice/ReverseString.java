package com.practice;

import java.util.Iterator;

public class ReverseString {

	public static void main(String[] args) {

		// Method 1
		String input = "Shrey Jain";

		// getBytes() method to convert string into bytes[].
		byte[] strAsByteArray = input.getBytes();

		byte[] result = new byte[strAsByteArray.length];

		// Store result in reverse order into the result byte[]
		for (int i = 0; i < strAsByteArray.length; i++) {
			result[i] = strAsByteArray[strAsByteArray.length - i - 1];
		}
		System.out.println(new String(result));

		System.out.println(new String("========================"));

		
		
		
		// ========================
		// Method 2
		String original = "shrey jain";
		String reverse = "";
		// Scanner in = new Scanner(System.in);

		// System.out.println("Enter a string to reverse");
		// original = in.nextLine();

		int length = original.length();
		System.out.println(length);

		for (int i = length - 1; i >= 0; i--) {
			reverse = reverse + original.charAt(i);
			//System.out.println(reverse);
		}
		/*
		 * for (int i = 0; i < result.length; i++) { reverse = reverse +
		 * original.charAt(i); System.out.println(reverse); }
		 */
		System.out.println("Reverse of the string: " + reverse);
		
		
		//==================
		//Method 3
		String inputStr = "Shrey Jain";
		 
        StringBuilder input1 = new StringBuilder();
 
        // append a string into StringBuilder input1
        input1.append(inputStr);
 
        // reverse StringBuilder input1
        input1 = input1.reverse();
 
        // print reversed String
        System.out.println(input1);
	}
}
