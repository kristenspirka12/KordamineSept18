package loomad;

import java.util.Date;

public abstract class Loom {
	private String nimi;
	private String toug;
	private Date sunniaeg;
	
	public Loom(String nimi, String toug, Date sunniaeg) {
		this.nimi = nimi;
		this.toug = toug;
		this.sunniaeg = sunniaeg;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Loom [nimi=" + nimi + ", toug=" + toug + ", sunniaeg=" + sunniaeg + ", " + "]";
	}
	
	
}
