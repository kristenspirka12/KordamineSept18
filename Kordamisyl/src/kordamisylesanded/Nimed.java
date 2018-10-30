package kordamisylesanded;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Nimed {

	public static void main(String[] args) {
		/* List<String> nimed = new ArrayList<>();
		nimed.add("Kati");
		nimed.add("Mati");
		nimed.add("Juss");
		nimed.add("Mari");
		
		System.out.println(nimed.contains("Mari")); */
		
		List<String> nimed = new ArrayList<>(Arrays.asList("mikrofon", "mürasummutaja", "radiaator"));
		
		List<String> värvid = new ArrayList<>(Arrays.asList("punane"));
		
		System.out.println(värvid.size()); // väljundiks 1
	}
	

}