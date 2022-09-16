package programming;

import java.util.Scanner;

public class N03MonthNumberIsValidOrNot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter any number");
		int n=sc.nextInt();
		if(n<1 || n>12)
		{
			System.out.println("Wrong month number");
		}
		else 
		{
			System.out.println("Right month number");
		}
	}

}
