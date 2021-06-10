package com.megabyteConverter;

public class MegabyteConverter {

	
	
	public static void printMegaBytesandKiloBytes(int kiloBytes)
	{
		if(kiloBytes>=0)
		{
			int megaBytes =kiloBytes/1024;
			int remKB=kiloBytes%1024;
			
			System.out.println(kiloBytes +" KB " + megaBytes +" MB and " + remKB + " KB");
		}
		else
		{
			System.out.println("invalid value");
		}
	
	}
}
