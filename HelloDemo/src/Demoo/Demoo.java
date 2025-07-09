package Demoo;

public class Demoo
{
	
	public void reverse()
	{
		String str = "Yuvraj";
		char[] arr = str.toCharArray();
		
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.println(arr[i]);
		}
		
	}
	
	public void add()
	{
		 int a=5;
		  int b=10;
		  int c=0;
		  
		  c=a+b;
		  System.out.print(c);
	}
	

	public static void main(String[] args) 
	{
		 int a =55;
	   Demoo dem = new Demoo();
	   //dem.reverse();
	   System.out.println(" ");
	   System.out.println(a);
	   dem.add();
	}

}
