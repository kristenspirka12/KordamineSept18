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
	
	@Test
	public void addingListToAnotherMultipleValues() {
		List<String> list1 = new ArrayList<>(Arrays.asList("one", "two"));
		List<String> list2 = new ArrayList<>(Arrays.asList("three", "four"));
		List<String> result = new ArrayList<>(Arrays.asList("one", "two", "three", "four"));
		
		assertThat(ListExtentions.addList(list1, list2), is(result));
	}
	
	@Test
	public void addingListToBeginning() {
		List<String> list1 = new ArrayList<>(Arrays.asList("one"));
		List<String> list2 = new ArrayList<>(Arrays.asList("two"));
		List<String> result = new ArrayList<>(Arrays.asList("one", "two"));
		
		assertThat(ListExtentions.addList(list1, list2), is(result));
	}
	
	@Test
	public void addListAlternatelyCorrectResultSize() {
		List<String> list1 = new ArrayList<>(Arrays.asList("one"));
		List<String> list2 = new ArrayList<>(Arrays.asList("three", "four"));
		
		assertThat(ListExtentions.addListAlternately(list1, list2).size(), is(3));
	}
	
	@Test
	public void addListAlternatelyCorrectElements() {
		List<String> list1 = new ArrayList<>(Arrays.asList("one"));
		List<String> list2 = new ArrayList<>(Arrays.asList("three", "four" ));
		List<String> result = new ArrayList<>(Arrays.asList("one","three", "four"));
		
		assertThat(ListExtentions.addListAlternately(list1, list2), is(result));
	}
	
}
