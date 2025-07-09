package Demoo;

public class HighestNumberArray {

	public static void main(String[] args) 
	
	{
		int[] a = {1,2,3,4,5,6,7,8};
		
		int max = a[0];
		int min =a[0];
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max =a[i];
			}
			
			if(a[i]<min)
			{
				min =a[i];
			}
		}
		System.out.println("Max number is " + max);
		System.out.println("Min number is " +min); 
		
		
		


	}

}
