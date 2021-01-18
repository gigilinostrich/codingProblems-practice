
public class loveLetter {

	public static void main(String[] args) {
		//abc		2
		//abcba		0
		//abcd		4
		//cba		2
		
		// compare first and last string and get its absolute value for each iteration 
		String s = "abcd";
		int count = 0;
		int last = s.length()-1; // last character of string
		int i = 0; // first character of string
		while (i < last) {
			count += Math.abs(s.charAt(i) - s.charAt(last));
			i++; // move to right
			last--; // move to left
		}
		System.out.println("count " + count);
		
	}

}
