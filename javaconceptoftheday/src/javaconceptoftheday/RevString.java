package javaconceptoftheday;

public class RevString {

	public static void main(String[] args) {
		
		
		String str1 = "Naman";
		String str2 ="";
		
		for(int i=str1.length()-1;i>=0;i--)
		{
			str2 += str1.charAt(i);
		}
		
		System.out.println(str2);
		
		if(str1.equalsIgnoreCase(str2))
		{
			System.out.println("Both are same");
		}
		else
		{
			System.out.println("Both are not  same");
		}
	}

}
