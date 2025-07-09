package Demoo;

import java.util.ArrayList;
import java.util.List;

public class araycheck {

	public static void main(String[] args) {
	

		   List<Integer> arrli1 = new ArrayList<Integer>();
		      List<Integer> arrli2 = new ArrayList<Integer>();
		       List<Integer> arrli3 = new ArrayList<Integer>();
		       
		      int num1=1;
		      int num2=1;
		      arrli1.add(1);
		      arrli1.add(2);
		      arrli1.add(3);
		      arrli1.add(4);
		      arrli1.add(5);
		      arrli1.add(5);
		      arrli1.add(5);
		   ///////////////////////////////////
		      arrli2.add(1);
		      arrli2.add(2);
		      arrli2.add(2);
		      arrli2.add(4);
		      arrli2.add(5);
		      arrli2.add(6);
		      arrli2.add(7);
		      arrli2.add(2);
		      arrli2.add(4);
		      arrli2.add(6);
		      
	              for(int j=0 ;j<arrli1.size();j++)	
		        {     
	     
		     arrli3.add(arrli1.get(j)*arrli2.get(j));
		     
		      }     
		      if(arrli1.size()>arrli2.size())
		      {
		          for(int i=arrli2.size();i<arrli1.size();i++)
		          {
		              arrli3.add(arrli1.get(i));
		          }
		      }
		       if (arrli2.size() > arrli1.size())
		      {
		          for(int i=arrli1.size();i<arrli2.size();i++)
		          {
		              arrli3.add(arrli2.get(i));
		          }
	      }
		      
  System.out.println(arrli3);
		
		
	}}
		
		
		


