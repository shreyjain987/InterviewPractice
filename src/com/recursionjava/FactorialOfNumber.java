package com.recursionjava;

public class FactorialOfNumber {

	public static int fact(int i) {

		if (i == 1) {
			return 1;
		} else {
			return (i * fact(i - 1));
		}
	}
	
	public static void main(String[] args) {
		int number = fact(10);
		System.out.println(number);
	}
}
