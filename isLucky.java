import java.util.*;
public class isLucky {

	public static void main(String[] args) {
	//Ticket numbers usually consist of an even number of digits.
	//A ticket number is considered lucky if the sum of the first half
	//of the digits is equal to the sum of the second half.
		
		// if n = 1230, true ( 1 + 2) and (3 + 0) are 3
		// if n = 239017, false. (2 + 3 + 9 ) = 14, (0 + 1 + 7) = 8
		
		int n = 239017;
	List <Integer> digitStore = new ArrayList<Integer>();
	    while (n> 0) {
            // Finding the remainder (Last Digit)
            int remainder = n% 10;
            // Printing the remainder/current last digit
         //   System.out.println(remainder);
            digitStore.add(remainder);
            // Removing the last digit/current last digit
            n = n / 10;
        }
	    int sum1 = 0;
	    int sum2 = 0;
	    for (int i = 0; i < digitStore.size(); i++) {
	    	if (i <(digitStore.size()/2)) {
	    		sum1 += digitStore.get(i);
	    	}
	    	else {
	    		sum2 += digitStore.get(i);
	    	}
	    }
		if (sum1 == sum2) {
			System.out.println("return true");
		}
		else {
			System.out.println("return false");
		}
			
	}

}
