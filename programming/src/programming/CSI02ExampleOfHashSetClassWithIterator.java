//1.	HASHSET CLASS: WAJP TO CREATE A NON-GENERIC HASHSET. ADD ELEMENTS & PRINT USING FOR EACH LOOP.
package programming;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class CSI02ExampleOfHashSetClassWithIterator {
	public static void main(String[] args) {
		HashSet<Integer> hs=new HashSet<>();
		hs.add(10);
		hs.add(20);
		hs.add(30);
		ArrayList<Integer> l=new ArrayList<>();
		l.add(18);
		l.add(25);
		l.add(11);
		for(Integer i:l) {
			System.out.print(i+" ");
			}
		System.out.println();
		Collections.sort(l);
		for(Integer i:l) {
		System.out.print(i+" ");
		}
		
		System.out.println();
		TreeSet<Integer> ts=new TreeSet<>();
		ts.add(10);
		ts.add(20);
		ts.add(30);
		for(Integer i:ts) {
			System.out.print(i+" ");
		}
		System.out.println();
		LinkedHashSet<Integer> lhs=new LinkedHashSet<>();
		lhs.add(30);
		lhs.add(10);
		lhs.add(20);
		for(Integer i:lhs) {
			System.out.print(i+" ");
		}
	}
}

