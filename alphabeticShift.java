
public class alphabeticShift {

	public static void main(String[] args) {
		/*
		 * Given a string, your task is to replace each of its characters by the next
		 * one in the English alphabet; i.e. replace a with b, replace b with c, etc (z
		 * would be replaced by a).
		 * 
		 * inputString = "crazy", the output should be alphabeticShift(inputString) = "dsbaz"
		 * 
		 */
		String inputString = "crazy";
		String newStr = "";
		
		for (int i = 0; i < inputString.length(); i++) {
			
			if (inputString.charAt(i) != 'z'){
				char newC = inputString.charAt(i);
				newC++;
				newStr += newC;
			}
			else {
				char newC = inputString.charAt(i);
				newC = 'a';
				newStr += newC;
			}
		}
		System.out.println(newStr);
		
	}

}
