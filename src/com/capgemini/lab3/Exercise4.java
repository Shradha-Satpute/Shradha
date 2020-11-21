 package com.capgemini.lab3;

import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter a number: ");  
		int num= sc.nextInt();
		Integer obj=new Integer(num);
		String str=obj.toString();
		System.out.println(str);
		int n=str.length();
		char c[]=new char[n];
		int a[]=new int[n];
		int dif[]=new int[n-1];
		for(int i=0;i<n;i++) {
			c[i]=str.charAt(i);
			
		}
		
		  for(int i=0;i<c.length;i++) { 
//			  a[i]=Integer.parseInt(String.valueOf(c[i])); 
			  String b=(String) String.valueOf(c[i]); 

			//  System.out.println(b);
			  a[i]=Integer.parseInt(String.valueOf(b));
			  System.out.println(a[i]);
			  
			  }
		///  System.out.println(a);
		 
		StringBuffer sbf1 = new StringBuffer(); 
		for(int i=0;i<a.length;i++) {
			 dif[i]=a[i]-a[i+1];
			///sbf1.append(dif);
			 System.out.println(dif[i]);

			
		}
		
	}

}

