package StreamAssignment;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class TransactionMain2 
{
	public static void main(String args[])
	{
		List<Transaction> li = new ArrayList<>();
		li.add(new Transaction(new Trader("ramesh","vizag"),2011,1000));
		li.add(new Transaction(new Trader("jairam","hyderabad"),2014,1057));
		li.add(new Transaction(new Trader("mallik","delhi"),2011,1000));
		li.add(new Transaction(new Trader("dilli","kolkata"),2012,1000));
		li.add(new Transaction(new Trader("naidu","pune"),2013,1000));
		li.add(new Transaction(new Trader("praveen","pune"),2016,1000));
		li.add(new Transaction(new Trader("satya","indore"),2017,1000));
		List<Transaction> li1=li.stream()
				.filter(p -> p.getTrader().getCity()=="delhi")
				.collect(Collectors.toList());
				li1.forEach(e->System.out.println(" assign 13      transaction:"+e.getValue()+ " by " +e.getTrader().getName()));
				Transaction max=li.stream()
						.max((p1,p2)->Integer.compare(p1.getValue(),p2.getValue()))
						.get();
				System.out.println("assignment 14=" + max.getValue());
				Transaction min=li.stream()
						.min((p1,p2)->Integer.compare(p1.getValue(),p2.getValue()))
						.get();
				System.out.println("assignment 15=" + min.getValue());
	}

}
