package comcapgemini.trainingsession.Lab9;


import java.util.Scanner;
import java.util.function.BiPredicate;

public class lambdaexp3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		BiPredicate <String,String> bipredicate =
				(userid,password) ->
		{
			if(userid.equals("Shradha") && password.equals("shanks@98"))
			{
				return true;
			}
			return false;
		};
		System.out.println("Enter user id");
		String id=sc.next();
		System.out.println("Enter password");
		String pd=sc.next();


		if(bipredicate.test(id,pd))
		{ System.out.println("Login succsessfully"); }
		else 
		{ System.out.println("Wrong credentials .... authentication error"); }

	}

}

