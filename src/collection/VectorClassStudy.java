package collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorClassStudy {

	public static void main(String[] args) 
	{
		Vector v=new Vector();
		v.add("shyam");
		v.add(null);
		v.add("shyam");
		v.add(null);
		v.add(123);
		v.add(12.13f);
		v.add('a');
		System.out.println(v);
		System.out.println(v.size());
		System.out.println(v.isEmpty());
		System.out.println(v);
		System.out.println(v.capacity());
	    System.out.println(v.indexOf(123));
        System.out.println(v.lastIndexOf(123));
        System.out.println(v.contains("shyam"));
        v.add(12345);
        System.out.println(v);
        v.add(3, "waluj");
        System.out.println(v);
        v.remove(null);
        System.out.println(v);
        System.out.println(v.get(3));
     System.out.println("================================");   
        //for loop
        //for each
        //iterator
        //list iterator
        //enumeration
        
        Iterator it = v.iterator();
        while(it.hasNext())
        {
        	System.out.println(it.next());
        }
            
        for(int i=0;i<=v.size()-1;i++)
         {
        	System.out.println(v.get(i));
         }
        System.out.println("=======================");
        for(Object c:v)
        {System.out.println(c);
        
        }
        System.out.println("====================");
        ListIterator ll = v.listIterator();
        while(ll.hasNext())
        {
        	System.out.println(ll.next());
        }
        System.out.println("======================");
        Enumeration en = v.elements();
        while(en.hasMoreElements())
        {
        	System.out.println(en.nextElement());
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
	}

}
