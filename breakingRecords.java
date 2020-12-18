
public class breakingRecords {

	public static void main(String[] args) {
		//Given the scores for a season, find and print the number of times 
		//Maria breaks her records for most and least points scored during the season
		int [] scores = {10,5,20,20,4,5,2,25,1};
		// we only focus on those temps. IF recent temp either went up or down, update the counts
		int tempL = scores[0]; // start off the first score
		int tempH = scores[0]; // start off the first score
		int countLow = 0;
		int countHigh = 0;
		int [] resultRecords = new int[2]; // index 0 for best records, index 1 for least records
		for (int i = 0; i < scores.length-1; i++) {
		if (scores[i] > scores[i+1]) {// when the new score is lower
			if(tempL > scores[i+1]) { // if temp is greater than the score
				tempL = scores[i+1]; // update temp into lower score
				countLow++;
			}
		}
		else if (scores[i] < scores[i+1]) { // when the new score is higher 
			if(tempH < scores[i+1]) { // if temp is lower than the score
				tempH = scores[i+1]; // update temp into a higher score
				countHigh++;
			}
		}
		// if both adjacement elements are equal, do nothing
	}
		resultRecords[0] = countHigh;
		resultRecords[1] = countLow;
System.out.println(resultRecords[0]);
System.out.println(resultRecords[1]);
}
}
