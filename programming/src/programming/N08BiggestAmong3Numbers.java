package programming;

import java.util.Scanner;

public class N08BiggestAmong3Numbers {

	public static void main(String[] args) {
		//int a=10, b=20, c=30;
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter first number");
		int a=sc.nextInt();
		System.out.println("Please enter second number");
		int b=sc.nextInt();
		System.out.println("Please enter third number");
		int c=sc.nextInt();
		if(a>b && a>c)
		{
			System.out.println(a+": is biggest number");
		}
		else if(b>a && b>c)
		{
			System.out.println(b+": is beggest number");
		}
		else {
			System.out.println(c+": is beggest number");
		}
	}

}
