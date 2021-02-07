package com.HashmapArray;

import java.util.Arrays;
import java.util.Collections;

public class ReverseArray {

	/* 1st Method
	 * function that reverses array and stores it in another array
	 */
	static void reverse(int a[], int n) {
		int[] b = new int[n];
		int j = n;
		for (int i = 0; i < n; i++) {
			b[j - 1] = a[i];
			j = j - 1;
		}

		/* printing the reversed array */
		System.out.println("Reversed array is: \n");
		for (int k = 0; k < n; k++) {
			System.out.println(b[k]);
		}
	}
	
	
	// 2nd method
	/*function reverses the elements of the array*/
    static void reverse(Integer a[]) 
    { 
        Collections.reverse(Arrays.asList(a)); 
        System.out.println(Arrays.asList(a)); 
    } 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 10, 20, 30, 40, 50 };
		reverse(arr, arr.length);
	}

}
