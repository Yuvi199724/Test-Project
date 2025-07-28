package ApI;

public class programin2 {

	public static void main(String[] args) {

		String str1 = "Yuvraj Saxena";
		String str2 = "";
		String Strnew3 = "";
		String Strnew4 = "";
		System.out.println(str1);

		String[] parts = str1.split(" ");

		for (int i = str1.length() - 1; i >= 0; i--) {
			str2 += str1.charAt(i);
		}
		System.out.println(str2);

		System.out.println(parts[0]);
		System.out.println(parts[1]);

		for (int i = parts[0].length() - 1; i >= 0; i--) {
			 Strnew3 = Strnew3+parts[i];
			System.out.println(Strnew3);
		}

		for (int j = parts[0].length() - 1; j >= 0; j--) {
			 Strnew4 = Strnew4+parts[j];
				System.out.println(Strnew4);
		}

		System.out.println();
	}

}
