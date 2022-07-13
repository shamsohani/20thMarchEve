package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UsingListIterator {

	public static void main(String[] args) {
		List ar=new ArrayList();
		ar.add("aurangabad");
		ar.add("mumbai");
		ar.add(123);
		ar.add(null);
		ar.add("mumbai");
		ar.add(null);
		ar.add(12.13f);
		System.out.println(ar);
		System.out.println(ar.size());
		System.out.println(ar.isEmpty());
		System.out.println(ar.indexOf("mumbai"));
	    System.out.println(ar.lastIndexOf("mumbai"));
		System.out.println(ar.contains(null));
		ar.add(23);
		System.out.println(ar);
		ar.add(2, "vijay");
		System.out.println(ar);
		ar.set(4, 'a');
		System.out.println(ar);
		System.out.println("=========================");
		Iterator it = ar.iterator();
		while(it.hasNext())
		{
			
			System.out.println(it.next());
		}
		System.out.println("==================================");
		for(int i=0;i<=ar.size()-1;i++)
		{
		System.out.println(ar.get(i));

	}
		
	System.out.println("======================================");
	for(Object c1:ar)
	{
		System.out.println(c1);
	}
	
	}

}
