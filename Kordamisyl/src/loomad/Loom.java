package loomad;

import java.util.Date;

public abstract class Loom {
	private String nimi;
	private String toug;
	private Date sünniaeg;
	
	public Loom(String nimi, String toug, Date sünniaeg) {
		this.nimi = nimi;
		this.toug = toug;
		this.sünniaeg = sünniaeg;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Loom [nimi=" + nimi + ", toug=" + toug + ", sünniaeg=" + sünniaeg + ", " + "]";
	}
	
	
}
