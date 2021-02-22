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
		
		Integer arr2[] = { 10, 20, 30, 40, 50 };
		reverse(arr2);
		
		
		
		
		
		
		
		
		// ==== BEST APPROACH
		 //Initialize array  
        int[] arr1 = new int [] {1, 2, 3, 4, 5};  
        System.out.println("Original array: ");  
        for (int i = 0; i < arr1.length; i++) {  
            System.out.print(arr1[i] + " ");  
        }  
        System.out.println();  
        System.out.println("Array in reverse order: ");  
        //Loop through the array in reverse order  
        for (int i = arr1.length-1; i >= 0; i--) {  
            System.out.print(arr1[i] + " ");  
        }  
		
		
	}

}
