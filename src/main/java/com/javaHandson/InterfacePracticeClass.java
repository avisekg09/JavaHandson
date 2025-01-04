package com.javaHandson;

public class InterfacePracticeClass implements PracticeInterfaceTopics {

	public static void main(String[] args) {
		PracticeInterfaceTopics ip = new InterfacePracticeClass();
		ip.run();
		ip.walk();		
	}

	@Override
	public void run() {
		System.out.println("Run implementation");
		
	}

	@Override
	public void walk() {
		System.out.println("Walk implementation");
		
	}

}
