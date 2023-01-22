//5.	DEFINE A METHOD TO RETURN THE PRODUCT OF ARRAY ELEMENTS.
package programming;

public class A05ProductOfArrayElements {
	public static int arrayProduct(int[] a) {
		int temp=a[0];
		for(int i=1; i<a.length; i++) {
			
				temp=temp*a[i];
			
		}
		return temp;
	}
	public static void main(String[] args) {
		int[] ar=A01GettingArrayElementsFromUser.arrayScan();
		int product=arrayProduct(ar);
		System.out.println(product);
	}
}
