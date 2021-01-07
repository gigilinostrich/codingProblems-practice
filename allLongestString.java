import java.util.*;

public class allLongestString {

	public static void main(String[] args) {
		String[] inputArray = { "abc", "eeee", "adcd", "dcd" };

		int maxValue = Integer.MIN_VALUE;
		List<String> longStrList = new ArrayList<String>();
		for (int i = 0; i < inputArray.length; i++) {
			if (maxValue < inputArray[i].length()) {
				maxValue = inputArray[i].length();
			}
		}
		for (int i = 0; i < inputArray.length; i++) {
			if (inputArray[i].length() == maxValue) {
				longStrList.add(inputArray[i]);
			}
		}

		String[] longStr = new String[longStrList.size()];
		for (int i = 0; i < longStrList.size(); i++) {
			longStr[i] = longStrList.get(i);
		}
		for (int i = 0; i < longStr.length; i++) {
			System.out.println(longStr[i]);
		}

	}

}
