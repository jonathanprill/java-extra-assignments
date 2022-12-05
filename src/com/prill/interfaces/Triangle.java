package com.prill.interfaces;

import java.util.Scanner;

public class Triangle extends GeometricObject {
	Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		Triangle obj = new Triangle();
		obj.promptUser();
		
		obj.max(12.25, 15.45);
		obj.max(19.25, 15.45);
		
	}

	public void promptUser() {
		System.out.println("Enter length of side one of the triangle: ");
		s1 = input.nextInt();
		System.out.println("Enter length of side two of the triangle: ");
		s2 = input.nextInt();
		System.out.println("Enter length of side three of the triangle: ");
		s3 = input.nextInt();
		System.out.println("What color is your triangle?");
		input.nextLine();
		String color = input.nextLine();
		System.out.println("Is your triangle filled?(true/false)");
		boolean filled = input.nextBoolean();
		
		s = getS(s1, s2, s3);
		area = getArea(s, s1, s2, s3);
		perimeter = getPerimeter(s1, s2, s3);
		
		System.out.println("Area: " + area);
		System.out.println("Perimeter: " + perimeter);
		System.out.println("Color: " + color);
		System.out.println("Filled?: " + filled);
	}
	
	
}
