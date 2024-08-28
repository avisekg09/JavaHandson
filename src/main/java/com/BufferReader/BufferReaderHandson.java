package com.BufferReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BufferReaderHandson {

	public static void main(String[] args) throws IOException {
//		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String toRead = reader.readLine();
//        String line = reader.readLine();
//        System.out.println(line);
//        while((line = reader.readLine()) != null) {
//        	String[] token = line.split("\\s");
//        	System.out.print(Arrays.toString(token));
//        	line = reader.readLine();
//        	}
//        while(i!=-1){
//        System.out.print((char)i);
//        }
//		String[] tokens=null;
//		 BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//	        String toRead = reader.readLine();
//	        while((toRead = reader.readLine())!=null){
//	             tokens = toRead.split("\\s");
//	        }
//	        for(String s:tokens){
//	               System.out.print(s+" ");
//	        } 
		
		try (InputStreamReader in = new InputStreamReader(System.in);
	            BufferedReader buffer = new BufferedReader(in))
		
	        {
	            String line = buffer.readLine();
	            while (line != null)
	            {
	                String[] tokens = line.split("\\s");
	                System.out.println(Arrays.toString(tokens));
	                break;
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	}

}
