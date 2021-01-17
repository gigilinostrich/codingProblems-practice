import java.util.regex.*;
public class beautifulBinaryString {

	public static void main(String[] args) {
		/*
		 * Alice has a binary string. She thinks a binary string is beautiful if and
		 * only if it doesn't contain the substring 010.
		 * 
		 * In one step, Alice can change a 0 to a 1
		 * 
		 * or vice versa. Count and print the minimum number of steps needed to make
		 * Alice see the string as beautiful.
		 * 
		 * For example, if b = 010 Alice's string is she can change any one element and have a
		 * beautiful string.
		 */
		String b = "0100101010";
		char [] bArr = new char [b.length()];
		int deletion = 0;
		
		for (int i = 0; i < b.length(); i++) {
			bArr [i] = b.charAt(i);
		}
		for (int i = 0; i < bArr.length-2; i++) {
			if (bArr[i] == '0' && bArr[i+1] == '1' && bArr[i+2] == '0') {
				deletion++;
				bArr[i+2] = '1'; // mark 1 to prevent from reading the same value again
			}
		}
		System.out.println(deletion);
	}

}
