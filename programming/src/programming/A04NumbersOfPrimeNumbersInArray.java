//4.	DEFINE A METHOD TO RETURN HOW MANY PRIME NOS. ARE PRESENT IN THE ARRAY.
package programming;

public class A04NumbersOfPrimeNumbersInArray {
	public static boolean isPrime(int x) {
		if(x<2) {
			return false;
		}
		for(int j=2; j<x/2; j++) {
			if(x%j==0) {
					return false;
			}
		}
		return true;
	}
	static int countPrime(int[] a) {
		int count=0;
		for(int i=0; i<a.length; i++) {
			boolean p=isPrime(a[i]);
			if(p==true) {
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		int[] ar=A01GettingArrayElementsFromUser.arrayScan();
		int totalPrimeNo=countPrime(ar);
		System.out.println(totalPrimeNo);
	
	}
}