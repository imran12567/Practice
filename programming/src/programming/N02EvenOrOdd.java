package programming;

import java.util.Scanner;

public class N02EvenOrOdd {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter any number");
		int n=sc.nextInt();
		if(n%2==0)
		{
			System.out.println(n+": is a even number");
		}
		else 
		{
			System.out.println(n+": is a odd number");
		}
		
		//using conditional statement:
		String s=(n%2==0)?"even":"odd";
		System.out.println(s);
		
		//using switch case statement:
		//using Strings only
	}

}
