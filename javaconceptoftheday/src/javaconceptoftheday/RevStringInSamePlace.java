package javaconceptoftheday;

public class RevStringInSamePlace {

	public static void main(String[] args) {

		String str = "Yuvraj Saxena";

		String Str1 = "";

		for (int i = str.length() - 1; i >= 0; i--) 
		{
			Str1 += str.charAt(i);
		}

	System.out.println(Str1);

		String[] str3 = Str1.split(" ");
		
		for(int i=0;i<str3.length;i++)
		{
			str3[i] = new StringBuilder(str3[i]).reverse().toString().toLowerCase();
		}
		
		System.out.println(str3);

		System.out.println(str3[1].toLowerCase() + " " + str3[0].toLowerCase());
	}

}
