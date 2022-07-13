package interface_study;

public interface Father
{
	void love();
	void nature();
	default void money()
	{
		System.out.println("fathers money");
	}

}
