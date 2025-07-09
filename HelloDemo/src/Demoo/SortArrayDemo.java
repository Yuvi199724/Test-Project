package Demoo;

public class SortArrayDemo {
    public static void main(String[] args) {
        int a[] = {1, 3, 4, 6, 7, 5, 4, 5, 7, 8, 54};
        int temp;

        // Bubble Sort Algorithm
        for (int i = 0; i < a.length - 1; i++) 
        { 
            for (int j = 0; j < a.length-1-i; j++) 
            {
                if (a[j] > a[j + 1])
                {
               
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
            		
            		
                }
            }
        }

        // Print sorted array with spaces
        System.out.print("Sorted Array: ");
        for (int num : a) {
            System.out.print(num+ " ");
        }
////        duplicates
//        int [] uniquearray = new int[a.length];
//        
//        int uniquevalueCount =0;
//        
//                uniquearray[uniquevalueCount++] =a[0];
//        
//        for(int i=1;i<a.length-1;i++)
//        {
//        	if(a[i] != a[i-1])
//        	{
//        		uniquearray[uniquevalueCount++] =a[i];
//        	}
//        }
//        
//        for(int i=0;i<uniquevalueCount;i++)
//        {
//        	System.out.println(uniquearray[i]);
//        }
        
    }
}