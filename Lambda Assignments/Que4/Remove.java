package com.java8;

import java.util.ArrayList;

public class Remove 
{
	public static void main(String args[])
	{
		ArrayList<String> List=new ArrayList<String>();
		List.add("ramesh");
		List.add("naidu");
		List.add("praveen");
		List.add("kumar");
		List.removeIf(n->(n.length()%2!=0));
		
		for(String s: List)
		{
			System.out.println(s);
		}
		
	}
}
