// Define a method to return the sum of array elements.
package examples;
import java.util.Scanner;
class Ar2WithMethodWithArrayReturn
{
	static int[] getArray()
	{
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of elements you want in your Array");
		int n=sc.nextInt();
		int ar[]=new int[n];
		for( int i=0; i<ar.length; i++)
		{
			ar[i]=sc.nextInt();
		}
		return ar;
	}
	public static void main(String [] args)
	{
		int[] a=getArray();
		for (int i : a) {
			System.out.println(i);
		}
	}
}