
public class countingValley {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "UDDDUDUU"; // should output 1 valley 
		int altitude = 0;
		int count = 0;
		for (int i = 0; i < path.length(); i ++) {
			if(path.charAt(i)== 'U') {
				altitude ++;
				if(altitude ==0) {
					count++;
				}
			}
			else { // if D
				altitude--;
			}
		}
		System.out.println("Valley count is " + count);
	}

}
