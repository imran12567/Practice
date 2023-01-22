//2.	WAJP TO SHOW EXAMPLE FOR ITERATOR.
package programming;

import java.util.ArrayList;
import java.util.Iterator;

public class CL02ExampleForIterator {
	String sname;
	int roll;
	public CL02ExampleForIterator(String sname, int roll)
	{
		this.sname=sname;
		this.roll=roll;
	}
	public String toString()
	{
		return "["+ sname + " , " + roll + "]";
	}
	public static void main(String[] args) {
		
		ArrayList<Object> a=new ArrayList<>();
		a.add(new CL02ExampleForIterator("Arun",001));
		a.add(new CL02ExampleForIterator("Varun",002));
		a.add(new CL02ExampleForIterator("Ajay",004));
		a.add(new CL02ExampleForIterator("Vijay",003));
		Iterator<Object> i=a.iterator();
		while(i.hasNext()) {
			Object j=i.next();
			System.out.println(j);
		}
	}
}
