package com.javaHandson;

public class MaximumDifference {

	public static void main(String[] args) {

		int [] arr = {1,2,3,4,5};
		int temp =0;
		int index_i=0;;
		int index_j=0;;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
//				System.out.println("value of i "+i +" & value of j "+j);
				if(j>i) {
					if(arr[j]-arr[i]>0) {
//						System.out.println(arr[j]-arr[i]);
						if(arr[j]-arr[i]>temp)
						{
							index_i = i;
							index_j = j;
							temp = arr[j]-arr[i];
						}
						
					}
				}
			}
		}
		System.out.println(temp);	
		System.out.println("arr["+index_i+"]"+"-arr["+index_j+"]");
	}

}
