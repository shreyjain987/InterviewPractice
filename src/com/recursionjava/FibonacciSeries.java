package com.recursionjava;

public class FibonacciSeries {

	static int n1 = 0, n2 = 1, n3 = 0;

	public static int fibo(int count) {
		if (count > 0) {
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			System.out.println(n3);
			fibo(count - 1);
		}
		return count;
	}

	public static void main(String[] args) {
		int count = 15;
		fibo(count);
	}
}
