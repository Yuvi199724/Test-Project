package Demoo;

public class stringclassdemo 
{

	public static void main(String[] args) 
	{
		String str = "NAMAN";
		  String temp ="";
		
		char[] arr = str.toCharArray();
		
		int a = arr.length;
	
		
		for(int i=arr.length-1;i>=0;i--)
		{
			//System.out.print(arr[i]);
			//System.out.println(str.charAt(i));
			
			temp =temp +str.charAt(i);
//			System.out.println(str.charAt(i));
//			System.out.println(temp);
//			System.out.println(str.equals(temp));
			
		}
		
//		System.out.println(temp);
		//System.out.println(str.charAt(i));
		System.out.println(str.equals(temp));
		
	}

}
