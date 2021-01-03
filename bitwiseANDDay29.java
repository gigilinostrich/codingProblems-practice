import java.util.*;

public class bitwiseANDDay29 {
	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int t = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int tItr = 0; tItr < t; tItr++) { // test cases
			String[] nk = scanner.nextLine().split(" ");

			int n = Integer.parseInt(nk[0]);
			int k = Integer.parseInt(nk[1]);
			List<Integer> setCopy = new ArrayList<Integer>();
			HashSet<Integer> bitsStorage = new HashSet<Integer>();
			for (int i = 1; i <= n; i++) { // get set and store in the array list
				setCopy.add(i);
			}
			for (int i = 0; i < setCopy.size(); i++) { // get all pairs
				for (int j = i + 1; j < setCopy.size(); j++) {
					if ((setCopy.get(i) & setCopy.get(j)) < k) { // if bitwise AND is less than k
						bitsStorage.add((setCopy.get(i) & setCopy.get(j))); // store all results in hashset, avoid
																			// duplicates
					}
				}
			}
			System.out.println(Collections.max(bitsStorage)); // print the max possiblee value
		}

		scanner.close();
	}

}
