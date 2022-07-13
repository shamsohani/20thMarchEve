package interface_study;

public class SonClass implements Father,Mother{

	public static void main(String[] args) {
		SonClass s=new SonClass();
		s.care();
		s.love();
		s.nature();
        s.receipe();
        s.money();
	}

	@Override
	public void receipe() {

		System.out.println("mothers receipe completed in sons class");
	}

	@Override
	public void care() {
		
		System.out.println("mothers care completed in sons class");
	}

	@Override
	public void love() {
		System.out.println("fathers love completed in sons class");
		
	}

	@Override
	public void nature() {
		System.out.println("fathers nature completed in sons class");
		
	}

	@Override
	public void money()
	{
		Father.super.money();
		Mother.super.money();
		
	}

}
