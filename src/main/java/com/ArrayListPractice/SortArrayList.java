package com.ArrayListPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class SortArrayList {

	public static void main(String[] args) {
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int random;
		for(int i=0;i<9;i++) {
			random = (int)( Math.random()*100);
			arr.add(random);
		}
		arr.stream().forEach(ele->System.out.print(ele+","));
		System.out.println("\n---------");
		Collections.sort(arr);
		System.out.println(arr);
		//using iterator
		Iterator<Integer> it = arr.iterator();
		System.out.println("\n---------");
		while(it.hasNext()) {
			System.out.print(it.next()+",");
		}
	}

}
