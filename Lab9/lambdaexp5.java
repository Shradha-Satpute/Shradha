package comcapgemini.trainingsession.Lab9;

import java.util.Scanner;
import java.util.function.Function;

public class lambdaexp5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		lambdaexp5 factorial=new lambdaexp5();
		Scanner sc=new Scanner(System.in);
		// method reference
		Function <Integer,Integer> function = factorial::fact;
		System.out.println("Enter Number");
		int num=sc.nextInt();
		System.out.println("Factorial of "+num+"="+function.apply(num));
	}
	 public Integer fact(int num)
	 {
		 if(num ==0 || num ==1)
		 {
			 return 1;
		 }
		 else
		 {
			 return num*fact(num-1);
		 }
	 }

}
