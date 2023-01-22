//2. 	DEFINE A METHOD TO RETURN THE SUM OF ARRAY ELEMENTS.
package programming;

public class A02SumOfElements {
	static int sumOfArrayElement(int[] a) {
		int temp=0;
		for(int i=0; i<a.length; i++)
		{
			temp=temp+a[i];
		}
		return temp;
	}
	public static void main(String[] args) {
		int[] ar=A01GettingArrayElementsFromUser.arrayScan();
		System.out.println(sumOfArrayElement(ar));
	}
}
