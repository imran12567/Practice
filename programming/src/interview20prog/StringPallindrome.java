package interview20prog;

public class StringPallindrome {
	
	public static void main(String[] args) {
		String s="Aba";
		s=s.toLowerCase();
		String rev="";
		for (int i = s.length()-1; i >=0; i--) {
			rev=rev+s.charAt(i);
		}
		
		if (s.equals(rev)) {
			System.out.println("pallindrome");
			
		}
		else
		{
			System.out.println("not a pallindrome");
		}
	}

}
