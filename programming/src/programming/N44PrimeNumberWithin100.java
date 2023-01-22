//44. WAJP TO PRINT ALL THE PRIME NO. WITHIN 100 (or within 'n')
package programming;

import java.util.Scanner;

public class N44PrimeNumberWithin100 {
	static boolean isPrime(int x) {
		if(x<2) {
			return false;
		}
		for(int i=2; i<=x/2; i++) {
			if(x%i==0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
//		for(int i=1; i<=100; i++) {
//			boolean flag= isPrime(i);
//			if(flag==true) {
//				System.out.print(i+" ");
//			}
//		}

		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the number within which you want to print the prime numbers");
		int n=sc.nextInt();
		for(int i=1; i<=n; i++) {
			boolean flag= isPrime(i);
			if(flag==true) {
				System.out.print(i+" ");
			}
		}
	}
}
