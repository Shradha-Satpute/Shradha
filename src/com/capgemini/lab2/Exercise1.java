package com.capgemini.lab2;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise1 {
	public static void getSecondSmallest(int n) {
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		int [] a=new int[n];
		System.out.println("enter array elements:");
		for(int i=0;i<n;i++)
		{a[i]=s.nextInt();}
		
		@SuppressWarnings("unused")
		int size = a.length;
	      Arrays.sort(a);
	      //System.out.println("sorted Array ::"+Arrays.toString(a));
	      int res = a[1];
	      System.out.println("2nd smallest element is ::"+res);
	}
	@SuppressWarnings("resource")
	public static void main(String args[]){
		int n;
		Scanner s=new Scanner(System.in);
		System.out.println("size of array");
		n=s.nextInt();
	getSecondSmallest(n);
	
	}
}