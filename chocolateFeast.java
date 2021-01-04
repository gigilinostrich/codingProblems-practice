
import java.util.*;
public class chocolateFeast {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int c = input.nextInt();
		int m = input.nextInt();
		input.close();
		
		int wrappersCount = 0;;
		int bars = n/c;
		int barsEatenTotal = 0;
		while (bars > 0 ) { // add until chocolate = 0
			barsEatenTotal += bars; 
			wrappersCount += bars; // counting number of chocolate (wrappers) as we go
			bars = wrappersCount /m; // number of wrappers turned
			wrappersCount = wrappersCount % m; // leftover wrappers
		}
		System.out.println("chocolate eaten " + barsEatenTotal);
	}

}
