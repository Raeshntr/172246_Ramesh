package com.java8;

import java.util.ArrayList;


public class NumbersFromList {

		public static void main(String args[])
		{
			ArrayList<Integer> array=new ArrayList<Integer>();
			array.add(1);
			array.add(2);
			array.add(3);
			array.add(4);
			Runnable r= ()->{array.stream().forEach(System.out::println);
			
			};
			new Thread(r).run();
		}
}
