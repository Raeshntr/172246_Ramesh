package com.java8;


import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ConvertKey_Value 
{
	public static void main(String args[])
	{
		Map<String, Integer>  map = new HashMap<String, Integer>();
		map.put("ramesh",1);
		map.put("naidu",2);
		map.put("praveen",3);
		map.put("kumar",4);
		Set<Entry<String,Integer>> entrySet=map.entrySet();
		for(Entry<String,Integer> entry : entrySet)
		{
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		
		
	}
}
