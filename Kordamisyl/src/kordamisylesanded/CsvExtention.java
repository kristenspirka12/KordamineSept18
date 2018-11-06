package kordamisylesanded;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class CsvExtention {
	
	public static void main(String[] args) {
		String[] csvArray = csvToArray("tool, laud, lamp, arvuti");
		System.out.println(Arrays.toString(csvArray));
		System.out.println(csvArray[1]);
		
		List<String> csvList = csvToList("maja, auto, koduloom, arvuti, Juku, elamu");
		System.out.println(csvList);
		System.out.println(csvList.get(1));
		//System.out.println(startsWithA(csvList));
		//System.out.println(isVowel('P'));
	}
	
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
		/*List<String> result = new ArrayList<>();
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
	
	public static List<String> startsWithA(List<String> list) {
		/* Variant 1
		 List<String> result = new ArrayList<>(); 
		 for (String item : list) { 
			 if (item.startsWith("a")) { 
				 result.add(item); 
			 } 
		 } 
		 return result; */
		 
		
		// Variant 2
		return list.stream()
				.filter(item -> item.toLowerCase().startsWith("a"))
				.collect(Collectors.toList());
	}

	public static List<String> startsWithVowel(List<String> list) {
		/* Variant 1 
		  return list.stream() 
		  		.filter(item -> item.matches("(?i)[aeiou].*"))
		  		.collect(Collectors.toList()); */
		 
		// Variant 2
		return list.stream()
				.filter(item -> isVowel(getFirstChar(item)))
				.collect(Collectors.toList());
	}

	public static boolean isVowel(char ch) {
		// return "aeiou".contains(Character.toString(ch).toLowerCase());
		return isCharInArray(ch, "aeiou".toCharArray());
	}

	public static boolean isCharInArray(char ch, char[] chars) {
		return String.valueOf(chars).contains(Character.toString(ch).toLowerCase());
	}

	// getFirstChar("maja") -> "m"
	public static char getFirstChar(String str) {
		return str.charAt(0);
	}
}
