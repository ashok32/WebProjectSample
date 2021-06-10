package com.bankaccount;

public class Main {

	public static void main(String[] args) {
		
		
		BankAccount myaccount=new BankAccount();
		
		myaccount.setAccountNo(3456789);
		myaccount.setBalance(35000.45);
		myaccount.setCustomerName("Rama");
		myaccount.setEmail("rama@krishna.com");
		myaccount.setPhone(987654321);
		
		System.out.println("My account number is =" + myaccount.getAccountNo());
		System.out.println("My balance is = " + myaccount.getBalance());
		System.out.println("customer name is = " + myaccount.getCustomerName());
		System.out.println("email is = " + myaccount.getEmail());
		System.out.println("phone number is = " + myaccount.getPhone());
		
		
		myaccount.depositFunds(10000.50);
		myaccount.withdrawFunds(5000.0);
	}

}
