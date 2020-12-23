
public class beautifulDayAtMovies {

	public static void main(String[] args) {
		
			int i = 20; //the starting day number 
			int j = 23; //the ending day number 
			int k = 6; //the divisor 
			// in range: day 20, 21, 22, 23 
			// 20 and 22, print 2
			// beautifulDay = |i - reverse(i)| / k 
			int beautifulDay = 0;
			int beautifulCount = 0;
			for (int index = i; index <= j; index++ ) {
				beautifulDay = Math.abs(index - reversed(index));
				if (beautifulDay % k == 0) {
					beautifulCount++;
				}
			}
		System.out.println("beautiful day count " + beautifulCount);
	}
	public static int reversed(int n) {
		int reversedN = 0;
		while(n != 0) {
            int digit = n % 10;
            reversedN = reversedN * 10 + digit;
            n /= 10;
        }
	return reversedN;
	}

}
