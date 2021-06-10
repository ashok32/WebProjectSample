package com.ifstatements;

public class Test {

	public static void main(String[] args) {
		
		Boolean gameOver=true;
		
		int score=10000;
		int levelcompleted=8;
		int bonus=200;
		
		if(gameOver==true)
		{
			int secondscore=score+(levelcompleted*bonus);
			System.out.println("your final score was "+ secondscore);
		}else if(score>10000)
		{
			System.out.println("My score is greater than 1000");		
		}
		else
		{
			System.out.println("Game is over");
		}

	}

}
