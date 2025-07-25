package Demoo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Saxena_Sxen {

	public static void main(String[] args) {
		String Str = new String("Saxena");
		char[] chars = Str.toCharArray();

		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (Character c : chars) {
			if (map.containsKey(c))
				map.put(c, map.get(c) + 1);
			else
				map.put(c, 1);
		}

		for (Map.Entry<Character, Integer> me : map.entrySet()) {
			if (me.getValue() < 2) {
				System.out.print(me.getKey());
			}

		}
	}
}
