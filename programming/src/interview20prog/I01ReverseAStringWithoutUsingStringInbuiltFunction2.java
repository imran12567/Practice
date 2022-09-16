package interview20prog;

import java.util.Scanner;

// Reverse the String without using inbuilt function

public class I01ReverseAStringWithoutUsingStringInbuiltFunction2 {
	public static String reverseString(String w)
	{
		String temp="";
		char[] c=w.toCharArray();
		for(int i=0; i<c.length; i++)
		{
			temp=c[i]+temp;	
		}
		return temp;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter one word");
		String word=sc.next();
		String s=reverseString(word);
		System.out.println(s);
	}
	
}
