package interface_study;

public interface Mother
{
    void receipe();
    void care();
    default void money()
    {
		System.out.println("mothers money");
	}

}
