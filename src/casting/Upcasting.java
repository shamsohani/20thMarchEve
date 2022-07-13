package casting;

public class Upcasting {

	public static void main(String[] args)
	{
		Father f=new Father();
		Son s=new Son();
		f.car();
		f.bike();
		s.car();
		s.bike();
		s.education();
		Father f1=new Son();
		System.out.println("========");
		f1.bike();
		f1.car();
		System.out.println("========");
		Son s1=(Son) new Father();
		s1.bike();
		//hi this is my 3rd comment
		
		
	}

}
