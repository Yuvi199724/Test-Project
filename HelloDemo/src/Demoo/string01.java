package Demoo;

import java.util.Arrays;
import java.util.HashMap;

public class string01
{

	 static void arrayElementCount(int inputArray[]) {
   HashMap<Integer, Integer> elementCountMap = new HashMap<Integer, Integer>();
	for (int i : inputArray) 
	        {if(elementCountMap.containsKey(i))
	            { elementCountMap.put(i, elementCountMap.get(i)+1);}
	            else
	            {   elementCountMap.put(i, 1); } }
	      System.out.println("Input Array : "+Arrays.toString(inputArray));
	      System.out.println("Element Count : "+elementCountMap);}
	   
	    public static void main(String[] args) 
	    { arrayElementCount(new int[]{4, 5, 4, 5, 4, 6});}}
	         
	  
