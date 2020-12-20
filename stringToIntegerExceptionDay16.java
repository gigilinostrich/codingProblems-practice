import java.util.*;
public class stringToIntegerExceptionDay16 {

	public static void main(String[] args) {
	// read a string s, print its integer value
	// if s cannot be converted to integer, print Bad String
	// must use the String-to-Integer and exception handling
	// do not use loops/conditional statements

	// sample input 0 : 3
	// sample output 0 : 3
	// sample input 1 : za
	// sample output 1 : Bad String
		
		 Scanner in = new Scanner(System.in);
	        String S = in.next();
		try {
	      int sInt = Integer.parseInt(S);
	      System.out.println(sInt);
	      
	      in.close();
		}
		catch (NumberFormatException e) {
			System.out.println("Bad String");
		}
		
	}

}
