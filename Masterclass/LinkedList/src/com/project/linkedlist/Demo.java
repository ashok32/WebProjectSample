package com.project.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;



public class Demo {

	public static void main(String[] args) {
		
		LinkedList<String> placesToVisit=new LinkedList<String>();
		
//		placesToVisit.add("newyork");
//		placesToVisit.add("california");
//		placesToVisit.add("nevda");
//		placesToVisit.add("texas");
//		placesToVisit.add("chicago");
//		placesToVisit.add("newjersy");
//		placesToVisit.add("arizona");
//		
		//printList(placesToVisit);
		
//		placesToVisit.add(1, "Kansas");
//		printList(placesToVisit);
//		
//		placesToVisit.remove(1);
//		printList(placesToVisit);
		
		addInOrder(placesToVisit, "frisco");
		addInOrder(placesToVisit, "fremont");
		addInOrder(placesToVisit, "milpitas");
		addInOrder(placesToVisit, "sanjose");
		addInOrder(placesToVisit, "unioncity");
		addInOrder(placesToVisit, "hayward");
		addInOrder(placesToVisit, "doublin");
		addInOrder(placesToVisit, "austin");
		addInOrder(placesToVisit, "doublin");
		printList(placesToVisit);
	}
	public static void printList(LinkedList<String> linkedList)
	{
		Iterator<String> i=linkedList.iterator();
		
		while(i.hasNext())
		{
			System.out.println("now visiting " + i.next());
		}
		
		System.out.println("=================");
	}
	
	private static boolean addInOrder(LinkedList<String> linkedList, String newCity)
	{
		ListIterator<String> StringListIterator=linkedList.listIterator();
		while(StringListIterator.hasNext())
		{
			int comparison=StringListIterator.next().compareTo(newCity);
			if(comparison==0)
			{
				System.out.println(newCity + "is already included as destination");
				return false;
			}
			else if(comparison>0)
			{
				StringListIterator.previous();
				StringListIterator.add(newCity);
				
				return true;
			}
			else if(comparison < 0)
			{
				
			}
		}
		StringListIterator.add(newCity);
		return true;
		
	}

}
