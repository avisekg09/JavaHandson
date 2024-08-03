package com.ArrayListPractice;

public class ParanthesisMatch {

	public static void main(String[] args) {
		
		String text = "Hello ))((((I (am)) too much (confused))";
		int countOpening = 0;
		int countClosing = 0;
		for(int i=0;i<text.length();i++) {
			if(text.charAt(i)== '(') {
				countOpening++;
			}
			if(text.charAt(i)== ')') {
				countClosing++;
			}
		}
		if(countOpening==countClosing) {
			System.out.println("Parenthesis are blanced");
		}else {
			System.out.println("Parenthesis are not blanced");
		}
	}

}
