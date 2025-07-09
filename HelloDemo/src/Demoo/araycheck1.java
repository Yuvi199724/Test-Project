package Demoo;

import java.util.ArrayList;
import java.util.List;

public class araycheck1 {

	public static void main(String[] args) {
		{
	        List<Integer> arr1 = List.of(1, 2, 3, 4, 5, 5, 5);
	        List<Integer> arr2 = List.of(1, 2, 2, 4, 5, 6, 7, 2, 4, 6);
	        
	        
	        List<Integer> arr3 = new ArrayList<>();
	        
	        int minSize = Math.min(arr1.size(), arr2.size());
	        
	        for (int i = 0; i < minSize; i++) {
	            arr3.add(arr1.get(i) * arr2.get(i));
	        }
	        
	        if (arr1.size() > arr2.size()) 
	        {
	        	
	            arr3.addAll(arr1.subList(minSize, arr1.size()));
	        } 
	        else if (arr2.size() > arr1.size()) 
	        {
	            arr3.addAll(arr2.subList(minSize, arr2.size()));
	        }
	        System.out.println(arr3);
		 }
		}
	}


