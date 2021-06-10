package com.practice.sort;

import java.util.Arrays;

public class Sorting {

	public static void main(String[] args) {
		
		int [] array = {70,40,50,10,90,80,60,30};
		
		Arrays.sort(array);
		for(int i=0; i < array.length; i++)
		{
			System.out.println("After sorting of arrays = " + array[i]);
		}
	}

}
