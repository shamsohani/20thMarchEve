package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListSample {

	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		al.add("sudarshan");
		al.add("MAY_21");
		al.add('A');
		al.add(170);
		al.add(null);
		al.add(null);
		al.add("sudarshan");
		al.add(12.14f);
		System.out.println(al);
		System.out.println(al.size());
		System.out.println(al.indexOf("sudarshan"));
		System.out.println(al.lastIndexOf("sudarshan"));
		System.out.println(al);
		System.out.println(al.isEmpty());
		System.out.println(al.contains("sudarshan"));
		System.out.println(al.get(2));
		System.out.println(al.get(1));
		al.add(1, "shyam");
		System.out.println(al);
	System.out.println(al.size());
	al.set(6, 13.13f);
	System.out.println(al);
	
	al.remove(5);
	System.out.println(al);
	
	Iterator it = al.iterator();
	
	while(it.hasNext())
	{
		System.out.println(it.next());	
		
	}
	System.out.println("=================================");
	for(int i=0;i<=al.size()-1;i++)
	{
		
		System.out.println(al.get(i));
	}
	System.out.println("=======================");
	
	for(Object d1:al)
	{
		System.out.println(d1);
	}
	}
	
	
	
		
		
		
	}


