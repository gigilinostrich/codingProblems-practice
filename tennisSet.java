
public class tennisSet {
	/*
	 * In tennis, the winner of a set is based on how many games each player wins.
	 * The first player to win 6 games is declared the winner unless their opponent
	 * had already won 5 games, in which case the set continues until one of the
	 * players has won 7 games.
	 * 
	 * Given two integers score1 and score2, your task is to determine if it is
	 * possible for a tennis set to be finished with a final score of score1 :
	 * score2.
	 * 
	 * Example
	 * 
	 * For score1 = 3 and score2 = 6, the output should be tennisSet(score1, score2)
	 * = true.
	 * 
	 * Since player 1 hadn't reached 5 wins, the set ends once player 2 has won 6
	 * games.
	 * 
	 * For score1 = 8 and score2 = 5, the output should be tennisSet(score1, score2)
	 * = false.
	 * 
	 * Since both players won at least 5 games, the set would've ended once one of
	 * them won the 7th one.
	 * 
	 * For score1 = 6 and score2 = 5, the output should be tennisSet(score1, score2)
	 * = false.
	 * 
	 * This set will continue until one of these players wins their 7th game, so
	 * this can't be the final score.
	 * 
	 * 
	 * 
	 */
	public static void main(String[] args) {
		System.out.println(tennisSetF(3, 4));
	}

	public static boolean tennisSetF(int score1, int score2) {
		// get the max and min between two players' scores
		int w = Math.max(score1, score2), l = Math.min(score1, score2);
		// if max is equal to 6 and min is less than 5 OR
		// max is equal to 7 AND min is equal to 5 or 6
		return w == 6 && l < 5 || w == 7 && (l == 5 || l == 6);
	}

}
