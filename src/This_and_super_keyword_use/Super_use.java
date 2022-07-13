package This_and_super_keyword_use;

public class Super_use extends This_use
{
	int a=500;//non static global variable from same class

	public static void main(String[] args) 
	{
	Super_use su=new Super_use();
	su.sub();
			

	}

	public void sub()
	{
		
		int a=800;
		int sub=a-70;//using local variable
		System.out.println("substraction of a is "+sub);
	    int sub1=this.a-70;//using global value of same class
	    System.out.println("substraction of a is "+sub1);
	    int sub2=super.a-70;//using global value from super class
	    System.out.println("sub of a is "+sub2);
	    System.out.println("local value of a is "+a);
		System.out.println("global value of a is "+this.a);
	
	}
	
}
