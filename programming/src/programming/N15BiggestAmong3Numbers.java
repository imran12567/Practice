//15. WA LOGIC TO PRINT BEGGEST AMONG 3 NUMBERS USING TERNARY OPERATOR.
package programming;

public class N15BiggestAmong3Numbers {
	public static void main(String[] args) {
		int a=20, b=10, c=120;
		int temp;
		temp=a;
		if(b>temp)
		{
			temp=b;
		}
		else if(c>temp)
		{
			temp=c;
		}
		System.out.println(temp);
	}
}
