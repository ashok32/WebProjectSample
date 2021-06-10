package com.methods.case1;

public class Game {

	public static void main(String[] args) {
		
//		boolean gameOver=true;
//		int playerScore=1000;
//		int levelCompleted=5;
//		int bonus=200;
		
		int position1= calculateHighScorePosition(1500);
		displayHighScorePosition("Ram", position1);
		
		position1=calculateHighScorePosition(900);
		displayHighScorePosition("Krishna", position1);
		
		position1=calculateHighScorePosition(400);
		displayHighScorePosition("hari", position1);
		
		position1=calculateHighScorePosition(50);
		displayHighScorePosition("madhu", position1);
		
		position1 =calculateHighScorePosition(500);
		displayHighScorePosition("ramarama", position1);
	}
	
	public static void displayHighScorePosition(String playerName, int position)
	{
		System.out.println(playerName + " Managed to get into the position " + position + " on the highscore table");
	}
	
	public static int calculateHighScorePosition(int playerScore)
	{
//		if(playerScore >=1000)
//		{
//			return 1;
//		}
//		else if(playerScore >=500 && playerScore<1000)
//		{
//			return 2;
//		}
//		else if(playerScore >100 && playerScore<500)
//		{
//			return 3;
//		}
//		else
//		{
//			return 4;
//		}
		
		int position=4;
		if(playerScore>=1000)
		{
			position=1;
		}
		else if(playerScore >=500)
		{
			position=2;
		}
		else if(playerScore >=100)
		{
			position=3;
		}
		return position;
	}
	
}


