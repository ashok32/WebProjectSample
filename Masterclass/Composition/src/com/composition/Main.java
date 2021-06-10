package com.composition;

public class Main {

	public static void main(String[] args) {
		
		Wall wall1=new Wall("east");
		Wall wall2=new Wall("west");
		Wall wall3=new Wall("South");
		Wall wall4=new Wall("north");
		Ceiling ceiling=new Ceiling(12,"Yellow");
		Bed bed=new Bed("modern",4,8,2,2);
		Lamp lamp=new Lamp("classic", false,50);
		
		
		BedRoom bedroom=new BedRoom("my room", wall1, wall2,wall3,wall4, ceiling, bed,lamp);
		bedroom.makeBed();
		bedroom.getLamp().turnOn();
		

	}

}
