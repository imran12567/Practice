//1.	ARRAYLIST CLASS: WAJP TO SHOW EXAMPLE FOR LIST INTERFACE BY USING ARRAYLIST CLASS.
//
//6.	WAJP TO STORE STUDENT OBJECT AS WELL AS EMPLOYEE OBJECT INTO A SINGLE CONTAINER, INSERTION ORDER SHOULD BE MAINTAINED.
//7.	WAJP TO SHOW SORTING FUNCTION USING COLLECTIONS.SORT().
//8.	WAJP TO COMPARE THE STRING OBJECTS OR INTEGER OBJECT USING compareTo() METHOD.
//9. 	LINKEDLIST CLASS:	WAJP TO CREATE A LIST, ADD ELEMENTS AND ITERATE IN BIDIRECTIONAL WAY. USE LinkedList class AND USE ListIterator interface.
package programming;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CL01ExmapleOfArrayList {
	public static void main(String[] args) {
		List<Integer> a=new ArrayList<>();
		a.add(20);
		a.add(10);
		a.add(30);
		for(int i=0; i<a.size(); i++)
		{
			System.out.print(a.get(i)+" ");
		}
		System.out.println();
		for(int i:a)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		Iterator<Integer> i=a.iterator();
		while(i.hasNext())
		{
			int j=i.next();
			System.out.print(j+" ");
		}
	}
}
