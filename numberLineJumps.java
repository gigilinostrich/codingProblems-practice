
public class numberLineJumps {

	public static void main(String[] args) {
		// two kangaroos need to make the finish line together
		// print YES if those two can meet up, else print NO

		// use physic approach: velocity = distance/ time, change to velocity = distance/jump
		// rearrange the formula: d = v * j, both kangaroos should do same number of jumps at the same time
		// x1 + v1 * j = x2 + v2 * j, now simpfy the equation
		// v1*j - v2*j = x2 - x1
		// j(v1 - v2) = x2 - x1
		// j = x2-x1 / v1 - v2;
		// j should be int, not float. Float means there are no same jumps
		int x1 = 0; // kangaroo1 starting position
		int v1 = 3; // kangaroo1 's rate

		int x2 = 4; // kangaroo2 starting position
		int v2 = 2; // kangaroo2 's rate

		if (v1 > v2) {// do validation , v1 must be greater than v2, according to the description
			if ((x2 - x1) % (v2 - v1) == 0) { // if j is an int
				System.out.println("YES");
			} else { // if j is a float
				System.out.println("NO");
			}

		}

	}

}
