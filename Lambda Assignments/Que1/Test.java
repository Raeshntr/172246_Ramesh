package com.java8;

public class Test {
	public static void main(String args[])
	{
		int x=5;
		int y=10;
		Calculation c=(a,b) ->{
			System.out.println(a+b);
			System.out.println(a-b);
			System.out.println(a*b);
		};
		c.calculate(x, y);
	}
	


}
