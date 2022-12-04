//  Answers to question 7

package com.prill.stringBuilder;

public class MyStringBuilder {

	
	public static void main(String[] args) {
		
		String s = "Hello World";
		int i = 123;
		StringBuilder s1 = new StringBuilder(s);
		s1.append(s);
		s1.append(i);

		
		System.out.println("Append: " + s1);
		System.out.println("Length: " + s1.length());
		System.out.println("charAt: " + s1.charAt(12));
		System.out.println("subString: " + s1.substring(2, 7));
		System.out.println("toString: " + s1.toString());
	}

}
