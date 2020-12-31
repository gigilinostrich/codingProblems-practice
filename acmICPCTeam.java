import java.math.BigInteger;

public class acmICPCTeam {

	public static void main(String[] args) {

		String [] topics = {"10101","11110","00010"};
	/*
		Members Subjects
		(1,2)   [1,2,3,4,5]
		(1,3)   [1,3,4,5]
		(2,3)   [1,2,3,4]
	 */
		BigInteger[] bi = new BigInteger[topics.length];
		// Because if you look the given constraint n and m value can go up to 500 character
		//string in binary which will be a huge number and integer (primitive int) will not be able to handle it. 
		//that is the reason i have used BigInteger and it also provides various inbuilt functions 
		//and one function bitCount() also i have not written , its there already which helped me to write less. 
		for (int i = 0; i < topics.length; i++) {
		// 2 is its a radix to inform BigInteger that we are dealing with binary, which is base 2. 
			bi[i] = new BigInteger(topics[i],2);
		}
		int maxTopic = 0;
		int teamCount = 0;
		for (int i = 0; i < topics.length-1; i++) { // check each and every pair
			for (int j = i+1; j < topics.length; j++) {
			BigInteger iUj = bi[i].or(bi[j]); // take the union
			int bitCount = iUj.bitCount(); // count the total binary OR output
			if (bitCount > maxTopic) {
				maxTopic = bitCount;
				teamCount = 1; // first time we got the team
			}
			else if (bitCount == maxTopic) {
				teamCount++;
			}
			}
		}
		int [] result = {maxTopic,teamCount};
	}

}
