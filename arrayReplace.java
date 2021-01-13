
public class arrayReplace {

	public static void main(String[] args) {
		// Given an array of integers, replace all the occurrences of elemToReplace with
		// substitutionElem.
		/*
		 * For inputArray = [1, 2, 1], elemToReplace = 1, and substitutionElem = 3, the
		 * output should be arrayReplace(inputArray, elemToReplace, substitutionElem) =
		 * [3, 2, 3]
		 */
		int [] inputArray = {1,2,1};
		int elemToReplace = 1;
		int substitutionElem = 3;
		
		for (int i = 0; i < inputArray.length; i++) {
			if (inputArray[i] == elemToReplace) {
				inputArray[i] = substitutionElem; 
			}
		}
		// return inputArray
	
	}

};

