package Demoo;

public class ArraysDemo 
{
	
	public void array()
	{
		int a[] = new int[5];
	      
	      
	      a [0] =1;
	      a [1] =2;
	      a [2] =3;
	      a [3] =4;
	      a [4] =5;
	      
	      for(int i=0;i<a.length;i++)
	      {
	    	  System.out.println(a[i]);
	      }
	}
	
///////////////////////////////////////////////////////////////////	
	      
	  public void printString()
	      {
	    	  String b[]= new String[10];
	    	  b[0] ="YUvraj";
	          b[1] ="YUvraj";
	          b[2] ="YUvraj";
	          b[3] ="YUvraj";
	          b[4] ="YUvraj";
	          b[5] ="YUvraj";
	          b[6] ="YUvraj";
	          b[7] ="YUvraj";
	          b[8] ="YUvraj";
	          b[9] ="YUvraj";
	          
	 
	         for(int j=0;j<b.length;j++)
	         {
	       	  System.out.println(b[j]);  
	         }
	    	  
	      }
	  
	  ////////////////////////////////////////////////////////////////////////////////////
		
	  public void first()
	  {
		  int  c [] = {9,8,7,6,5,4,3,2,1};
		  
		 for(int z=0;z<=c.length;z++)
		 {
			 
			 System.out.println(c[z]+ " ");
		 }
		
		  
	  }
	  
	  //////////////////////////////////////////////////////////////////////
	  public void foreachloop()
	  {
	  
	  String[] str = {"Yuvraj","Naman","Saxena"};
	  {
	  for(String s:str)
	  {
		  System.out.println(s);
	  }
	  }}
		
		

	public static void main(String[] args) 
	{
		ArraysDemo AD = new ArraysDemo();
				AD.printString();
				AD.array();
				AD.first();
				AD.foreachloop();
				

	}

}
