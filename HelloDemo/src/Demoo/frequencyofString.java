package Demoo;

import java.util.HashMap;
import java.util.Map;

public class frequencyofString {

	public static void main(String[] args) 
	{
		
		        String text = "Yuvraj saxena naman saxena ";
		        
		        String[] words = text.split(" "); 
		 
		        Map<String, Integer> wordFrequency = new HashMap<>();

		        for (String word : words) 
		        {
		            wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
		        }

		        System.out.println("Word Frequencies:");
		        for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) 
		        {
		            System.out.println(entry.getKey() + " -> " + entry.getValue());
		        }

	}

}
