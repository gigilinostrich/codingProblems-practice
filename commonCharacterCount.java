import java.util.*;
public class commonCharacterCount {

	public static void main(String[] args) {
		String s1 = "aabcc";
		String s2 = "adcaa";
		// output 3   2 a and 1 c
		  int count = 0;
		    for(int i = 0; i < s1.length(); i++){ // assume 2 string are the same size
		      // if string 2 contains common character as string 1 does
		    	if(s2.contains(String.valueOf(s1.charAt(i)))){
		            count++; // increase
		        // delete common character as s1 have, then compare the left overs
		            s2 = s2.replaceFirst(String.valueOf(s1.charAt(i)), "");
		        }
		    }
		    System.out.println(count);
		    //adcaa
		    //dcaa
		    //dca
	}

}
