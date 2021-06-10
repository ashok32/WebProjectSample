package com.carmodels;

public class Car {

	
	private int doors;
	private int windows;
	private String model;
	private String engine;
	private String colour;
	
	public void setModel(String model)
	{
		this.model=model;
	}
	
	public String getModel()
	{
		return this.model;
	}
	
	public void setColour(String colour)
	{
		this.colour=colour;
	}
	public String getClour()
	{
		return this.colour;
	}
	
	public void setDoors(int doors)
	{
		this.doors=doors;
	}
	
	public int getDoors()
	{
		return this.doors;
	}
	
	public void setWinodws(int windows)
	{
		this.windows=windows;
	}
	public int getWinodws() 
	{
		return this.windows;
	}
}
