package Demoo;

import java.util.Scanner;

public class palornot {

	public static void main(String[] args) 
{
//  String str ="NamaN";
//  String Str1 ="NamaN";
//  String str2 = new String("NamaN");
//  
////  char [] arr = str.toCharArray();
////  
////  for( int i=arr.length-1;i>=0;i--)
////  {
////	  System.out.print(arr[i]);
////	  Str1 +=  str.charAt(i);
////	 // str1 += str.charAt(i);
////  }
////  if(Str1.equals(str))
////  {
////	  System.out.print("Yes this is pal");
////  }
////  else
////  {
////	  System.out.print("No this is pal");
////  }
//  System.out.println(str.equals(Str1));
//  System.out.println(str==str2);
//  System.out.println(str);
//  String str3 = str.concat(" Saxena").toUpperCase();
//  System.out.print(str3);
//  
  
//
//		Scanner scanner = new Scanner(System.in);
//
//String input = scanner.nextLine();
//
//char ch;
//
//String nstr = "";
//
//for (int i = 0; i < input.length(); i++) 
//{
//ch = input.charAt(i);
//nstr = ch + nstr;
//}
//System.out.println(nstr);
		
		
		
		///////////////////////////////////////////////////////////
		
//		String str1 = "NamaN";
//		
//		String str2 =  "";
//		
//		char[] chr1 = str1.toCharArray();
//		
//		for(int i=chr1.length-1;i>=0;i--)
//			
//			
//		{  str2 +=chr1[i];
//			 System.out.print(chr1[i]);
//		}
//		
//		
//		if(str2.equals(str1))
//		{
//			 System.out.print( "    "+"Yes is Pal");
//		}
//		else
//		{
//			 System.out.print( "    "+"This is not pal");
//		}
//		
//		
//		
		
		
//		String str1 = "NamaN";
//		String str2 = "NamaN";
//		
//		StringBuilder reversed = new StringBuilder(str1).reverse();
//		
//		StringBuffer sb = new StringBuffer(str2).reverse();
//		
//		if (reversed.toString().equals(str1))
//		{
//		    System.out.println("Yes, it is a Palindrome");
//		} else 
//		{
//		    System.out.println("This is not a Palindrome");
//		}
//		
//		if (sb.toString().equals(str2))
//		{
//		    System.out.println("Yes, it is a Palindrome");
//		} else 
//		{
//		    System.out.println("This is not a Palindrome");
//		}
//		
		
		int arr[] = {1,2,3,4,5,6,7,8,9};
		int min =arr[0];
		int mix =arr[0];
		
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
				
			}
			
                     if(arr[i]>mix)
			{
	                  mix = arr[i];
	  
			}
   
   
		}
		
		System.out.println("min value is "+ min);
		   System.out.println("max value is "+ mix);
				
		

}
	}
