package com.java8;

import java.util.ArrayList;
import java.util.List;

public class FirstLetter 
{
	public static void main(String args[])
	{
		List<String> array=new ArrayList<String>();
		array.add("rameh");
		array.add("naidu");
		array.add("praveen");
		array.add("kumar");
		System.out.println("Names" +array);
		String result =array.stream().map(i->Character.toString(i.charAt(0))).reduce(" ", (a,b) -> a+b);
		System.out.println(result);
		}
}
