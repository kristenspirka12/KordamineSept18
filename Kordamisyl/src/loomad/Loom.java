package loomad;

import java.util.Date;

public abstract class Loom {
	private String nimi;
	private String toug;
	private Date s�nniaeg;
	
	public Loom(String nimi, String toug, Date s�nniaeg) {
		this.nimi = nimi;
		this.toug = toug;
		this.s�nniaeg = s�nniaeg;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Loom [nimi=" + nimi + ", toug=" + toug + ", s�nniaeg=" + s�nniaeg + ", " + "]";
	}
	
	
}
