import java.util.*;

public class lisaWorkBook {

	public static void main(String[] args) {
		int n = 5;
		int k = 3; // the max number of problems can each page have
		int [] arr = {4,2,6,1,10}; // index is number of numbers for each chapter
		int page = 1; // starting with page one
		int specialProblemsFound = 0; // page number matches the problem number
		for (int i = 1; i <= n; i++) { // loop through chapters
			for (int j = 1; j <= arr[i-1]; j++) {	// looping through problems
				// note: the order of if statement does matters!!!!
				if (j == page) { // if the problem matches the page number
					specialProblemsFound++;
				}	
				if ((j % k == 0) || j == arr[i-1]) { // either the number of problems met its max
					// or divisible by k , turn the page
					page++;
					
				}
				
			}
		
		}
		
		System.out.println(specialProblemsFound);
	}

}
