//10. WAJP TO READ THE MONTH NUMBER FROM THE USER AND 
//PRINT HOW MANY DAYS IN THAT MONTH NUMBER.

package programming;
import java.util.Scanner;
public class N10MonthDaysFromMonthNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter month number to get no. of days in that month");
		int n=sc.nextInt();
			switch(n)
			{
			case 1: System.out.println("31 days"); break;
			case 2: System.out.println("28/29 days");break;
			case 3: System.out.println("31 days");break;
			case 4: System.out.println("30 days");break;
			case 5: System.out.println("31 days");break;
			case 6: System.out.println("30 days");break;
			case 7: System.out.println("31 days");break;
			case 8: System.out.println("31 days");break;
			case 9: System.out.println("30 days");break;
			case 10: System.out.println("31 days");break;
			case 11: System.out.println("30 days");break;
			case 12: System.out.println("31 days");break;
			default : System.out.println("Invalid Month Number");
			}
	}

}
