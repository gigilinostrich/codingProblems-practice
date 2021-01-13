
public class camelCase {

	public static void main(String[] args) {
	//	String s = "oneTwoThree"; // 3 
		String s = "saveChangesInTheEditor"; // 5
		
		int count = 1; // the first letter counts as one word in string before encountering uppercase
		
		for (int i = 0; i < s.length(); i++) {
			if (Character.isUpperCase(s.charAt(i))) {
				count++;
			}
		}
		System.out.println("total words " + count);
		
	}

}
