package com.recursionjava;

public class anagram {

	public static void main(String[] args) {

		test("abc", "");
		// test("abc");
	}

	public static void test(String str, String ans) {

		if (str.length() == 0) {

			System.out.println(ans);
		}

		for (int i = 0; i < str.length(); i++) {

			// System.out.println(str.length());
			char ch = str.charAt(i);

			// System.out.println("i: " + i + " and ch : " + ch);

			String ros = str.substring(0, i) + str.substring(i + 1);
			// System.out.println("ros: " + ros + " and ans: " + ans + ch);

			test(ros, ans + ch);

		}
	}

}
