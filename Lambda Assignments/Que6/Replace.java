package com.java8;

import java.util.ArrayList;

public class Replace {
	public static void main(String args[])
	{
		ArrayList<String> List=new ArrayList<String>();
		List.add("ramesh");
		List.add("naidu");
		List.add("praveen");
		List.add("kumar");
		List.replaceAll(n->(n.toUpperCase()));
		
		for(String s: List)
		{
			System.out.println(s);
		}
		
	}
}
