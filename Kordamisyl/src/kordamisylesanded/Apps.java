package kordamisylesanded;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class Apps {

	public static void main(String[] args) {
		Headphone headphone1 = new Headphone("Sony", false);
		headphone1.setPrice(5.4);
		System.out.println(headphone1);
		//System.out.println("10% allahindlus " + headphone1.get10LowerPrice());
		//System.out.println("Oodatud tulem 4,86");
		Double arvutatudHind = headphone1.getLowerPrice();
		System.out.println("10% allahindlus " + arvutatudHind);
		Double oodatudHind = 4.86;
		System.out.printf("Oodatud tulem %.2f \n", oodatudHind);
		System.out.println("Kas on oodatud tulem? " + arvutatudHind.equals(oodatudHind));
		//System.out.println("Kas on oodatud tulem? " + Boolean.toString(headphone1.get10LowerPrice() == (4.86)));
		
		System.out.println("25% allahindlus " + headphone1.getLowerPrice(25));
		System.out.println("Oodatud tulem 4,05");
		System.out.println("____________________");
		
		
		
		Headphone headphone2 = new Headphone("JBL", 150, false);
		System.out.println(headphone2);
		//System.out.println("30% allahindlus " + headphone2.getLowerPrice(30));
		//System.out.println("Oodatud tulem 105");
		Double arvutatudHind1 = headphone2.getLowerPrice(30);
		System.out.println("30% allahindlus " + arvutatudHind1);
		Double oodatudHind1 = 105.0;
		System.out.printf("Oodatud tulem %.2f \n", oodatudHind1);
		System.out.println("Kas on oodatud tulem? " + arvutatudHind1.equals(oodatudHind1));
		//System.out.println("Kas on oodatud tulem? " + Boolean.toString(headphone2.getLowerPrice(30) == (105.0)));
		System.out.println("____________________");
		
		Headphone headphone3 = new Headphone("Samsung",60 ,false);
		System.out.println(headphone3);
		//System.out.println("-15% allahindlus " + headphone3.getLowerPrice(-15));
		//System.out.println("Oodatud tulem 69");
		Double arvutatudHind2 = headphone3.getLowerPrice(-15);
		System.out.println("-15% allahindlus " + arvutatudHind2);
		Double oodatudHind2 = 69.0;
		System.out.printf("Oodatud tulem %.2f \n", oodatudHind2);
		//System.out.println("Kas on oodatud tulem? " + Boolean.toString(headphone3.getLowerPrice(-15) == (69.0)));
		System.out.println("____________________");
		
		Headphone headphone4 = new Headphone("Philips",25 ,false);
		System.out.println(headphone4);
		//System.out.println("105% allahindlus " + headphone3.getLowerPrice(105));
		//System.out.println("Oodatud tulem 63.0");
		Double arvutatudHind3 = headphone3.getLowerPrice(105);
		System.out.println("105% allahindlus " + arvutatudHind3);
		Double oodatudHind3 = 63.0;
		System.out.printf("Oodatud tulem %.2f \n", oodatudHind3);
		//System.out.println("Kas on oodatud tulem? " + Boolean.toString(headphone3.getLowerPrice(105) == (63.0)));
		
		//System.out.println(headphone2.getPrice());
		//System.out.println(headphone1.getPrice());
		//System.out.println(headphone1.getPromo());
		//System.out.println(headphone1.get10LowerPrice());
		//System.out.println(headphone1.getLowerPrice(25));
		

		//System.out.println(startsWithA(csvList));
		//System.out.println(isVowel('P'));
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
