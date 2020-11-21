package com.capgemini.lab2;

import java.util.Scanner;

public class Exercise3 {
	static void getSorted (int[] a,int n)
	{
	
		int i, k, t; 
        for (i = 0; i < n / 2; i++) { 
            t = a[i]; 
            a[i] = a[n - i - 1]; 
            a[n - i - 1] = t; 
        } 
  
        /*printing the reversed array*/
        System.out.println("Reversed array is: \n"); 
        for (k = 0; k < n; k++) { 
            System.out.println(a[k]); 
        } 
	}
	 @SuppressWarnings("resource")
	public static void main(String[] args) 
	    { 
		 int n;
			Scanner s=new Scanner(System.in);
			System.out.println("size of array");
			n=s.nextInt();
			int [] a=new int[n];
			System.out.println("enter array elements:");
			for(int i=0;i<n;i++)
			{a[i]=s.nextInt();}
			getSorted (a,n);
	    }


}

