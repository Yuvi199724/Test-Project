package javaconceptoftheday;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class check 
{
	public static void main(String[] args) 
	{

		Integer[] arr = {4, 2, 2, 3, 4, 5, 1, 4};
		Map<Integer, Long> freq = Arrays.stream(arr)
		    .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		System.out.println(freq);
		// Example: {1=1, 2=2, 3=1, 4=3, 5=1}

	}}

