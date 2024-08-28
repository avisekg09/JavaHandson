package com.javaHandson;

import java.util.Arrays;

public class SortArrays {

	public static void main(String[] args) {
		int [] arr = {5,3,9,8,2,20};
		Arrays.sort(arr);
		for(int i:arr) {
			System.out.print(i+" ");
		}

	}

}
