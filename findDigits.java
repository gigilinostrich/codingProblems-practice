import java.util.*;
public class findDigits {

	public static void main(String[] args) {
	// input: 12    output: 2
	// input: 1012  output: 3
	// input: 124   output: 3
	// input 10     output: 1
	//Given an integer, for each digit that makes up the integer determine
	//whether it is a divisor. Count the number of divisors occurring within the integer.
	
	
		int num = 123456789; // output 3
		int numBackUp = num;
		List <Integer> digitStore = new ArrayList<Integer>();
		 // Printing the last digit of the number
        while (num > 0) {
 
            // Finding the remainder (Last Digit)
            int remainder = num % 10;
 
            // Printing the remainder/current last digit
         //   System.out.println(remainder);
            digitStore.add(remainder);
 
            // Removing the last digit/current last digit
            num = num / 10;
        }
    
        // num will change to 0 after extracting digits. Make sure to have a backup
      
        int divisibleCount = 0;
        for (int i = 0; i < digitStore.size(); i++) {
       
        	if ( digitStore.get(i) != 0 && numBackUp % digitStore.get(i)==0) {
        
        		 divisibleCount++;
        	}
        }
        System.out.println(divisibleCount);
        
	}

}
