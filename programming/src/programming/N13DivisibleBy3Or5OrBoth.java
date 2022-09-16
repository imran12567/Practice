/*13. WAJP TO READ ONE INTEGER VALUE FROM THE USER 
PRINT "SANJU" IF NUMBER IS DIVISIBLE BY 3, 
PRINT "GEETA" IF NUMBER IS DIVISIBLE BY 5, 
PRINT "SANJU WEDS GEETA" IF NUMBER IS DIVISIBLE BY BOTH 
OTHERWISE PRINT "BREAK UP".*/
package programming;
import java.util.Scanner;

public class N13DivisibleBy3Or5OrBoth {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number to check status");
		int n=sc.nextInt();
		if(n%3==0 && n%5==0)
		{
			System.out.println("SANJU WEDS GEETA");
		}
		else if(n%3==0)
		{
			System.out.println("SANJU");
		}
		else if(n%5==0)
		{
			System.out.println("GEETA");
		}
		
		else
		{
			System.out.println("BREAK UP");
		}
	}
}
