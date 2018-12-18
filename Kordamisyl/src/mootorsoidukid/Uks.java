package mootorsoidukid;

public class Uks {
	private boolean onAvatud;
	private UkseLiik ukseliik;

	public Uks(boolean onAvatud, UkseLiik ukseliik) {
		super();
		this.onAvatud = onAvatud;
		this.ukseliik = ukseliik;
	}
	
	public void sulge() {
		this.onAvatud = false;
	}
	
	public UkseLiik annaLiik() {
		return this.ukseliik;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Uks [onAvatud=" + onAvatud + ", ukseliik=" + ukseliik + "]";
	}
	
	public void ava() {
		
	}
}
	
