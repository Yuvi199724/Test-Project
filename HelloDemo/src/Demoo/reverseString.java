package Demoo;

public class reverseString {

	public static void main(String[] args)
	{
		String str = "Naman";
		String str1 = "";
		
		for(int i = str.length()-1; i>=0; i--)
		{
			str1 += str.charAt(i);
		}
		System.out.println(str1);
		
//		String input = "hello";
//		String reversed = "";
//		for (int i = input.length() - 1; i >= 0; i--) {
//		    reversed += input.charAt(i);
//		}
//		System.out.println(reversed);
		
		if(str.equalsIgnoreCase(str1))
		{
			System.out.println("  "+"This is pal");
		}
		else
		{
			System.out.println("This is not pal");
		}

	}

}
