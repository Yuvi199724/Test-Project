package Demoo;

public class minnumarray {

	public static void main(String[] args) 
	{
		int a [] = {1,2,3,4,5,6,7,89,7};
		int min =a[0];
		int max = a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
			if(a[i]>max)
			
			{
				max=a[i];
			}
			}
		

System.out.println("min value is " + min);
System.out.println("max value is " + max);
}}
