package ApI;

import java.util.Arrays;

public class prog3 {

	public static int findnumber(int[] a)

	{
		if ((a == null) || a.length < 2)
			Arrays.sort(a);

		int max = a[a.length - 1];

		for (int i = a.length - 2; i >= 0; i--) {
			if (a[i] != max) {
				return a[i];
			}
		}

		return 0;

	}

	public static void main(String[] args) 
	{
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		System.out.print("Secound Highest number  " + findnumber(a));

	}

}
