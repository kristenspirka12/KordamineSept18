package tests;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;

import org.junit.Test;

import kordamisylesanded.Headphone;

public class HeadphoneTests {
	
	@Test
	public void isOnePlusTwoEqualsThree() {
		assertThat(1 + 2, is(3));
	}
	
	@Test
	public void baseLoweredPriceCalculation() {
		Headphone headphone1 = new Headphone("Sony", false);
		headphone1.setPrice(5.4);
		System.out.println(headphone1);
		Double arvutatudHind = headphone1.get10LowerPrice();
		System.out.println("10% allahindlus " + arvutatudHind);
		Double oodatudHind = 4.86;
		System.out.printf("Oodatud tulem %.2f \n", oodatudHind);
		System.out.println("Kas on oodatud tulem? " + arvutatudHind.equals(oodatudHind));
		//assertThat(1 + 2, is(3));
	}
}
