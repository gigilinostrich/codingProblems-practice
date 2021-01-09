import java.math.BigInteger;
import java.util.*;

public class strangeCounter {

	public static void main(String[] args) {
		// There is a strange counter. At the first second, it displays the number 3.
		// Each second, the number displayed by 1 decrements by until it reaches 1. In
		// next
		// second, the timer resets to 2 x the initial number for the prior cycle and
		// continues counting down. The diagram below
		// shows the counter values for each time t in the first three cycles:

		// math approach, pattern
		/*
		 * the last 'time' value of cycle 1 is 3 which is 3*1=3*(2^1-1), the last 'time'
		 * value of cycle 2 is 9 which is 3*3=3*(2^2-1), the last 'time' value of cycle
		 * 3 is 21 which is 3*7=3*(2^3-1).
		 * 
		 * So, we should keep doubling n, which represents the 2^1, 2^2, 2^3 part. Hence
		 * the while loop. The loop stops when it reaches to a cycle whose max time is
		 * bigger than the real time t, then we know that it has reached the last cycle.
		 * 
		 * And taking the second cycle as an example, 'time' 7 has 'value' 3, and the
		 * max time of the second cycle is 9. We find the relationship between them is 3
		 * = 9 - 7 + 1, which is why we print (3 * (n - 1) - t + 1) to get the output of
		 * 3 when t is 7.
		 * 
		 */
		long t = 6, n = 2;
		while (3 * (n - 1) < t) {
			n = 2 * n;
		}
		System.out.println((3 * (n - 1) - t + 1));

		/*
		 * Brute force approach. Exceeded Time limit
		 * 
		 * long time = 1; long value = 3; long cycles = 0; long userInput = 1; while
		 * (true) { if (value == 0) { value = cycles * 2; cycles = 0; // don't count the
		 * previous previous cycles in, reset it } if (time == userInput) { // if time
		 * matches the input, exit the loop break; } time++; value--; cycles++; }
		 * System.out.println("value " + value);
		 */
	}

}
