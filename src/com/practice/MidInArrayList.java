package com.practice;

import java.util.ArrayList;
import java.util.List;

public class MidInArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();

		for (int i = 0; i <= 50; i++) {
			list.add(String.valueOf(i));
		}

		int middle = list.size() / 2;

		String middleValue = list.get(middle);

		System.out.println(middleValue);
	}

}
