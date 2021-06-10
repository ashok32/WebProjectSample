package com.practice.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		
//		Map<Integer, String> hm=new HashMap<Integer, String>();
//		
//		hm.put(1, "A");
//		hm.put(2, "B");
//		hm.put(3, "C");
//		hm.put(4, "D");
//		hm.put(5, "E");
//			
//		hm.put(new Integer(6), "Four");
//		hm.put(new Integer(7),"Great");
//		hm.put(new Integer(8), "Hour" );
//		
//		System.out.println(hm);
//		
//		//hm.remove(5);
//		hm.remove(new Integer(5), "E");
//		
//		System.out.println("After removing 5th entry" + hm);
		
//		Map<String,String> hm=new HashMap<String,String>();
//		
//		hm.put("Red"," Apple" );
//		hm.put("yellow", "lemon");
//		hm.put("blue", "berries");
//		hm.put("green", "olives");
//		System.out.println(hm);
//		
//		Map<Integer, Integer> hm1 =new HashMap<Integer, Integer>();
//		hm1.put(1, 10);
//		hm1.put(2, 20);
//		hm1.put(3, 30);
//		System.out.println(hm1);
//		
//		Map<Double, Double> hm2=new HashMap<Double, Double>();
//		hm2.put(1.1, 111.1);
//		hm2.put(2.1, 21111.1);
//		hm2.put(3.1, 31111.1);
//		System.out.println(hm2);
//		
//		Map<Float, Float> hm3=new HashMap<Float, Float>();
//		hm3.put(10.1f, 100.1f);
//		hm3.put(20.1f, 200.1f);
//		System.out.println(hm2);
//		
		Map<String, Integer> phoneBook=new HashMap<String, Integer>();
		phoneBook.put("Rama", 902345876);
		phoneBook.put("krishna", 980123456);
		phoneBook.put("aditya", 890213457);
		phoneBook.put("ravi", 789012743);
		phoneBook.put("bhanu", 678143265);
		
		//System.out.println(phoneBook.get("krishna"));
//		Set<String> keySet=phoneBook.keySet();
//		for(String s: phoneBook.keySet())
//		{
//		System.out.println(phoneBook.get(s));}
		Set<Map.Entry<String, Integer>> values=phoneBook.entrySet();
		for(Map.Entry<String, Integer> e: values)
		{
		System.out.println("get the keys = "+ e.getKey() );
		}
		
		
		
		
		
		
	}

}
