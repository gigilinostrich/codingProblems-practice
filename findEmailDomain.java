import java.util.regex.*;

public class findEmailDomain {

	public static void main(String[] args) {
		String regex = "([\\w-]+\\.)+[\\w-]{2,4}$";
		String address = "fully-qualified-domain@codesignal.com"; // codesignal.com
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(address);
		
		if (m.find()) {
			System.out.println(m.group());
		}
		

	}

}
