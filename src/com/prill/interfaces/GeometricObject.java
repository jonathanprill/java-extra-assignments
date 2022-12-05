package com.prill.interfaces;

public abstract class GeometricObject implements Comparable{
	int s1, s2, s3;
	double s;
	double area;
	double perimeter;

	public double getS(int s1, int s2, int s3) {
		double s = (s1 + s2 + s3) / 2;
		return s;
	}

	public double getArea(double s, int s1, int s2, int s3) {
		double area = Math.sqrt(s * (s - s1) * (s - s2) * (s - s3));
		return area;
	}

	public double getPerimeter(int s1, int s2, int s3) {
		double perimeter = s1 + s2 + s3;
		return perimeter;
	}

	public static void max(double obj1, double obj2) {

		if (obj1 > obj2) {
			System.out.println("The First Arg is bigger");
		} else if (obj2 > obj1) {
			System.out.println("The Second Arg is Bigger");
		} else {
			System.out.println("They are equal");
		}
	}

}
