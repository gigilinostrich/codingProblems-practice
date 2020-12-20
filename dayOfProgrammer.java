import java.util.*;

public class dayOfProgrammer {

	public static void main(String[] args) {
		int year = 1918;
		// 26.09.1918

		int jan = 31;
		int febNormal = 28;
		if (year >= 1700 && year <= 1917) {
			if (year % 4 == 0) { // juilian calendar 1700 to 1917 leap years
				System.out.println("juilian calendar. From 1700 to 1917");
				febNormal = 29;
			}
		} else if (year >= 1919) {  // Greg cal, since 1919 leap years
			if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
				System.out.println("greg calendar. Since 1919");
				febNormal = 29;
			}
		}
		System.out.println("feb is " + febNormal);
		int mar = 31;
		int apr = 30;
		int may = 31;
		int jun = 30;
		int jul = 31;
		int aug = 31;

		int total = jan + febNormal + mar + apr + may + jun + jul + aug;
		System.out.println("total " + total);
		int finalTotal = 256 - total;
		if (year == 1918) { // 256 + 13   jan 31 -> feb 14
			int finalTotal1918 = 269 - total;
			String finalTotalStr = Integer.toString(finalTotal1918);
			String resultStr = finalTotalStr + ".09." + year;
			System.out.println(resultStr);
		}
		String finalTotalStr = Integer.toString(finalTotal);
		String resultStr = finalTotalStr + ".09." + year;
		System.out.println(resultStr);
	}

}
