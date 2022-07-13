package assignment;

public class Reverse_string {

	public static void main(String[] args) {
		String name1="Sham Sohani";
		String name2="";
		//Length method use
		System.out.println(name1.length());
		int stringlength=name1.length();
		for(int i=stringlength-1;i>=0;i--)
		
		{
			name2=name2+name1.charAt(i); //charAt method use 
		}
		System.out.println(name2);

	}

}
