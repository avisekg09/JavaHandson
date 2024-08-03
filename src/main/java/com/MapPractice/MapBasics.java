package com.MapPractice;

import java.util.HashMap;

public class MapBasics {

	public static void main(String[] args) {
		
		HashMap<String, String> mobileModel = new HashMap<String, String>();
		
		mobileModel.put("Samsung", "S-series");
		mobileModel.put("Iphone", "Iphone 15");
		mobileModel.put("Realme", "Narzo series");
		mobileModel.put("Sony", "Xperia Series");
		mobileModel.forEach((t, u) -> System.out.println("Mobile Brand - "+t+ ", mobile Model"+u));

	}

}
