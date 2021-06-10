package com.practice.variables;

public class Test {

	public static void main(String[]args)
	{
		int mynumber =10+20;
		int myfirst=30;
		int mysecond=40;
		
		System.out.println(mynumber);
		System.out.println(myfirst+mysecond);
		
		byte Myminvalue =Byte.MIN_VALUE;
		byte Mymaxvalue = Byte.MAX_VALUE;
		
		System.out.println(Myminvalue);
		System.out.println(Mymaxvalue);
		
		long Mylongminvalue =Long.MIN_VALUE;
		long Mylongmaxvalue=Long.MAX_VALUE;
		
		System.out.println(Mylongminvalue);
		System.out.println(Mylongmaxvalue);
		
		char mychar='D';
		System.out.println(mychar);
		char mycharunicode='\u0044';
		System.out.println(mycharunicode);
		
		boolean isAlian = false;
		if(isAlian == false) {
			System.out.println("i am not alian !");
			System.out.println("i am alian ");
		}
		
		int topscore=80;
		if (topscore == 50)
		{
			System.out.println("you get the highest score");
		}
		
		int secondtopscore=81;
		if((topscore>secondtopscore) && (topscore <100))
		{
			System.out.println("you get the highest score and less than 100");
		}
		
		int topthirdscore=70;
		if((topthirdscore >=secondtopscore)||(secondtopscore >=topscore))
		{
			System.out.println("you get the highest score ");
		}
		
		int newValue=50;
		if(newValue==50)
		{
			System.out.println("you get the value 50");
		}
		int newValues=100;
		if(newValues==100)
		{
			System.out.println("you get the score");
		}
		boolean isCar=false;
		if(isCar=true)
		{
			System.out.println("This is not going to happen");
		}
		
	}
}
