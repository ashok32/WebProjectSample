package com.flow.statements;

public class Main {

	public static void main(String[] args) {
		

//	int value=200;
//	
//	if (value ==10)
//	{
//		System.out.println(" value was 10");
//	}
//	else if(value ==20)
//	{
//		System.out.println(" value was 20");
//	}
//	else
//	{
//		System.out.println(" value was not 10 or 20");
//	}
	
	int switchValue=3 ;
	switch(switchValue) 
	{
	case 1:
		System.out.println(" value was 1");
	break;
	case 2:
		System.out.println(" value was 2");
	break; 
	case 3: case 4: case 5:
		System.out.println(" value was 3 or 4 or 5");
		
	default:
		System.out.println(" value was 4");
	}
	
	}

}
