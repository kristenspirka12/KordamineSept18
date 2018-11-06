package listExtentions;

import java.util.ArrayList;
import java.util.List;

public class ListExtentions {

	//a) esimese elementide j�rel teised. [a, b], [c, d] -> [a, b, c, d]
	public static List<String> addList(List<String> listA, List<String> listB) {
		List<String> result = new ArrayList<>(listA);
		result.addAll(listB);
		return result;	
	}
	
	//b) teise listi elementide j�rel esimesed. [a, b], [c, d] -> [c, d, a, b]
	public static List<String> addListBeginning(List<String> listA, List<String> listB) {
		return addList(listB, listA);	
	}
}
