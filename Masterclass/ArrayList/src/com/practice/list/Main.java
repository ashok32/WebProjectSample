package com.practice.list;

import java.util.ArrayList;

public class Main {
	
	
	
	public static void main(String[]args)
	{
	//ArrayList<String> string;
	
	ArrayList<String> string=new ArrayList<>();
	
	string.add("apple");
	string.add("banana");
	string.add("orange");
	string.add("orange");
	string.add("pineapple");
	
	//string.set(2, "mango");
	
	
	System.out.println("the size of the array list = " + string.size());
	string.set(4, "grapes");
	System.out.println("the 5th element of the array list = " + string.get(4));
	string.remove(2);
	
	System.out.println("the size of the array list = " + string.size());
	System.out.println("the elements of the array list is = " + string);
	
	
	}
}
