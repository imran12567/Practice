package interview20prog;

import java.util.Scanner;

public class N07GivenNumberIsPrimeOrNot {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number to check prime number or not");
		int n=sc.nextInt();
		for (int i = 2; i <= n; i++) {
			if(n%i==0)
			{
				System.out.println(n+" is not a prime number");
				break;
			}
			else
			{
				System.out.println(n+" is a prime number");
				break;
			}
		}
	}
}
