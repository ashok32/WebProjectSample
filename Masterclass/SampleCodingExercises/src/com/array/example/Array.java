package com.array.example;

import java.util.Scanner;

public class Array {
	
	public static Scanner scanner=new Scanner(System.in);
	
	public static int[] getIntegers(int number)
	{
		int[] values=new int[number];
		
		for(int i=0; i<values.length; i++)
		{
			values[i]=scanner.nextInt();
			System.out.println("Enter " + number + " integer values " + "\r ");
		}
		
		return values;
	}
	
	public static double getAverage(int[] array)
	{
		int sum=0;
		for(int i=0; i<array.length; i++)
		{
			sum+=array[i];
		}
		return (double) sum/ (double) array.length;
	}
	
	public static void main(String[]args)
	{
		int[] myIntegers=getIntegers(5);
		
		for(int i=0; i<myIntegers.length; i++)
		{
			System.out.println("Element " + i +", typed value was " + myIntegers[i]);
		}
		
		System.out.println("The average is = " + getAverage(myIntegers));
	}
	

}
