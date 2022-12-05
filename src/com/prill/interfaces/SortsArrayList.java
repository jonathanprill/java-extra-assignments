package com.prill.interfaces;

import java.util.ArrayList;
import java.util.Collections;

public class SortsArrayList {
	public static void main(String[] args) {
		SortsArrayList obj1 = new SortsArrayList();
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(1);
		list1.add(3);
		list1.add(2);
		list1.add(15);
		list1.add(11);
		obj1.sort(list1);
		System.out.println("Sorted List: " + list1);
	}

	public static void sort(ArrayList<Integer> list) {
		Collections.sort(list);
	}
}
