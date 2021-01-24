
public class validTime {
	/*
	 * Check if the given string is a correct time representation of the 24-hour
	 * clock.
	 * 
	 * Example
	 * 
	 * For time = "13:58", the output should be validTime(time) = true; For time =
	 * "25:51", the output should be validTime(time) = false; For time = "02:76",
	 * the output should be validTime(time) = false.
	 * 
	 * 
	 * 
	 */
	public static void main(String[] args) {
		String time = "02:76";
		// 24- hour clock: hour (00-23) min (00 - 59)
		
		String hr = time.substring(0,2);
		String min = time.substring(3,time.length());
		if ((Integer.parseInt(hr) >= 0 && Integer.parseInt(hr) <= 23) &&
			(Integer.parseInt(min) >= 0 && Integer.parseInt(min) <= 59)	) {
			System.out.println("return true");
		}
		else {
			System.out.println("return false");
		}
	}

}
