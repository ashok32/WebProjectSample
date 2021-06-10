package com.barkingDog;

public class BarkingDog {

	
	
	public static boolean shouldWakeUp(boolean barking, int hourOfDay)
	{
		
		if(hourOfDay<= 24 && hourOfDay >= 0)
		{
			if(hourOfDay > 22 || hourOfDay < 8)
			{
				if (barking == true)
					return true;
			}
		}
		return false;
	}
}
