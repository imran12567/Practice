package interview20prog;

import java.util.Scanner;

// Reverse the String without using inbuilt function

public class I01ReverseAStringWithoutUsingStringInbuiltFunction {
	public static String reverseString(String w)
	{
		String rev="";
		for (int i = w.length()-1; i >=0; i--) {
			rev=rev+w.charAt(i);
		}
		return rev;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter one word");
		String word=sc.next();
		String s=reverseString(word);
		System.out.println(s);
	}
	
}
