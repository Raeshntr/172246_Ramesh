package com.cg.dto;

public class Account {
	String id;
	String name;
	int balance=0;
	
	public Account(String id, String name, int balance) {
		super();
		this.id = id;
		this.name = name;
		this.balance = balance;
		System.out.println("ID: "+id);
		System.out.println("Name: "+name);
		System.out.println("Balance: "+balance);
	}
	
	
	public Account() {
		
	}


	public Account(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}


	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBalance() {
		return this.balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public int credit(int amount) 
	{
		
		balance=amount+balance;
		System.out.println("Credited Amount= "+amount);
		System.out.println("After credited the Current Balance= "+balance);
		return balance;
	}

	public int debit(int amount) {
		if (amount <= balance)
		{
			balance -= amount;
			System.out.println("Debited Amount= "+amount);
			System.out.println("After debited, the Current balance= " +balance);
		}
		else {
			System.out.println("Amount exceeded balance");
		}
		return balance;
	
	}
	public int transferTo(int accountno,int amount) {
			if (amount <= balance) 
			{
				balance -= amount; 
				System.out.println("Transfer the amount= "+amount + " " + "to this Account: "+accountno);
				System.out.println("Current balance= "+balance);
			}
			else {
				System.out.println("Amount Exceeded");
			}
			return balance;
	}


	@Override
	public String toString() {
		return "Accoount [id=" + id + ", name=" + name + ", balance=" + balance + "]";
	}
	
		
}