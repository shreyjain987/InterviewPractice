package com.practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RemoveEvenNumFromArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<Integer>();

		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);

		Iterator<Integer> it = list.iterator();
		while (it.hasNext()) {
			Integer number = it.next();
			if (number % 2 == 0) {
				it.remove();
			}
		}
		System.out.println("ArryList Odd Number=" + list);
	}

}
