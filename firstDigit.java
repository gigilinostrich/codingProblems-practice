
public class firstDigit {

	public static void main(String[] args) {
		// Find the leftmost digit that occurs in a given string.
		String inputString = "s1fdfgsd3b";
		char answer = '0';
		for (int i = 0; i < inputString.length(); i++) {
			if (Character.isDigit(inputString.charAt(i))) {
				answer = inputString.charAt(i);
				break;
			}
		}
		System.out.println(answer);

	}

}
