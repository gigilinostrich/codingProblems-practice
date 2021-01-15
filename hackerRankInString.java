
import java.util.*;
import java.util.regex.*;
public class hackerRankInString {

	public static void main(String[] args) {
	//	rhbaasdndfsdskgbfefdbrsdfhuyatrjtcrtyytktjjt  NO
	// hackerworld NO
	// hereiamstackerrank YES
	// haacckkerannk NO
	// hccaakkerrannkk NO
		String goal = "[a-z]*h[a-z]*a[a-z]*c[a-z]*k[a-z]*e[a-z]*r[a-z]*r[a-z]*a[a-z]*n[a-z]*k[a-z]*";
		String s = "hereiamstackerrank";
				
		if (s.matches(goal)) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
		

}
}
