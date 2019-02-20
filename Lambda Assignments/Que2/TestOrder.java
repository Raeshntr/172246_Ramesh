package com.java8;

public class TestOrder {
	
	public static void main(String args[])
	{
		double amount = 9000;
		Order o=(a)->
				{
			if(amount>10000)
				System.out.println("Accepted");
			else
				System.out.println("not accepted");
			
		};
		o.show(amount);
	}

}
