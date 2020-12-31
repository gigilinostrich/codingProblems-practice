
public class sherlockAndSquares {

	public static void main(String[] args) {
	
		// square integer: 1,4,9,16,25.....
		int a = 24;
		int b = 49;
		int inRangeCount = 0;
		// in range: 25,36,49 , return 3
		
		for (int i = 1; i <= (int)Math.sqrt(b) ; i++) {
			int squareInt = i * i;
			if (a <= squareInt && b >= squareInt) {
				inRangeCount++;
			}
		}
		System.out.println(inRangeCount);
	}

}
