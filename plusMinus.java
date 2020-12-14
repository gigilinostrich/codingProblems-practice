
public class plusMinus {

	public static void main(String[] args) {
		
		int [] arr = {1,1,0,-1,-1};
		
		int negCount = 0;
		int posCount = 0;
		int zeroCount = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] < 0) {
				negCount++;
			}
			else if (arr[i] > 0) {
				posCount++;
			}
			else {
				zeroCount++;
			}
		}
		System.out.println("neg count " +negCount);
		System.out.println("pos count " +posCount);
		System.out.println("zero count " + zeroCount);
		
		double negD = negCount/(double)arr.length;
		double posD = posCount/(double)arr.length;
		double zeroD = zeroCount/(double)arr.length;
		
		System.out.println("pos fraction " + String.format("%.06f", posD));
		System.out.println("neg fraction " + String.format("%.06f", negD));
		System.out.println("zero fraction " + String.format("%.06f", zeroD));
	}

}
