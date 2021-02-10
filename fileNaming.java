import java.util.*;

public class fileNaming {
	/*
	 * You are given an array of desired filenames in the order of their creation.
	 * Since two files cannot have equal names, the one which comes later will have
	 * an addition to its name in a form of (k), where k is the smallest positive
	 * integer such that the obtained name is not used yet.
	 * 
	 * Return an array of names that will be given to the files.
	 * 
	 * Example
	 * 
	 * For names = ["doc", "doc", "image", "doc(1)", "doc"], the output should be
	 * fileNaming(names) = ["doc", "doc(1)", "image", "doc(1)(1)", "doc(2)"]
	 * 
	 * 
	 * 
	 */
	public static void main(String[] args) {
		String[] names = { "doc", "doc", "image", "doc(1)", "doc" };
		// output:
		fileNamingF(names);
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
	}

	public static String[] fileNamingF(String[] names) {
		HashMap<String, Integer> tally = new HashMap<String, Integer>();

		for (int i = 0; i < names.length; i++) {
			String name = names[i];
			int numFiles = tally.getOrDefault(name, 0);
			numFiles = nextNumFiles(tally, name, numFiles);
			if (tally.containsKey(name)) {
				names = updateNames(names, i, numFiles - 1);
				tally.put(names[i], 1); // update
			}
			tally.put(name, numFiles);
		}

		return names;
	}

	public static int nextNumFiles(HashMap<String, Integer> tally, String name, int numFiles) {
		do {
			numFiles++;
		} while (tally.containsKey(name + "(" + (numFiles - 1) + ")"));
		return numFiles;
	}

	public static String[] updateNames(String[] names, int i, int num) {
		String name = names[i];
		names[i] = name + "(" + num + ")";
		return names;
	}
}
