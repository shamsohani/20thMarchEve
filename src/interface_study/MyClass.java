package interface_study;

public class MyClass implements My_interface {

	public static void main(String[] args)
	{
		MyClass m=new MyClass();// created object of implementation class

		m.test();
		m.test1();
		m.MyMethod();
		//a=a=10; we cant update variable from interface
		System.out.println("value of a is "+a);
		
	}

	@Override
	public void test() 
	{
		
		System.out.println("hi this method completed in implementation class");
		
	}

	@Override
	public void test1() 
	{
	
		System.out.println("hi this method 2 completed in implementation class");
		
	}
	
	public void MyMethod()
	{
		
		System.out.println("this is my class method");
		
	}
	

}
