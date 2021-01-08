
public class reversedParentheses {

	public static void main(String[] args) {
		String inputString = "foo(bar(baz))blim"; // foobazrabblim
		  StringBuilder str = new StringBuilder(inputString);
		    int start, end;
		    while(str.indexOf("(") != -1){ // as long as ( exists
		        start = str.lastIndexOf("("); // look for the inner (
		        end = str.indexOf(")", start); // look for )). Marks the end of reversing 
		        // within the inner (), reverse the string
		        str.replace(start, end + 1, new StringBuilder(str.substring(start+1, end)).reverse().toString());
		    }
		  
		    System.out.println(str); // print result

	}

}
