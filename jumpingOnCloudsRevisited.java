
public class jumpingOnCloudsRevisited {

	public static void main(String[] args) {
		
	
		int [] c = {1, 1, 1, 0, 1, 1, 0, 0, 0, 0}; // outputs 80
		int e = 100; // energy level
		int k = 3; // jump size 	
		int i = k;
	
		while (true) { 
			if (i < c.length) {
				if (c[i] == 0) { // landed on 0, safe
					e--;
				}
				else { // landed on 1, damages
					e--;
					e-=2;
				}
			}
			else { // if greater than the array size
				// note: since it's i+=k, you don't have to do (i+k)%c.length
				i = i % c.length;// keep moving in circular path
				if (c[i] == 0) { // do the power thing again
					e--;
				}
				else {
					e--;
					e-=2;
				}
			}
			if (i == 0) { // back to starting position
				break; // game over
			}
		i += k;
		}
		System.out.println("e: " + e);
		
	
	}

}
