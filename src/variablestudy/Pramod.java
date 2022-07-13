package variablestudy;

public class Pramod {

	public static void main (String[] args)
	{  
		int[] a= {38,52,9,6,62,13,100};
		int temp;
		for(int i=0;i<a.length;i++)
		{      
			 
			 for(int j=i+1;j<a.length;j++)
			 {
				 if( a[i]<a[j]) {
					 
					 temp=a[i];
					 a[i]=a[j];
					 a[j]=temp;
				 }
				
			 }
			 
		}
		System.out.println("second minimum no is  " +a[1]);
	
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
			
		
			
	}

}

