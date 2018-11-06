package tests;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;
import org.junit.Test;

public class CsvExtentionTests {

	String[] csvArray = csvToArray("tool, laud, lamp, arvuti");
	
	/*@Test
	public void CsvToListCorrectValue() {
		assertThat(csvArray, is(csvToArray));
	}*/
	
	public static String[] csvToArray(String csvStr) {
		return csvStr.split("\\s*(,)\\s*");
	}
}
