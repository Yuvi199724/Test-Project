package ApI;

public class programing {

	public static void main(String[] args) {

		String str1 = "Yuvraj Saxena";
		String str2 = "";

		System.out.println(str1);

		for (int i = str1.length() - 1; i >= 0; i--)
		{
			str2 += str1.charAt(i);
		}
		System.out.println(str2);

	}

}
