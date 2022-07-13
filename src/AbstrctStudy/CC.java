package AbstrctStudy;

public class CC extends AbstractDemo{

	public static void main(String[] args) {
		CC c=new CC();
		c.test1();
		c.test2();
		c.test3();
		c.test4();
		c.test5();

	}
	public void test4()
	{
		System.out.println("HI THIS METHOD COMPLETED IN CONCRETE CLASS");
	}
	
	public void test5()
	{
		System.out.println("HI I AM TEST 5 OF OWN METHOD OF CONCRETE CLASS");
	}
}
