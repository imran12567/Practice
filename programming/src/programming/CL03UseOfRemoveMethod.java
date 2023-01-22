//3.	WAJP TO USE REMOVE() METHOD.
package programming;

import java.util.ArrayList;
import java.util.Iterator;

public class CL03UseOfRemoveMethod {
	public static void main(String[] args) {
		ArrayList<String> a=new ArrayList<>();
		a.add("Arun");
		a.add("Varun");
		a.add("Ajay");
		a.add("Vijay");

		ArrayList<String> b=new ArrayList<>();
		b.addAll(a);

		b.add("Arun");
		b.add("Varun");
		b.add("Suresh");
		b.add("Ramesh");
	//	b.removeAll(a);
		b.remove(7);
		Iterator<String> i=b.iterator();
		while(i.hasNext()) {
			Object j=i.next();
			System.out.print(j+"  ");
		}
		
	}
}
