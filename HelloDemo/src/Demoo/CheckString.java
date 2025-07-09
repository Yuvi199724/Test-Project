package Demoo;

public class CheckString {

	public static void main(String[] args) {

 String str1 ="She is Mother My";
 
 String str2 = "my";
 
 boolean found = false;
 
 String[] strnew =str1.split(" ");
 
 for(int i=0;i<=strnew.length-1;i++)
 {
	 
	 if(strnew[i].equalsIgnoreCase(str2))
	 {
		 System.out.println( str2 +"  "+ "Str2 is present:"+"  "+ (i+1)+ "place");
		 break;
	 }
 }
 
 if(!found)
 {
	 System.out.println("not found");
 }
 
	
	}}


