package com.array;

public class Array {

	// This ia Array Class
	
	public static void printArray(int[] array )
	{
		for(int i=0; i<array.length; i++)
		{
			
			System.out.println("Element of " + i + "value is = " + array[i]);
		}
	}
	
	public static void main(String[]args)
	{
		
		int[] myIntArray=new int[25];
		
		
		for(int i=0; i<myIntArray.length; i++)
		{
		myIntArray[i]=10*i;
			
		}
		
		Array.printArray(myIntArray);
		
    }
}
	
