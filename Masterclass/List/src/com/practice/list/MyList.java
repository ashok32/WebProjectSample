package com.practice.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class MyList {

	
	public static void main(String[] args) {

//		//add(element)
//		List<Integer> l1=new ArrayList<>();
//		l1.add(0);
//		l1.add(1);
//		l1.add(2);
//		System.out.println("Adding integers items in the list = " + l1);
//		
//		List<String> ls=new ArrayList<>();
//		ls.add("Apple");
//		ls.add("Banana");
//		ls.add("Orange");
//		System.out.println("Adding String items in the list =" + ls);
//		// add(index, element)
//		System.out.println("Another add method beased on the index ");
//		List<Integer> li=new ArrayList<>();
//		li.add(0, 10);
//		li.add(1, 20);
//		li.add(2, 30);
//		li.add(3, 40);
//		li.add(4,50);
//		System.out.println("Adding elements based on the index = " + li);
//		List<String> lst=new ArrayList<>();
//		lst.add(0, "Atlanta");
//		lst.add(1,  "Boston");
//		lst.add(2, "California");
//		lst.add(3, "denmark");
//		System.out.println("Adding elements based on the index = " + lst);
//		System.out.println("Add all method.... addAll(Collection c)");
//		List<Integer> lc=new ArrayList<>();
//		lc.add(100); 
//		lc.add(200); 
//		lc.add(300); 
//		lc.add(400);
//		lc.add(500);
//		lc.addAll(0, lc);
//		System.out.println("addAll(index, Collection)");
//		System.out.println("group of objects stored in the list=" + lc);
//		List<String> lcs=new ArrayList<>();
//		lcs.addAll(0, lst);
//		System.out.println("Adding collection of list at index zero =" + lcs);
//		System.out.println("###################################################################################################");
//		//List<String>
		
//		ArrayList<String> str=new ArrayList<>();
//		str.add("America");
//		str.add("Bahamas");
//		str.add("California");
//		System.out.println("My Array list = " + str);
//		str.addAll(0, str);
		//str.addAll(1, str);
		
//		str.remove(2);
//		str.addAll(str);
//		
//		System.out.println("Array list added to as group collection = " + str);	
//		
//		//System.out.println("Array list added to as group collection = " + str);	
//		ArrayList<Integer> al=new ArrayList<>();
//		al.add(0, 11);
//		al.add(1, 22);
//		al.add(2, 44);
//		System.out.println("This is ineteger Array= " + al);
//		System.out.println("Get the 2nd object from above arraylist=" + al.get(1) );
//		System.out.println("Get the size from above arraylist=" + al.size() );
//		
		//ArrayList<String> lnl=new LinkedList<>();
		
//		LinkedList<String> lnl=new LinkedList<>();
//		lnl.add("Apple");
//		lnl.add("Banana");
//		lnl.add("Califlower");
//		lnl.addFirst("Fruits Start");
//		lnl.addLast("Vegitables End");
//		lnl.add(4, "End Fruits");
//		//lnl.remove("Califlower");
//		lnl.remove(0);
//		System.out.println("Linked list  = " + lnl);	
		
		List<String> li=new ArrayList<>();
		li.add(0, "Java");
		li.add(1, "Test");
		li.add(2, "Hadoop");
		li.add(3, "Android");
		//System.out.println("Get the size from above list=" + li.size());
		
		ListIterator<String> liIterator = li.listIterator();
		
		while(liIterator.hasNext())
		{
			System.out.println(liIterator.next());
		}
//		for(String sst: li)
//		{
//			System.out.println(sst);
//		}
		
		System.out.println("Back work direction");
		
		while(liIterator.hasPrevious())
		{
			System.out.println(liIterator.previous());
		}
	}

}
