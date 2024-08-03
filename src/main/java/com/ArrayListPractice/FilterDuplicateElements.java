package com.ArrayListPractice;

import java.util.ArrayList;

public class FilterDuplicateElements {

	public static void main(String[] args) {
		
		//Question#1: Write code to filter duplicate elements from an array and print as a list.
		int[] arr = {2,2,8,8,9,5,4,6,6,2};
		ArrayList<Object> duplicates = new ArrayList<Object>();
		int temp=0;
		int count = 0;
		for(int i=0;i<arr.length;i++) {
			temp=arr[i];
			for(int j=0;j<arr.length;j++) {
				if(temp==arr[j]) {
					count++;
					
				}
			}
			if(count>1) {
				duplicates.add(temp);
			}
			count = 0;
		}
		System.out.println(duplicates);
		
	}

}
