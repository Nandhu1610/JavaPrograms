package module2.basicjava;

import java.util.Arrays;

public class MergingTwoArrays 
{
	public static void main(String[] args) 
	{
		 int[] a1= {1,2,3,4,5};
	     int[] a2= {4,5,6,7,8};
	     int arr1size= a1.length;
	     int arr2size= a2.length;
	     int arr3size=arr1size+arr2size;
	     int[] a3=new int[arr3size];
	     
	     for(int i=0;i<arr1size;i++)
	     {
	    	 a3[i]=a1[i];
	     }
	
	     for(int i=0;i<arr2size;i++)
	     {
	    	 a3[arr1size+i]=a2[i];
	     }
	     System.out.println(Arrays.toString(a3));	     
	     /*
	      int[] a1= {1,2,3,4,5};
	     int[] a2= {4,5,6,7,8};
	     int[] a3=new int[a1.length+a2.length];
	     for(int i=0;i<a1.length;i++)
	     {
	    	 a3[i]=a1[i];
	     }
	
	     for(int i=0;i<a2.length;i++)
	     {
	    	 a3[a1.length+i]=a2[i];
	     }
	     System.out.println(Arrays.toString(a3)); 
	     */
	}

}
