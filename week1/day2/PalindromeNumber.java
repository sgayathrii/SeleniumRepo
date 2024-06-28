package week1.day2;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * String input = "12345", output = "";
		 * System.out.println("Original Number is = "+input); int length =
		 * input.length(); for (int i = length-1; i >=0 ; i--) { output = output +
		 * input.charAt(i); }
		 * 
		 * System.out.println("Reversed output is = "+output);
		 * 
		 * if(input.equals(output)) { System.out.println("It is a Palindrome"); } else {
		 * System.out.println("It is not a Palindrome"); }
		 */
		
		int input = 12345 , output = 0;
		System.out.println("Original Number is = "+input);
		for(int i = input; i > 0; i/=10) {
			int rem = i % 10;
			output = output * 10 + rem;
		}
		System.out.println("Reversed output is = "+output);
		if(input == output) {
			System.out.println(output +" is a palindrome number.");
		}
		else {
			System.out.println(output +" is not a palindrome number");
		}
	}

}
