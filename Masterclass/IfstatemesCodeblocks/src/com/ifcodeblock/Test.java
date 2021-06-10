package com.ifcodeblock;

public class Test {
	
	public static void main(String[]args)
	{
		
		boolean gameOver=true;
		int myScore=5000;
		int myLevel=5;
		int bonus=100;
		
		if(myScore>6000)
		{
			System.out.println("Got the game");
		}
		else
		{
			System.out.println("not the game");
		}
		
//		if(myScore>4000 && bonus<50)
//		{
//			System.out.println("Myscore is greater than 6000 and bouns less than 500");
//		}
//		else if(myScore<5000 || myLevel==6)
//		{
//			System.out.println("Myscore is greater than or equal to 5000 and myLevel =5");
//		}
//		else
//		{
//			System.out.println("Got here");
//		}
		if(gameOver==true)
		{
			int finalScore=5000+(myLevel * bonus);
			System.out.println(finalScore);
		}
		
	}

}
