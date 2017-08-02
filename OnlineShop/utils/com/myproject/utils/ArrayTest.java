package com.myproject.utils;

import java.util.Arrays;

public class ArrayTest {

	static int count;
	static  int[] clone;
	static int[] arr = { 1,2,3,4,5,4,4,4};
	int k = 0;
	static int ch;
	public static void main(String[] args) {
	
		for (int i = 0; i < arr.length; i++) {
			System.out.println("======I=======");
			System.out.println("i: " +  arr[i]);
			System.out.println("======J=======");
			if(arr[i] == i){
				
			for (int j = 0; j < arr.length; j++) {
				System.out.println("j: " +  arr[j] + " ");
				if(arr[i] == arr[j]){
					System.out.println("dubl number: " + arr[j]);
	
				}
				
				
			}
			
			}
			
			

		}
		
		System.out.println("All arrays: " + Arrays.toString(arr));

	}
	
	

}
