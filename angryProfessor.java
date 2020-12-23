
public class angryProfessor {

	public static void main(String[] args) {
		//Given the arrival time of each student and a threshhold number
		//of attendees, determine if the class is cancelled. Return YES if class is canceled, else NO 
		// if (arrivalTime <= 0) student arrives early or on time
		// if (arrivalTime > 0) student arrives late
		int [] a = {-1, -3, 4, 2};
		int k = 3; // threshold of number of attendes
		// return YES
		int countGood = 0; // the professor only cares about good students
	
		for (int i = 0; i < a.length; i++) {
			if (a[i] <= 0) {
				countGood++;
			}
		}
		if (countGood < k) { // of less than threshold, class will be cancelled
			System.out.println("YES");
		}
		else { // else not cancelled
			System.out.println("NO");
		}
		
	}

}
