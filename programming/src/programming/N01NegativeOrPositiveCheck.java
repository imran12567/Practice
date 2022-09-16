package programming;
import java.util.Scanner;
public class N01NegativeOrPositiveCheck {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter any number");
		int n=sc.nextInt();
		if(n<0)
		{
			System.out.println(n+": is a negative number");
		}
		else 
		{
			System.out.println(n+": is a positive number");
		}
	}

}
