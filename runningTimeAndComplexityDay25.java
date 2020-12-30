import java.util.*;
public class runningTimeAndComplexityDay25 {

	public static void main(String[] args) {
	
	//	3		how many inputs
	//	12		Not prime
	//	5		Prime
	//	7		Prime
		// square root approach
	    Scanner in = new Scanner(System.in);
	    int n = in.nextInt();

	    int[] numbers = new int[n];
	    for (int i = 0; i < n; i++) {
	      numbers[i] = in.nextInt();
	    }

	    for (int i = 0; i < numbers.length; i++) {
	      if (isPrime(numbers[i]))
	        System.out.println("Prime");
	      else
	        System.out.println("Not prime");
	    }
	    in.close();
	    /*  Brute Force Approach
		int n = 24;
	
		int count = 0;
	
		for (int i = 1; i <= n; i++) {
		
			if (n % i == 0){
			
				count++;
			}
			
		}
		if (count == 2) {
			System.out.println("Prime");
		}
		else {
			System.out.println("Not prime");
		}
		*/
	  }
		
	
public static boolean isPrime(int number) {

    double numberSqrt = Math.sqrt(number);

    if (number <= 1) // 1 is not prime
      return false;

    else {
      for (int j = 2; j <= numberSqrt; j++) { // 2 to square root of num
        if (number % j == 0) { // if not prime
          return false;
        }
      }
    }
    return true; // prime
  }

}
