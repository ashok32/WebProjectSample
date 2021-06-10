package com.collection;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		
		
		ArrayList arrayList=new ArrayList();
		
		System.out.println(" The size of the array = " + arrayList.size());
		arrayList.add("A");
		arrayList.add("B");
		arrayList.add("C");
		arrayList.add("D");
		arrayList.add("E");
		arrayList.add("F");
		
		arrayList.add(6, 9);
		
		arrayList.remove(6);
		
		System.out.println(" The size of the array = " + arrayList.size());
		System.out.println(" The size of the array = " + arrayList);

	}

}
