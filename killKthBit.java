
public class killKthBit {

	public static void main(String[] args) {
		// 37
		String originalBinary = Integer.toBinaryString(37);
		String originalBinaryKth = Integer.toBinaryString(37).substring(3, 4);
		
		StringBuilder binaryNew = new StringBuilder(originalBinary);
		if (originalBinaryKth.contains("1")) {

			binaryNew.setCharAt(3, '0');
			System.out.println(Integer.parseInt(binaryNew.toString(), 2));

		} else {
			System.out.println(Integer.parseInt(originalBinary, 2));
		}
		// shorthand:  n & ~(1 << (k - 1));
	}

}
