package javaconceptoftheday;

public class revIntfrom123To321 {

	public static void main(String[] args) {
		int a= 12345;
		
		
		String str1 = Integer.toString(a);
		
		String str2 = "";
		
		for(int i = str1.length()-1;i>=0;i--)
		{
			str2 += str1.charAt(i);
		}
		
		int str3 = Integer.parseInt(str2);
		
		System.out.print(str3);

	}

}
