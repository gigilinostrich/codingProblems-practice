import java.util.*;
public class HalloweenSale {

	public static void main(String[] args) {
		int p = 20; // unit cost
		int d = 3; // units each iteration
		int m = 6; // the min price
		int s = 70; // budget
		int count = 0; // how many games you can buy, the counter variable
		
		while(s >= p) { // as long as you have money to afford the first game, which is the p, the intial price
			count ++; // increase counter if you can still afford
			s -= p; // budget - current price
			p = Math.max(p-d,m); // p changed into d price lower, if exceeds the min, keep on using m value 
		}
		System.out.println("max games you can buy is " + count);
}
}
