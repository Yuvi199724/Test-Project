package Demoo;

public class multibytwo {

	public static void main(String[] args) 
	{
		 int [] arr2  = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
		 
		 for(int i=0; i<arr2.length;i++)
		 {
			 if(arr2[i] % 2==0)
			 {
				 System.out.println(arr2[i]+ "this is multiple by 2");
			 }
			 else
			 {
				 System.out.println(arr2[i] + "this is not multiple by 2");
			 }
		 }

	}

}
