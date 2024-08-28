package com.javaHandson;

public class StringReverse {

	/*
	 * 1. Reverse a String
	 */
	public static void main(String[] args) {
		
		String text = "Automation";
		String reverseText="";
		for(int i = text.length();i!=0;i--) {
			reverseText = reverseText + text.charAt(i-1);
//			System.out.println(reverseText);
		}
		System.out.println(reverseText);
		System.out.println(reverse("Hello World"));
	}

	public static StringBuilder reverse(String text) {
		StringBuilder reverseText = new StringBuilder(text);
		return reverseText.reverse();
	}
}
