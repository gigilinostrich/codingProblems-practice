import java.util.*;
public class arrayPacking {
	/*
	 * 
	 * You are given an array of up to four non-negative integers, each less than
	 * 256.
	 * 
	 * Your task is to pack these integers into one number M in the following way:
	 * 
	 * The first element of the array occupies the first 8 bits of M; The second
	 * element occupies next 8 bits, and so on.
	 * 
	 * Return the obtained integer M.
	 * 
	 * Note: the phrase "first bits of M" refers to the least significant bits of M
	 * - the right-most bits of an integer. For further clarification see the
	 * following example.
	 * 
	 * Example
	 * 
	 * For a = [24, 85, 0], the output should be arrayPacking(a) = 21784.
	 * 
	 * An array [24, 85, 0] looks like [00011000, 01010101, 00000000] in binary.
	 * After packing these into one number we get 00000000 01010101 00011000 (spaces
	 * are placed for convenience), which equals to 21784.
	 * 
	 * 
	 * 
	 */
	public static void main(String[] args) {
		int [] a = {24,85,0};
		List <String> eightBits = new ArrayList<String>();
		for (int i = 0; i < a.length; i++) {
			eightBits.add(to8Bits(Integer.toBinaryString(a[i])));
		}
		
		String overAllBinary = "";
		
		for (int i = eightBits.size() - 1; i>= 0; i--) {
			overAllBinary+= eightBits.get(i);
		
		}
		
		System.out.println("result " + Integer.parseInt(overAllBinary, 2));
		
		
		
		
	}
	public static String to8Bits (String org) {
		StringBuilder sampleBi8 = new StringBuilder (org);
		int i = org.length();
		while(i < 8) {
			sampleBi8.insert(0, '0');
			
			i++;
		}
		
		return sampleBi8.toString();
	}
	

}
