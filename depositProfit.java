
public class depositProfit {

	public static void main(String[] args) {
		/*
		 * You have deposited a specific amount of money into your bank account. Each
		 * year your balance increases at the same growth rate. With the assumption that
		 * you don't make any additional deposits, find out how long it would take for
		 * your balance to pass a specific threshold
		 * 
		 * deposit = 100, rate = 20, and threshold = 170, the output should be
		 * depositProfit(deposit, rate, threshold) = 3
		 * 
		 * Each year the amount of money in your account increases by 20%. So throughout
		 * the years, your balance would be:
		 * 
		 * year 0: 100; year 1: 120; year 2: 144; year 3: 172.8.
		 * 
		 * Thus, it will take 3 years for your balance to pass the threshold, so the
		 * answer is 3
		 * 
		 */
	
		

  		
  		int deposit = 1;
		int rate = 100;
		double finalAmount = (double)deposit;
		int year = 0;
		int threshold = 64;
		while (finalAmount < (double)threshold) {
			
			finalAmount *= (((double)rate + 100.0)/100.0);

			year++;
		}
		System.out.println(year);

	}

}
