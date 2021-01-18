
public class growingPlant {

	public static void main(String[] args) {
		/*
		 * Caring for a plant can be hard work, but since you tend to it regularly, you
		 * have a plant that grows consistently. Each day, its height increases by a
		 * fixed amount represented by the integer upSpeed. But due to lack of sunlight,
		 * the plant decreases in height every night, by an amount represented by
		 * downSpeed.
		 * 
		 * Since you grew the plant from a seed, it started at height 0 initially. Given
		 * an integer desiredHeight, your task is to find how many days it'll take 
		 * 
		 * 
		 * for the plant to reach this height For upSpeed = 100, downSpeed = 10, and
		 * desiredHeight = 910, the output should be growingPlant(upSpeed, downSpeed,
		 * desiredHeight) = 10
		 * 
		 * # 	Day 	Night
			1 	100 	90
			2 	190 	180
			3 	280 	270
			4 	370 	360
			5 	460 	450
			6 	550 	540
			7 	640 	630
			8 	730 	720
			9 	820 	810
			10 	910 	900
		 * 
		 * 
		 * 
		 * 
		 */
		int upSpeed = 100;
		int downSpeed = 10;
		int desiredHeight = 910; // 5
	/*	u		d		dh		dh-u		rate		days
	 * 	100		10		910		810			90			9 + 1
	 * 	10		9		4		-6			1			0 + 1
	 * 	5		2		7		2			3			0.66 + 1 (2)
	 */
	int day = Math.max(0,(int)Math.ceil((double)(desiredHeight - upSpeed)/(upSpeed - downSpeed))) + 1;
	System.out.println(day);
}
}
