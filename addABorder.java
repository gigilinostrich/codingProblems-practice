import java.util.*;
public class addABorder {

	public static void main(String[] args) {
		String[] picture = { "abc", "ded" };
		/*
		 * addBorder(picture) = ["*****", "*abc*", "*ded*", "*****"]
		 * 
		 * 
		 */
		StringBuilder str;
		List <String> result = new ArrayList<String>();
		for (int i = 0; i < picture.length; i++) {
			str = new StringBuilder(picture[i]);
			// for every string, add * in front and back
			str.insert(0, '*');
			str.insert(picture[i].length()+1, '*');
			result.add(str.toString()); // add the final string into list
		}
		StringBuilder stars = new StringBuilder();
		// every string in the array is the same size
		for (int i = 0; i < result.get(0).length(); i++) {
			stars.append('*'); // replace all characters in the string with *
		}
	
		result.add(0, stars.toString()); // add ***** in front of list
		result.add(result.size(), stars.toString() ); // add ***** in the end of list
		// copy everything into an array
		String [] resultArr = new String [result.size()];
		for (int i = 0; i < result.size(); i++) {
			resultArr[i] = result.get(i);
		}
		for (int i = 0; i < resultArr.length; i++) {
			System.out.println(resultArr[i]);
		}
	}

}
