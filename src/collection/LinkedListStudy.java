package collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListStudy {

	public static void main(String[] args) {
		LinkedList ll=new LinkedList();
		ll.add("sudarshan");
		ll.add("MAY_21");
		ll.add('A');
		ll.add(170);
		ll.add(null);
		ll.add(null);
		ll.add("sudarshan");
		ll.add(12.14f);

		System.out.println(ll);
		System.out.println(ll.size());
		System.out.println(ll.isEmpty());
		System.out.println(ll.indexOf("sudarshan"));
		System.out.println(ll.lastIndexOf("sudarshan"));
		ll.add(123);
		System.out.println(ll);
		System.out.println(ll.get(4));
		System.out.println(ll.indexOf(null));
		System.out.println(ll.lastIndexOf(null));
		System.out.println(ll.peek());
		System.out.println(ll);
		System.out.println(ll.poll());
		System.out.println(ll);
		System.out.println(ll.pop());
		System.out.println(ll);
		
		Iterator it = ll.iterator();
		while(it.hasNext())
		{System.out.println(it.next());
		
	}
		for(int i=0;i<=ll.size()-1;i++)
			
		{
			System.out.println(ll.get(i));		}
	
	for(Object f:ll)
	{
		System.out.println(f);
		
	}
	ListIterator li = ll.listIterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
	
}}
