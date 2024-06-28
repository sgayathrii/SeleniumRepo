package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1 = 0, n2 = 1, inputRange = 8;
		System.out.println("Fibonacci Series of " + inputRange + " terms:");
		
		for (int i = 0; i < inputRange; ++i) {
			
			System.out.print(n1 + ",");
			
			int next = n1 + n2;
			n1 = n2;
			n2 = next;
		}

	}
	
	//Another way
	/*
	 * public static void main(String[] args) { int limit = 8;
	 * generateFibonacciSeries(limit); }
	 * 
	 * public static void generateFibonacciSeries(int n) { int a = 0, b = 1;
	 * 
	 * System.out.print(a + ", " + b);
	 * 
	 * for (int i = 2; ; i++) { int next = a + b; if (next > n) { break; }
	 * System.out.print(", " + next); a = b; b = next; } }
	 */

}

