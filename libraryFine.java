
public class libraryFine {

	public static void main(String[] args) {

		// returned date
		int d1 = 2;
		int m1 = 7;
		int y1 = 1014;
		// due date
		int d2 = 1;
		int m2 = 1;
		int y2 = 1014;

		int fine = 0;
		if (d1 > d2 && m1 == m2 && y1 == y2) { // few days late
			fine = 15 * (d1 - d2);
			System.out.println(fine);
		} else if (m1 > m2 && y1 == y2) { // few months late
			fine = 500 * (m1 - m2);
			System.out.println(fine);
		} else if (y1 > y2) { // years late
			fine = 10000;
			System.out.println(fine);
		} else { // on time
			fine = 0;
			System.out.println(fine);
		}
	}

}
