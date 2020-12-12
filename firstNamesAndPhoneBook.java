import java.util.*;

public class firstNamesAndPhoneBook {
	public static void main(String[] argh) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		/*
		 * (input) 3 // inputting in the hashMap sam 99912222 tom 11122222 harry
		 * 12299933 sam edward harry
		 */
		/*
		 * (output) sam=99912222 // printing what is in the hashMap Not found
		 * harry=12299933
		 */
		HashMap<String, Integer> m = new HashMap<String, Integer>();
		for (int i = 0; i < n; i++) {
			String name = in.next();
			int phone = in.nextInt();
			// Write code here
			m.put(name, phone);
		}
		// System.out.println(m);
		// process each query and print key=value
		while (in.hasNext()) {
			String s = in.next();
			// Write code here
			// if keys are found in the map
			if (m.containsKey(s)) {
				System.out.println(s + "=" + m.get(s));
			} else {
				System.out.println("Not found");
			}

		}

		in.close();
	}
}
