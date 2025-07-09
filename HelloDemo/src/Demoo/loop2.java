package Demoo;

public class loop2 
{

	public static void main(String[] args)
	{
	int k=3;
	
		for(int i=1;i<=4;i=i*3)
		{
			for(int j=1;j<=18-i;j++)
			{
				System.out.print(k +"  ");
				k++;
			}
			System.out.println(" ");
		}
	//System.out.println(" ");

	}

}

