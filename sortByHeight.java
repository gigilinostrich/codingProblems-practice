import java.util.*;

public class sortByHeight {

	public static void main(String[] args) {
	int [] a = {-1, 150, 190, 170, -1, -1, 160, 180};
	// output a= [-1, 150, 160, 170, -1, -1, 180, 190] // avoid the -1!!
	// doing one for loop is not enough
	for (int i = 0; i < a.length; i++) {
		for (int j = i + 1; j < a.length; j++) { // to print EVEN and NEAT rows and columns, not one of them missing
			if (a[i] > a[j] && a[i] != -1 && a[j] != -1) { // ignore -1, do basic swapping
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
	}
	for (int i = 0; i < a.length; i++) {
		System.out.println(a[i]);
	}


}
}