package com.capgemini.lab1;

import java.util.Scanner;

public class Exercise6 {

	static int calculateDifference(int n){ 
		  
		int l, k, Sum; 
		    // Sum of the squares of the 
		    // first n natural numbers is 
		    l = (n * (n + 1) * (2 * n + 1)) / 6; 
		      
		    // Sum of n naturals numbers 
		    k = (n * (n + 1)) / 2; 
		  
		    // Square of k 
		    k = k * k; 
		      
		    // Differences between l and k 
		    Sum = Math.abs(l - k); 
		      
		    return Sum; 
		  
		} 
	@SuppressWarnings("resource")
	public static void main(String s[]) 
	{ Scanner sc= new Scanner(System.in);
	System.out.println("enter no");
	int n = sc.nextInt(); 
	    
	    System.out.println(calculateDifference(n));      
	      
	} 

}
