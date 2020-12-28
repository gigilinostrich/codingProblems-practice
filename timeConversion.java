
public class timeConversion {

	public static void main(String[] args) {
		// 12:45:54PM
		// 12:45:54
		String s = "12:45:54PM"; 
		String hh = s.substring(0, 2);
		String theRestAreTheSame = s.substring(2, 8);

		if (hh.contains("12")) {
			hh = "00";
		}
		if (s.contains("PM")) {

			int hhConvertedInt = Integer.parseInt(hh);
			int hhConvertedFinal = hhConvertedInt + 12;
			String hhFinal = Integer.toString(hhConvertedFinal);
			System.out.println(hhFinal + theRestAreTheSame);
		} else {
			System.out.println(hh + theRestAreTheSame);
		}
	}

}
