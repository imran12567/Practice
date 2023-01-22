//4.	WAJP TO STORE STIRNG ELEMENTS INTO ARRAY LIST IN THAT STORE ONE ELEMENT AS "PEN" -REMOVE PEN FROM YOUR LIST WHILE ITERATING.
package programming;

import java.util.ArrayList;
import java.util.Iterator;
public class CL04UseOfRemoveWhileIterating {

	public static void main(String[] args) {
		ArrayList<String> a=new ArrayList<>();
		a.add("pencil");
		a.add("Rubber");
		a.add("Cutter");
		a.add("Pen");
		a.add("Scale");
		a.add("Instrument Box");
		Iterator<String> i=a.iterator();
		while(i.hasNext()) {
			String j=i.next();
			if(j.equals("Pen")) {
				i.remove();
			}
		}
		for(String k:a)
		{
			System.out.print(k+"  ");
		}
	}

}
