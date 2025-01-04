package com.InterfacesHandson;

import java.util.Scanner;

public class Circle implements Shape {
	
	static double radius;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius - ");
		radius = sc.nextDouble();
		Shape s = new Circle();
		System.out.println(s.calculateArea());

	}

	@Override
	public double calculateArea() {
		
		return 3.14*radius*radius;
	}
}

