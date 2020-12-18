import java.util.*;


class Difference {
  	private int[] elements;
  	public int maximumDifference;

	// Add your code here
  	Difference(int []elements){
  		this.elements = elements;
  	}
  	public void computeDifference() {
  		// find the max absolute difference between any two numbers
  		//store the result into maximumDifference instance variable
  		int result = 0;
  		HashSet <Integer> maxHs = new HashSet<Integer>();
  		for (int i = 0; i < elements.length; i++) {
  			for (int j = 0; j < elements.length; j++) {
  				result = Math.abs(elements[i] - elements[j]);
  	  			maxHs.add(result);
  			}
  			
  		}
  		maximumDifference = Collections.max(maxHs);
  	}

} // End of Difference class
public class scopeDay14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
	}

}
