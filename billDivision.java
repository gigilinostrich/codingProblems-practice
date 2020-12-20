
public class billDivision {

	public static void main(String[] args) {

		int k = 1; // Anna didn't eat at index i
		int[] bill = { 3, 10, 2, 9 }; // items ordered
		int b = 7; // amount of money that Brian charged Anna for her share of the bill.

		int bCharged = 0; // every items
		int bActual = 0; // every item including Anna's excluded meal

		for (int i = 0; i < bill.length; i++) {

			bCharged += bill[i];

			if (i != k) {
				bActual += bill[i];
			}

		}
		// start spliting by persons
		int bChargedFinal = bCharged / 2;
		int bActualFinal = bActual / 2;
		int difference = bChargedFinal - bActualFinal;

		if (bActualFinal == b) { // if the bill is fairly split
			System.out.println("Bon Appetit");
		} else {
			System.out.println(difference);
		}
	}

}
