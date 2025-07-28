package javaconceptoftheday;

public class StringLengthAndRemoveSpaces 
{

	public static void main(String[] args) 
	{
		String s1 = "Yuvraj Saxena";
		
		int len =s1.length();
		
		System.out.println(s1.length());
		
		System.out.println(len);
		
		String s2 = s1.replaceAll(" ","");
		System.out.println(s2);
		
		System.out.println(s2.length());
		
		
		

	}

}
