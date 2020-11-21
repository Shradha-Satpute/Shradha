package com.capgemini.lab1;
import java.util.Scanner;

public class Exercise2 {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter you Choice \n 1: RED \n 2:YELLOW \n 3:GREEN");
		
		int choice =sc.nextInt();
		 switch(choice)
		 {
		 case 1:
			 System.out.println("stop");
		 break;
		 case 2:
			 System.out.println("ready");
			 break;
		 case 3:
			 System.out.println("stop");
			 break;
		 }
	}
}