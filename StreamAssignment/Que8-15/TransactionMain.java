package StreamAssignment;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TransactionMain {

	public static void main(String[] args) {
		List<Trader> list = new ArrayList<>();
		list.add(new Trader("ramesh","vizag"));
		list.add(new Trader("jairam","hyderabad"));
		list.add(new Trader("mallik","delhi"));
		list.add(new Trader("dilli","Kolkata"));
		list.add(new Trader("naidu","Pune"));
		list.add(new Trader("praveen","Pune"));
		list.add(new Trader("satya","Indore"));
		
		List<String> list2 =list.stream()
				.map(Trader::getCity)
				.distinct()
				.collect(Collectors.toList());
		list2.forEach(System.out::println);
		System.out.println("----------------------assign 9");
		List<Trader> list3 =list.stream()
				.filter(p -> p.getCity().equals("Pune"))
				.sorted(Comparator.comparing(Trader::getName))
				.collect(Collectors.toList());
		list3.forEach(System.out::println);
		System.out.println("----------------assign10");
		
		List<Trader> list4 =list.stream()
				.sorted(Comparator.comparing(Trader::getName))
				.collect(Collectors.toList());
		String s=list4.stream()
				.map(Trader::getName)
				.collect(Collectors.joining(","));
		System.out.println(s);
		System.out.println("--------asign11");
		List<String> list5 =list.stream()
				.filter(p -> p.getCity()=="Indore")
				.map(Trader::getName)
				.collect(Collectors.toList());
		list5.forEach(System.out::println);
		System.out.println("----------------assign12");
				
				
				
	}	

	}
