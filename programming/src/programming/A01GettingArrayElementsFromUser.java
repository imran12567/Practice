//1.	WAiP TO GET ARRAY ELEMENTS FROM USER END, PRINT THE ARRAY ELEMENTS FROM FIRST TO LAST AND VICE-VERSA.
package programming;

import java.util.Scanner;

public class A01GettingArrayElementsFromUser {
	public static int[] arrayScan() {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Please enter the size of array.");
		int n=sc.nextInt();
		int[] ar=new int[n];
		System.out.println("Please enter "+ n +" no. of elements to save in the array.");
		for(int i=0; i<ar.length; i++) {
			ar[i]=sc.nextInt();
		}
		return ar;
	}
	public static void main(String[] args) {
	int[] a=arrayScan();
	System.out.println("array elements from first to last: ");
	for(int i=0; i<a.length; i++) {
		System.out.print(a[i]+" ");
	}
	System.out.println();
	System.out.println("array elements from last to first: ");
	for(int i=a.length-1; i>=0; i--) {
		System.out.print(a[i]+" ");
	}
}
}
