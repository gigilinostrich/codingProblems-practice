
public class islpv4Address {

	public static void main(String[] args) {
		// four numbers
		// each number should not have leading zeros
		// 0 to 255
		// 250 - 255, 25[0-5]
		// 200 to 249, 2[0-4][0-9]
		// 100 to 199, 1[0-9][0-9]
		// 10 to 99 [1-9][0-9]
		// 0 to 9 [0-9]
		// String inputString = "172.16.254.1"; // true
		String inputString = "172.316.254.1"; // false
		// String inputString = ".254.255.1"; // false
		String pattern = "25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[1-9][0-9]|[0-9]"; // leave no whitespaces
		String[] ips = inputString.split("\\."); // detect periods
		if (ips.length != 4) {
			System.out.println("return false");
		}
		for (String ip : ips) {
			if (!ip.matches(pattern)) {
				System.out.println("return false");
			}
		}
		System.out.println("return true");
	}

}
