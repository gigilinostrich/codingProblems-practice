
public class compression {

	public static void main(String[] args) {
		String s = "abaasass"; // aba2sas2
		String result = "";
		for (int i = 0; i < s.length(); i++) {

			// Counting occurrences of s[i]
			int count = 1;
			while (i + 1 < s.length() && s.charAt(i) == s.charAt(i + 1)) {
				i++;
				count++;
			}
			if (count > 1) {
			
				result += s.charAt(i);
				result += Integer.toString(count);
			} else {
				result += s.charAt(i);
				
			}
		}
		System.out.println(result);

	}

}
