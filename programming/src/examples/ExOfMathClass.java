package examples;

public class ExOfMathClass {
	public static void main(String[] args) {
		int a=10, b=100;
		System.out.println(Math.pow(a, 3));
		System.out.println(Math.pow(3, 4));
		System.out.println(Math.sqrt(a));
		System.out.println(Math.sqrt(-a));//NaN
		System.out.println(Math.random());
		System.out.println(Math.max(a,b));
		System.out.println(Math.min(a,b));
		System.out.println(Math.min(a, b));
		System.out.println(Math.floor(5.9));//5
		System.out.println(Math.ceil(5.2));//6
		System.out.println(Math.round(5.2));
		System.out.println(Math.round(5.4));
		System.out.println(Math.round(5.5));
		System.out.println(Math.round(5.6));
		
		System.out.println(Math.floor(-5.9));//6
		System.out.println(Math.ceil(-5.2));//5
		System.out.println(Math.round(-5.6));
		
	}
}
