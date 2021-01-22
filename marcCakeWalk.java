import java.util.*;
public class marcCakeWalk {

	public static void main(String[] args) {
			
		Integer [] calories = {819 ,701 ,578, 403 ,50, 400, 983, 665, 510, 523, 696, 532,
				51, 449, 333, 234, 958, 460 ,277, 347, 950 ,53, 123, 227, 646, 190, 938,
				61, 409, 110, 61, 178, 659, 989, 625, 237, 944, 550, 954, 439};
		//    59715404338867
	// sort array in decreasing order to find the min miles Marc has to walk
		Arrays.sort(calories,  Collections.reverseOrder());
		
		long miles = 0;
	
		for (int i = 0; i < calories.length; i++) {
			// given formula
			miles += ((long) (Math.pow((long) 2, (long) i)) * calories[i]); ;
		}
		System.out.println(miles);
		
	}

}
