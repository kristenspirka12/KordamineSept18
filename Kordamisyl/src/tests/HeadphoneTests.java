package tests;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;

import org.junit.Test;

import kordamisylesanded.Headphone;

public class HeadphoneTests {
	
	Headphone headphoneOdavad = new Headphone("Philips", 5.4, false);
	Headphone headphoneKallid = new Headphone("Sony", 40.4, false);
	
	@Test
	public void isOnePlusTwoEqualsThree() {
		assertThat(1 + 2, is(3));
	}
	
	@Test
	public void baseLoweredPriceCalculation() {
		
		/*Headphone headphoneOdavad = new Headphone("Philips", 5.4, false);
		Double arvutatudHind = headphoneOdavad.getLowerPrice();
		Double oodatudHind = 4.86;
		
		assertThat(arvutatudHind, is(oodatudHind)); */
		
		assertThat(headphoneOdavad.getLowerPrice(),is(4.86));
	}
	
	@Test
	public void customLoweredPriceCalculation() {
		assertThat(headphoneOdavad.getLowerPrice(30), is(3.78));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void loweredPriceCalculationOver100Percent() {
		headphoneOdavad.getLowerPrice(105);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void loweredPriceCalculationNegativeNumber() {
		Headphone headphone3 = new Headphone("Samsung",60 ,false);
		headphone3.getLowerPrice(-15);
	}
	
	@Test
	public void priceSetterSetValue() {	
		Headphone headphone1 = new Headphone("Sony", false);
		headphone1.setPrice(2.0);
		
		assertThat(headphone1.getPrice(), is(2.0));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void priceSetterNotSetValueWhenNegative() {	
		Headphone headphone1 = new Headphone("Sony", false);
		headphone1.setPrice(-2.0);
	}
}

