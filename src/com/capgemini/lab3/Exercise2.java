package com.capgemini.lab3;

import java.util.Scanner;

public class Exercise2 {


	public static void getImage(StringBuffer a)
	{
	
	StringBuilder input1 = new StringBuilder();
		  
	        // append a string into StringBuilder input1
	        input1.append(a);
	        input1 = input1.reverse();
	        System.out.println(a+"|"+input1); // returns GeeksforGeeks 
	         
	        // print reversed String
	       //System.out.println(input1);
		    //return input1;
				
				
			
	}

	 @SuppressWarnings("resource")
	public static void main(String args[]) 
	    { 
		Scanner sc= new Scanner(System.in); //System.in is a standard input stream  
	    System.out.print("Enter a string: ");  
	    //StringBuffer s= sc.nextLine(); 
	    StringBuffer a = new StringBuffer();
	    a.append(sc.nextLine());
	    getImage(a);
		
	        } 
}

