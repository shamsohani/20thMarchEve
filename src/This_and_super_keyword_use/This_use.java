package This_and_super_keyword_use;

public class This_use {
	
	int a=100;//non static global variable
    int b=600;
    static int c=10;//static global variable
	public static void main(String[] args)
	
	{
		This_use t=new This_use();
		t.addition();
		

	}
	
	public  void addition()
	{
	int a=10; //local variable
//we cant create static variable with in same name in same class
	int sum=a+900;//a value preffered as local value 10
	System.out.println("addition of a is "+sum);
	
	int sum1=this.a=900;//calling global value using this keyword
	System.out.println("addition of a is "+sum1);
	System.out.println("local value of a is "+a);
	System.out.println("global value of a is "+this.a);
	
	}

}
