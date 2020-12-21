import java.util.*;

public class electronicsShop {

	public static void main(String[] args) {
		// return the maximum that can be spent. If not possible return -1

		int[] keyboards = { 40, 50, 60 };
		int[] drives = { 5, 8, 12 };
		int b = 60; // budget
		// he can buy 40 keyboard + 12 usb drive = 52
		// he can buy 50 keyboard + 8 usb drive = 58
		// return 58
		int afford = 0;
		List<Integer> maxSum = new ArrayList<Integer>();
		// find the affordable sum, store them in array list
		for (int i = 0; i < keyboards.length; i++) {
			for (int j = 0; j < drives.length; j++) {
				afford = keyboards[i] + drives[j];

				if (afford <= b) {

					maxSum.add(afford);
				}
			}
		}

		for (int i = 0; i < maxSum.size(); i++) {
			
			if (!maxSum.contains(maxSum.get(i))) { // if the element does not exists, this means it was unaffordable
				System.out.println("not affordable ! returning -1"); 
			} else { // if exists, return the max affordable price
				System.out.println("max value is " + Collections.max(maxSum));
			}
		}

		// in function, return -1 here as default
	}

}
