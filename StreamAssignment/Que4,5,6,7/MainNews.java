package StreamAssignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
 

public class MainNews 
{
	public static void main(String args[])
	{
		List <News> al=new ArrayList<News>();
		al.add(new News(11,"naidu","ramesh","budget"));
		al.add(new News(12,"praveen","bob","bullet"));
		al.add(new News(13,"kumar","son","budget"));
		al.add(new News(14,"satya","sahi","politics"));
		al.add(new News(15,"jairam","rames","budget"));
		List<News> li1=  al.stream()
				.filter(p->p.getComment().contains("budget"))
				.collect(Collectors.toList());
		long i=li1.stream().count();
		System.out.println(i);
		Map<Object, Long> map = al.stream().collect(Collectors.groupingBy(News::getNewsid, Collectors.counting()));

		System.out.println(map);

		long maxval=(Collections.max(map.values()));

		System.out.println(maxval);

		for(java.util.Map.Entry<Object, Long> entry:map.entrySet()) {

		if(entry.getValue()==maxval) {

		System.out.println(entry.getKey());
		 System.out.println("Assignment 6----------------------------------------------");
		    Map<Object, Long> map2 = al.stream().collect(Collectors.groupingBy(News::getPostedByUser, Collectors.counting()));
		    long maxval2=(Collections.max(map2.values()));
		    for(java.util.Map.Entry<Object, Long> entry1:map2.entrySet()) {
		    	if(entry1.getValue()==maxval2) {
		    		System.out.println(entry1.getKey());
		    	}
		    }
		    System.out.println("Assignment 7----------------------------------------------");
		    Map<Object, Long> map3 = al.stream().collect(Collectors.groupingBy(News::getCommentByUser, Collectors.counting()));
		    System.out.println(map3);

		}
				
		}
		}			
			
		
}
	
