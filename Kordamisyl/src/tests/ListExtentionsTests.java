package tests;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import listExtentions.ListExtentions;

public class ListExtentionsTests {
	
	@Test
	public void addingListToAnother() {
		List<String> list1 = new ArrayList<>(Arrays.asList("one"));
		List<String> list2 = new ArrayList<>(Arrays.asList("two"));
		List<String> result = new ArrayList<>(Arrays.asList("one", "two"));
		
		assertThat(ListExtentions.addList(list1, list2), is(result));
	}
}
