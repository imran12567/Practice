package interview20prog;

public class ReverseOfSentence {
	public static String reverseSentence(String str)
	{
		char ch[] =str.toCharArray();
		String temp="";
		for (int i= ch.length-1; i>=0; i--) {
			int k=i;
			while(i>=0 && ch[i]!=' ')
			{
				i--;
			}
			int j=i+1;//8+1=9
			while(j<=k)
			{
				temp=temp+ch[j];
				j++;
			}
			if(i>=0)
			{
				temp=temp+ch[i];
			}
		}
		return temp;
	}
	public static void main(String[] args) {
		String str1="the fort city";//012 4567 9.10.11.12
		String reverse=reverseSentence(str1);
		System.out.println(reverse);
	}
}
