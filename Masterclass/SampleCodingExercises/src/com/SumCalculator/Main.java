package com.SumCalculator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SimpleCalculator Calculate=new SimpleCalculator();

		Calculate.setFirstNumber(15.15);
		System.out.println("FirstNumber value is = " + Calculate.getFirstNumber());
		
		Calculate.setSecondNumber(20);
		System.out.println("SecondNumber value is =" + Calculate.getSecondNumber());
		
		System.out.println("Additional result is =" + Calculate.getAdditionResult());
		System.out.println("Subtraction result is =" + Calculate.getSubtractionResult());
		System.out.println("Multiplication result is =" + Calculate.getMultiplicationReult());
		System.out.println("Division result is =" + Calculate.getDivisionResult());
	}

}
