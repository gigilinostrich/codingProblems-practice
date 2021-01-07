
public class encryption {

	public static void main(String[] args) {
		// s = chillout output: clu hit io
		// s = haveaniceday output: hae and via ecy

		String s = "feedthedog";
		// remove spaces from the string
		s = s.replaceAll("\\s+", "");
		// count how many characters are in the string
		int characterCount = 0;
		for (int i = 0; i < s.length(); i++) {
			characterCount++;
		}
		// take square root of character Count
		double squareRootValue = Math.sqrt(characterCount);
		// take ceils and floor of square root value
		int column = (int) Math.ceil(squareRootValue); // row
		int row = (int) Math.floor(squareRootValue);
		// multiple row and column to see if it's >= characterCount
		// if row x col < characterCount, then change the lower value to the high value
		// (2 - > 3) for column
		if (row * column < characterCount) {
			row = column;
		}
		char[][] charArrange = new char[row][column];
		// inserting characters into 2d array
		int k = 0; // string index
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				if (k < s.length()) { // inserting each characters from s as if there is a single for loop
					charArrange[i][j] = s.charAt(k);
					k++; // update index
				}

			}

		}
		String encodedStr = "";
		for (int i = 0; i < column; i++) {
			for (int j = 0; j < row; j++) {
				int index = i + j * column; // to prevent from extra white spaces
				System.out.println("index " + index);
				if (index < s.length()) {
					encodedStr += charArrange[j][i];
				}

			}
			encodedStr += " ";
		}

		System.out.println(encodedStr.trim()); // get rid of leading and trailing white spaces

	}

}
