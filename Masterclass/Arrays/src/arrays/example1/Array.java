package arrays.example1;

import java.util.Arrays;

public class Array {

	
	//difference between references and values
	
	public static void main(String[] args) {
		
		int myIntvalue=10;
		
		int anotherIntvalue=myIntvalue;
		
		System.out.println("My int value =" + myIntvalue);
		System.out.println("My another int  value is = " + anotherIntvalue);
		
		anotherIntvalue++;
		
		System.out.println("My int value =" + myIntvalue);
		System.out.println("My another int  value is = " + anotherIntvalue);

		int [] myIntArray=new int[5];
		
		int [] anotherArray=myIntArray;
		
		System.out.println("my int array =" + Arrays.toString(myIntArray));
		System.out.println("Another int array =" + Arrays.toString(anotherArray));
		
		anotherArray[0]=5;
		
		System.out.println("Afre change int array =" + Arrays.toString(myIntArray));
		System.out.println("After change anotherArray =" + Arrays.toString(anotherArray));
		
		anotherArray= new int[] {4,5,6,7,8};
		
		
		modifyArray(myIntArray);
		System.out.println("Afre modify int array =" + Arrays.toString(myIntArray));
		System.out.println("After modify anotherArray =" + Arrays.toString(anotherArray));
		
		
	}
	
	public static void modifyArray(int [] array )
	{
		array[0]=2;
	}

}
