//1.	HASHSET CLASS: WAJP TO CREATE A NON-GENERIC HASHSET. ADD ELEMENTS & PRINT USING FOR EACH LOOP.
package programming;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class CSI01ExampleOfHashSetClass {
	public static void main(String[] args) {
		HashSet<Integer> hs=new HashSet<>();
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(10);
		hs.add(20);
		hs.add(30);
		for(Integer i:hs) {
			System.out.print(i+" ");
		}
		System.out.println();
		TreeSet<Integer> ts=new TreeSet<>();
		ts.add(10);
		ts.add(20);
		ts.add(30);
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
		lhs.add(30);
		lhs.add(10);
		lhs.add(20);
		for(Integer i:lhs) {
			System.out.print(i+" ");
		}
	}
}

//NOTE: 1. IN SET NO INDEX NUMBER AND NO DUPLICATION SAVED and no insertion order saved.
//		2. IN HASHSET OUTPUT USED TO BE RANDOM, TREESET IT IS IN ASC ORDER, IN LHS INSERTION ORDER MAINTAINED