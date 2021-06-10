package com.carmodels;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car tesla=new Car();
		
		tesla.setModel("Honda");
		
	System.out.println("Model is " + tesla.getModel());
	
	tesla.setColour("Red");
	
	//String t=tesla.getClour();
	
	System.out.println("My model colour is " + tesla.getClour());
	
	tesla.setDoors(4);
	
	System.out.println("My model car doors are having " + tesla.getDoors());
	
	Car benz=new Car();
	
	benz.setWinodws(6);
	
	System.out.println("my car having windows are " + benz.getWinodws());
		
	}

	
}
