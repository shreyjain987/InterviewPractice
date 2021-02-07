package com.practice;

public class LargestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// method 1
		System.out.println("Largest in given array is " + largest());
		
		//============================
		
		// Method 2
		int a[]={1,2,5,6,3,2};  
		int b[]={44,66,99,77,33,22,55};  
		System.out.println("Largest: "+getLargest(a,6));  
		System.out.println("Largest: "+getLargest(b,7));  
	}

	// Method 1
	static int arr[] = { 10, 324, 45, 90, 9808 };

	static int largest() {
		int i;

		// Initialize maximum element
		int max = arr[0];

		// Traverse array elements from second and
		// compare every element with current max
		for (i = 0; i < arr.length; i++)
			if (arr[i] > max)
				max = arr[i];

		return max;
	}

	
	// ===================================================
	// Method 2

	public static int getLargest(int[] a, int total) {
		int temp;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < total; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		return a[total - 1];
	}
}
