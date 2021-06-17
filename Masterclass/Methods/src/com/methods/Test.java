package com.methods;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean gameOver=true;
		int score=10000;
		int levelCompleted=8;
		int bonus=200;
		// Assigning CalculateScore method to highscore
		int highScore = calculateScore(gameOver,score,levelCompleted,bonus);
		System.out.println(" My final high score was = " + highScore);
		
		
		
	}
	
	public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus)
	{
		
		
		if(gameOver==true)
		{
			int finalScore;
			finalScore=score+(levelCompleted*bonus);
			finalScore+=2000;
			System.out.println(" My final score was = " + finalScore);
			return finalScore;
		}
		else if(score<5000)
		{
			int totalScore;
			totalScore=score+(levelCompleted+bonus);
			System.out.println("my TotalFinal score was = " + totalScore);
		}
		else
		{
			System.out.println("got here");
		}
		return -1;
		
		
	}

}
