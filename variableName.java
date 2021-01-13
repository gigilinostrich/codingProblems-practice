
public class variableName {

	public static void main(String[] args) {
		/*
		 * Correct variable names consist only of English letters, digits and
		 * underscores and they can't start with a digit.
		 * 
		 * Check if the given string is a correct variable name.
		 * 
		 * 
		 * For name = "var_1__Int", the output should be variableName(name) = true; For
		 * name = "qq-q", the output should be variableName(name) = false; For name =
		 * "2w2", the output should be variableName(name) = false.
		 * 
		 * 
		 */
		String s = "var_1__Int";
		String pattern = "[a-zA-Z_][a-zA-Z0-9_]*";
		if (s.matches(pattern)) {
			System.out.println("return true");
		}
		// return false;

	}

}
