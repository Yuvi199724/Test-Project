package javaconceptoftheday;

public class LongStringNonRepSentence {

	public static void main(String[] args) {
		String Word = "Write a function of find the first non Repeating Character and return its Index";
		
		System.out.println(Word);
		
		String withoutspaces = Word.replaceAll(" ","");
		
		System.out.println(withoutspaces);
		
	

	}

}
