//16. WAJP TO READ THE DATE FROM THE USER AND PRINT THE DATE IS VALID OR NOT.
package programming;

import java.util.Scanner;

public class N16CheckingDataValidity {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter date number in dd format");
		int dd=sc.nextInt();
		System.out.println("enter month number in mm format");
		int mm=sc.nextInt();
		System.out.println("enter year in yyyy format");
		int yy=sc.nextInt();
		if(dd<1 || dd>31)
		{
			System.out.println("invalid date number, please insert between 1 to 31 only");
		}
		else if(mm<1 || mm>12)
		{
			System.out.println("invalid month number, please insert between 1 to 12 only");
		}
		else if(yy<1)
		{
			System.out.println("invalid year number, please insert year in positive integer");
		}
		else if(mm==4 || mm==6 ||mm==9 || mm==11)
		{
			if(dd==31)
			{
				System.out.println("invalid date considering month number");
			}
		}
		else if(mm==2)
		{
			/*
			 * if(yy/400 && yy!/100 || yy/4)) {
			 * 
			 * }
			 */
		}
		else
		{
			
		}
		
	}
}
