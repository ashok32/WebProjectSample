package com.bankaccount;

public class BankAccount {
	
	private int accountNo;
	private double balance;
	private String customerName;
	private String email;
	private int phone;
	
	
	public void setAccountNo(int accountNo)
	{
		this.accountNo=accountNo;
	}
	public void setBalance(double balance)
	{
		this.balance=balance;
	}
	public void setCustomerName(String custormeName)
	{
		this.customerName=customerName;
	}
	public void setEmail(String email)
	{
		this.email=email;
	}
	public void setPhone(int phone)
	{
		this.phone=phone;
	}
	public int getAccountNo()
	{
		return accountNo;
	}
	public double getBalance()
	{
		return balance;
	}
	public String getCustomerName()
	{
		return customerName;
	}
	public String getEmail()
	{
		return email;
	}
	public int getPhone()
	{
		return phone;
	}
	public void depositFunds(double depositAmount)
	{
		this.balance+=depositAmount;
		System.out.println("deposit of " + depositAmount + " made new balance is this " + this.balance);
	}
	
	public void withdrawFunds(double withdrawalAmount)
	{
		if(balance -withdrawalAmount<=0)
		{
			System.out.println("only " + this.balance +" availble");
		}else
		{
			this.balance -= withdrawalAmount;
			System.out.println("withdrawal amount " + withdrawalAmount + " processed remaining amount " + this.balance);
	}
}
}
