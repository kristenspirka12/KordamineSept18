package listExtentions;

import java.util.ArrayList;
import java.util.List;

public class ListExtentions {

	// a) esimese elementide järel teised. [a, b], [c, d] -> [a, b, c, d]
	public static List<String> addList(List<String> listA, List<String> listB) {
		List<String> result = new ArrayList<>(listA);
		result.addAll(listB);
		return result;
	}

	// b) teise listi elementide järel esimesed. [a, b], [c, d] -> [c, d, a, b]
	public static List<String> addListBeginning(List<String> listA, List<String> listB) {
		return addList(listB, listA);
	}

	// c) vaheldumisi mõlema listi elemendid alates esimese listi elementidest. [a,b], [c, d] -> [a, c, b, d]
	public static List<String> addListAlternately(List<String> listA, List<String> listB) {
		List<String> result = new ArrayList<>();
		int listASize = listA.size();
		int listBSize = listB.size();

		for (int i = 0; i < Math.max(listASize, listBSize); i++) {
			if (listASize > i)
				result.add(listA.get(i));
			if (listBSize > i)
				result.add(listB.get(i));
		}
		return result;

		// Variant, kui listid peavad olema �he pikkused.
		/* List<String> result = new ArrayList<>();
		if (listA.size() != listB.size())
			throw new IllegalArgumentException("Listid peavad olema ühepikkused.");

		for (int i = 0; i < listA.size(); i++) {
			result.add(listA.get(i));
			result.add(listB.get(i));
		}
		return result; */
	}
}
