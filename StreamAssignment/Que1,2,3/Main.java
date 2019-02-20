package StreamAssignment;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		List<Fruit> list = new ArrayList<>();
		list.add(new Fruit("Apple",200,50,"Red"));
		list.add(new Fruit("mango",60,20,"yellow"));
		list.add(new Fruit("pineApple",190,50,"yellow"));
		list.add(new Fruit("watermilon",120,50,"Red"));
		list.add(new Fruit("Orannge",99,50,"Orange"));
		list.add(new Fruit("GreenApple",100,50,"Green"));
		list.add(new Fruit("Grapes",200,50,"Black"));
		
		
		List<String> list2=list.stream()
				.filter(r->r.getCalories()<100)
				.sorted(Comparator.comparing(Fruit::getCalories).reversed())
				.map(Fruit::getName)
				.collect(Collectors.toList());
		list2.forEach(System.out::println);
		System.out.println("-------------");
		List<Fruit> list3=list.stream()
				.sorted(Comparator.comparing(Fruit::getColor))
				.collect(Collectors.toList());
		list3.forEach(e->System.out.println("Fruit is "+e.getName()+" color is"+e.getColor()));
		System.out.println("-------------");
		List<String> list4=list.stream()
				.filter(p->p.getColor()=="Red")
				.sorted(Comparator.comparing(Fruit::getPrice))
				.map(Fruit::getName)
				.collect(Collectors.toList());
		list4.forEach(System.out::println);
		System.out.println("---------------");
			
			
				
				
	}

}
