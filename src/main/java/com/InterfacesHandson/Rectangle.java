package com.InterfacesHandson;

import java.util.Scanner;

public class Rectangle implements Shape {

	static int length;
	static int breadth;
	
	public static void main(String[] args) {
		
		Shape s = new Rectangle();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Length and Breadth - ");
		length = sc.nextInt();
		breadth = sc.nextInt();
		System.out.println(s.calculateArea());

	}

	@Override
	public double calculateArea() {
		
		return length*breadth;
		
		
	}

}
