import java.util.*;

public class luckBalance {
	/*
	 * Lena is preparing for an important coding competition that is preceded by a
	 * number of sequential preliminary contests. Initially, her luck balance is 0.
	 * She believes in "saving luck", and wants to check her theory. Each contest is
	 * described by two integers, L[i] and T[i]:
	 *  
	 * L[i] is the amount of luck associated with a contest. If Lena wins the contest,
	 * her luck balance will decrease by L[i]; if she loses it, her luck balance will
	 * increase by L[i]. T[i] denotes the contest's importance rating. It's equal to 1 if the
	 * contest is important, and it's equal to 0 if it's unimportant.
	 *  
	 * If Lena loses no more than k important contests, what is the maximum amount of
	 * luck she can have after competing in all the preliminary contests? This value
	 * may be negative.
	 * 
	 * 
	 */
	public static void main(String[] args) {

		int k = 1; // can't go over k important (1) contests
		int[][] contest = { { 5, 1 }, { 1, 1 }, { 4, 0 } }; // 8

		int row = contest.length;
		int column = contest[0].length;
		int bal = 0;
		List<Integer> importantLuckL = new ArrayList<Integer>();
		for (int i = 0; i < row; i++) {
			for (int j = 1; j < column; j++) { // to prevent from printing duplicates ( j = 1)

				int luck = contest[i][0];
				int importance = contest[i][1];
				// only add luck points from important contest
				if (importance == 1) {
					importantLuckL.add(luck);
				} else if (importance == 0) {
					// doesn't count towards k, just add to balance
					bal += luck;
				}
			}
		}
		System.out.println("bal with 0: " + bal);
// sort the list in descending order because we want to add many max numbers as possible no more than k 
		Collections.sort(importantLuckL, Collections.reverseOrder());
		System.out.println(importantLuckL);
		for (int i = 0; i < importantLuckL.size(); i++) {
			if (i < k) { // add max points to bal
				bal += importantLuckL.get(i);
			} else { // subtract min points from bal
				bal -= importantLuckL.get(i);
			}
		}
		System.out.println("bal after: " + bal);

	}

}
