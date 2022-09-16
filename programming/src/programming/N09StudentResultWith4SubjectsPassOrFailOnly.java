package programming;

import java.util.Scanner;

public class N09StudentResultWith4SubjectsPassOrFailOnly {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter Hindi Marks");
		int a=sc.nextInt();
		System.out.println("Please enter English Marks");
		int b=sc.nextInt();
		System.out.println("Please enter Math Marks");
		int c=sc.nextInt();
		System.out.println("Please enter Science Marks");
		int d=sc.nextInt();
		double finalResult=((a+b+c+d)/4);
		if (finalResult>=35)
		{
			System.out.println(finalResult+"% result is Pass");
		}
		else {
			System.out.println(finalResult+"% result is Fail");
		}
	}

}
