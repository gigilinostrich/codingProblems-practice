import java.util.*;

public class viralAdvertising {

	public static void main(String[] args) {
		/*
		 * Day Shared Liked Cumulative 1 5 2 2 2 6 3 5 3 9 4 9 4 12 6 15 5 18 9 24
		 * return 24!!!!
		 * 
		 * on day 1, half of 5 people (floor (5/2) = 2 likes the ad and share it with 3
		 * of their friends on day 2, floor (5/2) * 3 = 6, 6 people recieved the ad each
		 * day, floor (recipients/2)
		 */
		int n = 5; // days
		int people = 5; // start off with 5 people
		int likes = 0; // storage
		// people values will change
		// likes will be cumulative
		while (n > 0) {				// new    prev
			likes += (people / 2); // likes = likes + (people/2)
			//new     previous
			people = (people / 2) * 3;

			n--;
		}
		System.out.println("likes " + likes);

	}

}
