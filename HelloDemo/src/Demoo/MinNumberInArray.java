package Demoo;

public class MinNumberInArray 
{

	public static void main(String[] args) 
	{
		int a [][] = {{2,4,5},{0,4,5},{1,2,9}};
		int min =a[0][0];  
		int max =a[0][0];
		for(int i=0;i<a.length;i++)
		{ 
			for(int j=0;j<a[i].length;j++)
			
			{
				if(a[i][j]<min)
				{ 
					min=a[i][j];
					}
				if(a[i][j]>max)
				{ 
					max=a[i][j]; 
					}
			   }}
		System.out.println("min value is " + min);
		System.out.println("max value is " + max);
	}}