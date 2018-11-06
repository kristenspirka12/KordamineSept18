package kordamisylesanded;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class CsvExtention {
	
	String[] csvArray = csvToArray("tool=, laud, lamp, arvuti");
	//System.out.println(Arrays.toString(csvArray));
	//System.out.println(csvArray[1]);
	
	List<String> csvList = csvToList("maja, auto, koduloom, arvuti, Juku, elamu");
	//System.out.println(csvList);
	//System.out.println(csvList.get(1));
	
	public static String[] csvToArray(String csvStr) {
		return csvStr.split("\\s*(,)\\s*");
	}
	
	public static List<String> csvToList(String csvStr) {
		/* Variant 1
		List<String> result = new ArrayList<>();
		for (String item : csvStr.split(",")) {
		 		result.add(item).trim());
		} 
		return result; */

		// Variant 2
		/* List<String> result = new ArrayList<>();
		Arrays.asList(csvStr.split(",")).forEach(item -> { 
		 		result.add(item.trim());
		});
		return result; */
		 

		List<String> result = new ArrayList<>();
		StringTokenizer st = new StringTokenizer(csvStr, ",");
		while (st.hasMoreTokens()) {
			String token = st.nextToken();
			result.add(token.trim());
		}
		return result;
	}
}
