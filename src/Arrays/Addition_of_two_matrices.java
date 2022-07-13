package Arrays;
//addition of two matrices
public class Addition_of_two_matrices {

	private static int j;
	private static int k;

	public static void main(String[] args) 
	{
		int a[][]= {{4,7,55},{23,8,3}};
		
		int b[][]= {{23,5,2},{7,45,2}};
		
		//creating another matrix to store sum of two mtarie
		int c[][]=new int[2][3];
		
		//adding and printing addition of two matrices
		
		for (int i=0;i<2;i++)
		{
		
		for(int k=0;k<3;k++);
		{
		
		c[i][k]=a[i][k]+b[i][k];
		
		System.out.println(c[i][k]+" ");
		
		}
		System.out.println();//new line

		}}}
	


