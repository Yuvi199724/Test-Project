package Demoo;

public class Firstpg {
	
	int a=5;
	
	
	{
		
	}
	
	
	
	public void getdata() 
	{	
	for(int i=0;i<5;i++)
		{
			System.out.println("I am in bangalore");	
		}
	}
	
	public void setdata()
	{
		for(int j=0;j< 5;j++)
		{
			System.out.println("I am in mumbri");
		}
	}
	

	public static void main(String[] args) 
	{
		
		Firstpg fpg = new Firstpg();
		Demoo dm = new Demoo();
		Ifclass lfc = new Ifclass();
		fpg.getdata();
		System.out.println(fpg.a);
		fpg.setdata();
		dm.reverse();

	}

	
}
