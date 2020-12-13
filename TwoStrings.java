import java.util.*;
public class TwoStrings {

	public static void main(String[] args) {
	// goal: compare two strings and see if they have a common substring ( can be small as one character)
		String str1 = "hi";
		String str2 = "worldh";
		HashSet <Character> hs1 = new HashSet <Character>(); // store str1
		HashSet <Character> hs2 = new HashSet <Character>(); // store str2
		for (int i = 0; i < str1.length(); i++) { // store all the str 1 characters ( no duplicates) in hashset1
			hs1.add(str1.charAt(i));
		}
		for (int i = 0; i < str2.length(); i ++) { //// store all the str 2 characters ( no duplicates) in hashset2
			hs2.add(str2.charAt(i));
		}
		// check both hashsets contents
		System.out.println("hs1 " + hs1);
		System.out.println("hs2 " + hs2);
// iterating through hashset 2, use hashset1 to compare hashset2 each elements
	for (char c : hs2 ) {
		boolean hs1C = hs1.contains(c);
		if (hs1C == true) { // common substring is found
			System.out.println("YES");
			
		}
		else { // nothing in common 
			System.out.println("NO");
			
		}
		
	}

}
	/* outputs
	hs1 [h, i]
			hs2 [r, d, w, h, l, o]
			NO
			NO
			NO
			YES
			NO
			NO
*/
	
}
// code in hackerrank
/*
public class Solution {

    // Complete the twoStrings function below.
    static String twoStrings(String s1, String s2) {
HashSet <Character> hs1 = new HashSet <Character>();
        HashSet <Character> hs2 = new HashSet <Character>();
        for (int i = 0; i < s1.length(); i++) {
            hs1.add(s1.charAt(i));
        }
        for (int i = 0; i < s2.length(); i ++) {
            hs2.add(s2.charAt(i));
        }
        for (char c : hs2 ) {
        boolean hs1C = hs1.contains(c);
        if (hs1C == true) {
            return "YES";
        }  
    }
    return "NO";  
    }
// in main 
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s1 = scanner.nextLine();

            String s2 = scanner.nextLine();

            String result = twoStrings(s1, s2);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
*/