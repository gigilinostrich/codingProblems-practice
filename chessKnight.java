
public class chessKnight {
	/*
	 * Given a position of a knight on the standard chessboard, find the number of
	 * different moves the knight can perform.
	 * 
	 * The knight can move to a square that is two squares horizontally and one
	 * square vertically, or two squares vertically and one square horizontally away
	 * from it. The complete move therefore looks like the letter L. Check out the
	 * image below to see all valid moves for a knight piece that is placed on one
	 * of the central squares.
	 * 
	 * For cell = "a1", the output should be chessKnight(cell) = 2.
	 * 
	 * For cell = "c2", the output should be chessKnight(cell) = 6.
	 */
	public static void main(String[] args) {
		String cell = "g8"; // 3
		char horizontalChar = cell.charAt(0);
		char verticalNum = cell.charAt(1);
		
		// do boundary check
		// 8 cases on 4 borders (2 of each)
		int moves = 0;
		// left side
		//upper half  
		if (horizontalChar - 2 >= 'a' && verticalNum + 1 <= '8') {
			moves ++;
		}
		if (horizontalChar - 1 >= 'a' && verticalNum + 2 <= '8') {
			moves ++;
		} // lower half
		if (horizontalChar - 1 >= 'a' && verticalNum - 2 >= '1') {
			moves ++;
		}
		if (horizontalChar - 2 >= 'a' && verticalNum - 1 >= '1') {
			moves ++;
		}
		// right side up
		if (horizontalChar + 2 <= 'h' && verticalNum + 1 <= '8') {
			moves ++;
		}
		if (horizontalChar + 1 <= 'h' && verticalNum + 2 <= '8') {
			moves ++;
		} // right side down
		if (horizontalChar + 1 <= 'h' && verticalNum - 2 >= '1') {
			moves ++;
		}
		if (horizontalChar + 2 <= 'h' && verticalNum - 1 >= '1') {
			moves ++;
		}
		
		System.out.println(moves);
	}

}
