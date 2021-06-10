package com.collection;

import java.util.LinkedList;

public class Mystack {

	public static void main(String[] args) {
		
		
		Car myCar;
		Bird myBird;
		Mystack s=new Mystack();
		s.push1(new Car());
		s.push2(new Bird());
		
		myCar=(Car) s.pop();
		System.out.println(" The first element in the list" + myCar);
		myBird=(Bird) s.bottom();
		System.out.println(" The last element in the list" + myBird);
		

	}
	LinkedList list=new LinkedList();
	
	public void push1(Object o)
	{
		list.addFirst(o);
	}
	public void push2(Object obj)
	{
		list.addLast(obj);
	}
	public Object bottom()
	{
		return list.getLast();
	}
	public Object pop()
	{
		return list.remove();
	}
	

}
