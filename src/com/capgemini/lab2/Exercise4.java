package com.capgemini.lab2;

import java.util.Scanner;

public class Exercise4 {

	public static int modifyArray (int[] arr,int n)
	{
		 if (n==0 || n==1) 
	            return n; 
	       
	        int[] temp = new int[n]; 
	          
	        // Start traversing elements 
	        int j = 0; 
	        for (int i=0; i<n-1; i++) 
	            // If current element is not equal 
	            // to next element then store that 
	            // current element 
	            if (arr[i] != arr[i+1]) 
	                temp[j++] = arr[i]; 
	          
	        // Store the last element as whether 
	        // it is unique or repeated, it hasn't 
	        // stored previously 
	        temp[j++] = arr[n-1];    
	          
	        // Modify original array 
	        for (int i=0; i<j; i++) 
	            arr[i] = temp[i]; 
	       
	       
	        return j; 
	        
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    int n;
			Scanner s=new Scanner(System.in);
			System.out.println("size of array");
			n=s.nextInt();
			int [] a=new int[n];
			System.out.println("enter array elements:");
			for(int i=0;i<n;i++)
			{a[i]=s.nextInt();}
			
			int[] b = new int[n]; 
	        int j = n; 
	        for (int i = 0; i < n; i++) { 
	            b[j - 1] = a[i]; 
	            j = j - 1; 
	        } 
	  
	        /*printing the reversed array*/
	       // System.out.println("Reversed array is: \n"); 
	        for (int k = 0; k < n; k++) { 
	            System.out.println(b[k]);
			int z=n;
			n=modifyArray (b,z);
			for (int i=0; i<n; i++) 
		         System.out.print(b[i]+" "); 
		   
	        }

}
}
