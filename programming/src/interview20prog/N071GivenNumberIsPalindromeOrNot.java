package interview20prog;

import java.util.Scanner;

public class N071GivenNumberIsPalindromeOrNot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter one number with 2 digit or more");
		int n=sc.nextInt();
		int givenNumber=n;
		int temp=0;
		int digit;
		while(n>0)
		{
			digit=n%10;
			temp=temp*10+digit;
			n=n/10;
		}
		if(temp==givenNumber)
		{
			System.out.println(givenNumber+" is a Palindrome Number ");
		}
		else
		{
			System.out.println(givenNumber+"is not a Palindrome Number");
		}
	}

}
