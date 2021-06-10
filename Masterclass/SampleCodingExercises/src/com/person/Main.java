package com.person;

public class Main {

	public static void main(String[] args) {
		
		Person p=new Person();
		
		p.setFirstName("Rama");
		System.out.println("My firstName is " + p.getFirstName());
		
		p.setLastName("Krishna");
		System.out.println("My last name is "+ p.getLastname());
		
		p.setAge(15);
		
		System.out.println("My fullName is =" + p.getFullName());
		
		p.isTeen();
		
		System.out.println("is Teen =" + p.isTeen());
	}

}
