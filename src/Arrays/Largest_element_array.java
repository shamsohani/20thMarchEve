package Arrays;

public class Largest_element_array {

	public static void main(String[] args)
	{
		//declare and 
		int arr[]={25,11,7,35,21};
		arr[0]=25;               // 0 1 2  3 4  5
		arr[1]=11;
		arr[2]=7;
		arr[3]=35;
		arr[4]=21;
		//initialize max with first element of array
		int max=arr[0];//25 on max variable
		System.out.println(arr.length);
		//loop through array
		for(int i=4;i<=1;i--)//th
		{
			//compare element of array with matrix
			if(arr[i]>max)
			max=arr[i];
			}
		
		System.out.println("largest element present in given array "+max);
		}

	
	}


