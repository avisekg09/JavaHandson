package com.ArrayListPractice;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {

	public static void main(String[] args) {
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int random;
		for(int i=0;i<9;i++) {
			random = (int)( Math.random()*100);
			arr.add(random);
		}
		Collections.sort(arr);
		System.out.println(arr);

	}

}
