package com.accessmodifiers;

import java.util.ArrayList;

public class Account {
	
	public String accountName;
	public int balance;
	public ArrayList<Integer> transactions;
	
	Account(String accountName)
	{
		this.accountName=accountName;
		this.transactions=new ArrayList<Integer>();
	}
	
	public int getBalance()
	{
		return balance;
	}
	public void deposit(int amount)
	{
		if (amount>0)
		{
			transactions.add(amount);
			balance +=amount;
			System.out.println(amount + " deposited. balance is now  " + this.balance);
		}
			else
			{
				System.out.println("can not deposit negative sums");
			}
		}
	public void withdrawal(int amount)
	{
		int withdrawal =-amount;
		if(withdrawal<0)
		{
			this.transactions.add(withdrawal);
			this.balance+=withdrawal;
			System.out.println();
		}
	}
		
	
	
	

}
