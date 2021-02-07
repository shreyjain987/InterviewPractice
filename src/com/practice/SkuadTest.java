package com.practice;

import java.util.Scanner;

public class SkuadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter no. of elements you want in array:");
		n = s.nextInt();
		int a[] = new int[n];
		System.out.println("Enter all the elements:");
		for (int i = 0; i < n; i++) {
			a[i] = s.nextInt();
		}
		
		System.out.print("Odd Even Numbers:");
		for (int i = 0; i < n; i++) {
			if (a[i] % 2 != 0) {
				// System.out.print(a[i] + "o" + " ");
				System.out.print("o" + " ");
			} else if (a[i] % 2 == 0) {
				// System.out.print(a[i] + "e" + " ");
				System.out.print("e" + " ");
			}
		}
//		System.out.println("");
//		System.out.print("Even numbers:");
//		for (int i = 0; i < n; i++) {
//			if (a[i] % 2 == 0) {
//				System.out.print(a[i] + " ");
//			}
//		}
	}

}
