import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regexPatternIntroToDatabaseDay28 {
	// Print an alphabetically-ordered list of first names for every user with a
	// gmail account.
	// Each name must be printed on a new line.
	/*
	 * 6 riya riya@gmail.com julia julia@julia.me julia sjulia@gmail.com julia
	 * julia@gmail.com samantha samantha@gmail.com tanya tanya@gmail.com
	 * 
	 * julia julia riya samantha tanya
	 * 
	 */
	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int N = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		HashMap<String, String> firstNameEmailIDCopy = new HashMap<String, String>();

		for (int NItr = 0; NItr < N; NItr++) {
			String[] firstNameEmailID = scanner.nextLine().split(" ");

			String firstName = firstNameEmailID[0];
			String emailID = firstNameEmailID[1];
			firstNameEmailIDCopy.put(emailID, firstName);
// names can be duplicates let it be value, not keys cuz no duplicate keys are allowed
		}

		scanner.close();
// iterate over hashMap
		String regex = "@gmail.com";
// Create a Pattern object (compiled RegEx) and save it as 'p'
		Pattern p = Pattern.compile(regex);
		List<String> sortedNames = new ArrayList<String>();
		for (Map.Entry<String, String> e : firstNameEmailIDCopy.entrySet()) {
			String getNames = e.getValue();
			String getEmail = e.getKey();
			// We need a Matcher to match our compiled RegEx to a String
			Matcher m = p.matcher(getEmail);
			// if our Matcher finds a match
			if (m.find()) {
				sortedNames.add(getNames);
			}
		}
		Collections.sort(sortedNames);
		for (String s : sortedNames) {
			System.out.println(s);
		}

	}
}
