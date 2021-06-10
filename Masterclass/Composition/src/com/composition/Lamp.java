package com.composition;

public class Lamp {

	private String style;
	private boolean battery;
	private int globeRating;
	
	public Lamp(String style, Boolean battery, int globeRating)
	{
		this.style=style;
		this.battery=battery;
		this.globeRating=globeRating;
	}
	
	public void turnOn()
	{
		System.out.println(" Lamp --> Turn on");
	}
	public String getStyle() 
	{
	return this.style=style;	
	}
	public boolean getBattery()
	{
		return this.battery=battery;
	}
	public int getglobeRating()
	{
		return this.globeRating=globeRating;
	}
}
