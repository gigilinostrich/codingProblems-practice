import java.util.*;
public class nestedLogicDay26LibraryFine {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		// enter d1, m1, y1
		int d1 = input.nextInt();
		int m1 = input.nextInt();
		int y1 = input.nextInt();
		// enter d2, m2, y2
		int d2 = input.nextInt();
		int m2 = input.nextInt();
		int y2 = input.nextInt();
		
		input.close();
		
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
