//3.	DEFINE A METHOD TO RETURN THE BIGGEST AND SMALLEST VALUE FROM THE ARRAY.
package programming;

public class A03BiggestAndSmallestValue {
	static int biggestValue(int[] a) {
		int temp=a[0];
		for(int i=1; i<a.length; i++) {
			if(a[i]>temp) {
				temp=a[i];
			}
		}
		return temp;	
	}
	static int smallestValue(int[] a) {
		int temp=a[0];
		for(int i=1; i<a.length; i++) {
			if(a[i]<temp) {
				temp=a[i];
			}
		}
		return temp;	
	}
	public static void main(String[] args) {
		int[] ar=A01GettingArrayElementsFromUser.arrayScan();
		int biggest=biggestValue(ar);
		System.out.println(biggest);
		int smallest=smallestValue(ar);
		System.out.println(smallest);
	}
	
}
