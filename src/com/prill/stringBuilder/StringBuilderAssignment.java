package com.prill.stringBuilder;

public class StringBuilderAssignment {
	public static void main(String[] args) {
//	1. the main difference between the StringBuffer and StringBuilder is that 
//		StringBuilders methods are not thread safe (not synchronised).
//	
//	2. You use the syntax as shown below:
		StringBuilder str1 = new StringBuilder("Java Full Stack Developer");

//	3. Reverse shown below:
		System.out.println("=====Question 3=====");
		StringBuilder statement1 = new StringBuilder("Welcome to class");
		StringBuilder statement2 = new StringBuilder("This is Java");
		StringBuilder statement3 = new StringBuilder("Basics tutoring.");
		statement1.reverse();
		statement2.reverse();
		statement3.reverse();
		System.out.println("Reversed String: " + statement1);
		System.out.println("Reversed String: " + statement2);
		System.out.println("Reversed String: " + statement3);

//	4. Using Delete to start at index 4 and end at index 10
		System.out.println("=====Question 4=====");
		StringBuilder statement4 = new StringBuilder("Welcome to our class");
		StringBuilder statement5 = new StringBuilder("This is java basics!");
		StringBuilder statement6 = new StringBuilder("Happy Coding Friends");
		statement4.delete(4, 10);
		statement5.delete(4, 10);
		statement6.delete(4, 10);
		System.out.println("Deleted String: " + statement4);
		System.out.println("Deleted String: " + statement5);
		System.out.println("Deleted String: " + statement6);

//	5. Strings are immutable and by contrast StringBuilders are mutable so its area of memory can be changed
		
//	6. 
		System.out.println("=====Question 6=====");
		StringBuilder s1 = new StringBuilder("Java");
		StringBuilder s2 = new StringBuilder("HTML");
		s1.append(" is fun");
		System.out.println(s1);
		s1.append(s2);
		System.out.println(s1);
		
		
		
		

	}
}