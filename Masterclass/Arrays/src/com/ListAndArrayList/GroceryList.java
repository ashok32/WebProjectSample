package com.ListAndArrayList;

import java.util.ArrayList;

public class GroceryList {

	private ArrayList<String> groceryList =new ArrayList();
	
	public void addGroceryItem(String item)
	{
		groceryList.add(item);
	}
	public void printGroceryList()
	{
		groceryList.size();
		
		System.out.println("you have " + groceryList.size() + "items in your grocey list");
		
		for(int i=0; i<groceryList.size(); i++)
		{
			System.out.println((i+1) + " . " + groceryList.get(i));
		}
	}
	public void modifyGroceryItem(int position, String theItem)
	{
		groceryList.set(position, theItem);
		
		System.out.println("Grocey Item " + (position + 1) + "has been modified");
	}
	public void removeGroceyItem(int position)
	{
		String theItem=groceryList.get(position);
		
		groceryList.remove(position);
	}
}
