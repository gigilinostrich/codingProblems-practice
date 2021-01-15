import java.util.*;

public class strongPassword {

	public static void main(String[] args) {
		// length must be at least 6
		// at least one digit
		// at least one lowercase
		// at least one uppercase
		// at least one special character !@#$%^&*()_+
		
		// count upper, lower, digit, special case 
		// store all the counts into a list
		// if count == 0, we need to increment the addMin, meaning min numbers need to be added
		String password = "aB$9";
		String special = "[a-zA-Z0-9]*";
		List<Integer> counts = new ArrayList<Integer>();
		int addMinCount = 0;
		int specialCount = 0;
		
		if (!password.matches(special)) {
			// when there are special characters
			specialCount++;

		}

		int upperCount = 0;
		int lowerCount = 0;
		int digitCount = 0;
		for (int i = 0; i < password.length(); i++) {

			char c = password.charAt(i);

			if (Character.isUpperCase(c)) {
				upperCount++;
			} else if (Character.isLowerCase(c)) {
				lowerCount++;

			} else if (Character.isDigit(c)) {
				digitCount++;

			}

		}

		counts.add(upperCount);
		counts.add(lowerCount);
		counts.add(digitCount);
		counts.add(specialCount);

		System.out.println(counts);

		for (int i : counts) {
			if (i == 0) {
				addMinCount++;
			}
		}
		System.out.println("addMinCount " + addMinCount);
		int totalStrLength = password.length() + addMinCount;
		int diff = 0;
		if (totalStrLength < 6) {
			diff = 6 - totalStrLength;
			addMinCount += diff;
		}
		System.out.println(addMinCount);
	}

}
