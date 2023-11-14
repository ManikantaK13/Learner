package Problems;

import java.util.*;

public class StringLength {

	public static void main(String[] args) {
		String string = "This this is is done by saket saket";
		String stringArray[] = string.split(" ");
		HashMap<String, Integer> map = new HashMap<>();
		for (int i = 0; i < stringArray.length; i++) {
			if (map.containsKey(stringArray[i])) {
				int count = map.get(stringArray[i]);
				map.put(stringArray[i], count + 1);
			} else {
				map.put(stringArray[i], 1);
			}
		}
	}
}
