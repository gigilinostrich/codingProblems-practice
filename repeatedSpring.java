
public class repeatedSpring {

	public static void main(String[] args) {
		String str = "aba"; // initial string
		int n = 10; // the first characters of the repeated string "abaabaabaa"
		long initialCountA = 0; // counting 'a' for initial string "aba", which is 2
		long extraCountA = 0; // counting 'a' for extra string, which is 'a', 1
		
		// check frequency of 'a' in the initial string
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == 'a') {
				initialCountA++;
			}
		}
		System.out.println(initialCountA);
	int completeStringNum = n / str.length(); // quotient means completed string, you will get 3
	int extraStringNum = n % str.length(); // remainder means an extra string that will make up the n
	// check frequency of 'a' in the extra substring
	for (int i =0; i < extraStringNum; i++) {
		 if(str.charAt(i) == 'a') {
			extraCountA++;
		 }
		
	}
	System.out.println(extraCountA);
	// quotient * (freq of 'a' in initial string) + (frequency of 'a' in substring of length r)
	long result = completeStringNum * initialCountA + extraCountA;
	System.out.println(result);
  }
}
