package Demoo;

public class stringclassdemoo {

	public static void main(String[] args) 
	{
		
		String aa = new String("Hello");
		String bb = new String("Hello_world_Hi");
		
		System.out.println(bb.charAt(2));
		System.out.println(bb.indexOf("r"));
		System.out.println(bb.substring(3,7));
		bb.concat("india");
		bb.length();
		
		System.out.println(bb.length());
		
		String newbb [] = bb.split("_");
		System.out.println(newbb[0]);
		System.out.println(newbb[1]);
		System.out.println(newbb[2]);
		
		
		

	}
	

}
