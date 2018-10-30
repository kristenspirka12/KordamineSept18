package kordamisylesanded;
import java.util.ArrayList;

public class Headphone {
	// private fields
	private String brand;
	private double price;
	private boolean isWired;
	private ArrayList specifications;

	public Headphone(String brand, boolean isWired) {
		this.brand = brand;
		this.isWired = isWired;
		this.specifications = new ArrayList<>();
	}

	public Headphone(String brand, double price, boolean isWired) {
		this.brand = brand;
		this.price = price;
		this.isWired = isWired;
	}

	/**
	 * @return the brand
	 */
	public String getBrand() {
		return brand;
	}

	/**
	 * @param brand the brand to set
	 */
	public void setBrand(String brand) {
		this.brand = brand;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * @return the isWired
	 */
	public boolean isWired() {
		return isWired;
	}

	/**
	 * @param isWired the isWired to set
	 */
	public void setWired(boolean isWired) {
		this.isWired = isWired;
	}

	/**
	 * @return the specifications
	 */
	public ArrayList getSpecifications() {
		return specifications;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Headphone [" + (brand != null ? "brand=" + brand + ", " : "")
				+ "price=" + price + ", isWired=" + isWired + "]";
	}
	
	public String getPromo() {
		return "Täna suurepärased " + (isWired ? "juhtmega" : "juhtmeta") + " kõrvaklapid " + brand + " hinnaga " + price;
	}

	public double getLowerPrice() {
		return getLowerPrice(10);
	}
	
	public double getLowerPrice(int procent) {
		if (procent > 100) {
			throw new IllegalArgumentException("Protsent ei saa olla üle 100. Sisestatud väärtus " + procent);
		}
		return (100-procent)*price/100;
	}
}

