package com.prill.interfaces;

public interface Comparable {
	
	public static void max(double obj1, double obj2) {
		
		if(obj1 > obj2) {
			System.out.println("The First Arg is bigger");
		} else if (obj2 > obj1) { 
			System.out.println("The Second Arg is Bigger");
		} else {
			System.out.println("They are equal");
		}
	}

}
