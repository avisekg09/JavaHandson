package com.javaHandson;

public class ReverseArray {

	public static void main(String[] args) {
		int[] arr = {11,78,20,56,51,45,20,32};
		int temp;
		boolean flag = false;
//		for(int i =0;i<arr.length/2;i++) {
//			temp = arr[i];
//			arr[i] = arr[arr.length - (1+i)];
//			arr[arr.length - (1+i)] = temp;
//		}
//		for(int a : arr) {
//			System.out.print(a+" ");
//		}
		int searchElement = 4;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==searchElement) {
				System.out.println("Element Found at index "+i);
				flag = true;
			}
		}
		if(flag == false) {
			System.out.println("Element is not present");
		}
		
	}
}
