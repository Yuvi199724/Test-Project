package Demoo;

public class madam {

	public static void main(String[] args)
	
	{
		String str = "Naman";
		
		String str1 = "";
		
		char[] arr = str.toCharArray();
		
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]);
			
			str1 += str.charAt(i);
		}
		
		System.out.println("   ");
		
		if(str.equalsIgnoreCase(str1))
		{
			 System.out.println("This is pal");
		}
		else
		{
			System.out.println("This is not pal");
		
		}
	
	}
}
