// 	WAJP to get Array elements from user and print the array elements from first to last 
// 	and also print elements from last to first.
package examples;
import java.util.Scanner;
class Ar1PrintingArrayFromUser
{
	public static void main(String []args)
{
	@SuppressWarnings("resource")
	Scanner sc=new Scanner(System.in);
	System.out.println("Please enter the number of elements you want in your Array");
	int n=sc.nextInt();
	int ar[]=new int [n];	//declaration of array 
	System.out.println("Please enter the " +n+ " elements of your array");
	
	for(int i=0; i<n; i++)
	
		{
			ar[i]=sc.nextInt();
		}
	
	System.out.println("User entered array elements from first to last is: ");

	for(int i=0; i<=ar.length-1; i++)
	
		{
			System.out.print(ar[i]+" ");
		}
	System.out.println(" ");

	System.out.println("User entered array elements from last to first is: ");

	for(int i=ar.length-1; i>=0; i--)
	
		{
			System.out.print(ar[i]+" ");
		}
}
}








/*
{
	public static void main(String []args)
	{
		int ar[]={10,20,30,40,50};	//declaration and initialization of an array
		for(int i=0; i<=ar.length-1; i++)
		{
			System.out.println(ar[i]);
		}

	}
}
*/