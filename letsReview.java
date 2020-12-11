import java.util.*;

public class letsReview {

	public static void main(String[] args) {
		// 2  (inputs) -> 
		// Hacker      ->	Hce akr	 
		// Rank        ->   Rn ak
		Scanner s = new Scanner(System.in);
		String str = "";
		int size = s.nextInt(); // how many times the user will input 
		for ( int i = 0; i < size; i++) { 
			 str = s.next(); // input strings n times. 1. input the string, print even and odd. 2. Input string again, repeat
			for(int j = 0; j < str.length(); j ++) { // iterating each character in each string
				if(j % 2 == 0) { // if index is even, print 
					System.out.print(str.charAt(j));
				}
				// note: do not put an else statement here ( odd), it will print out the whole string
			}
			System.out.print(" ");
			// suggestion: make a separate for loop for the odd index case
			for(int k = 0; k < str.length(); k ++) {
				if(k % 2 == 1) {
					System.out.print(str.charAt(k));
				}
				
			}
			System.out.println(); // endline
		}
	
		s.close();
		
	}

}
