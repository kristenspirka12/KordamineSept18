package loomad;

import java.time.LocalDate;

public class Loomapass {
	private int vanus;
	private String varvus;
	private boolean onVaktsineeritud;
	
	private LocalDate algusKp;
	private LocalDate loppKp;
	
	public Loomapass(int vanus, String varvus, boolean onVaktsineeritud) {
		this.vanus = vanus;
		this.varvus = varvus;
		this.onVaktsineeritud = onVaktsineeritud;
	}
	
	public void votaArvele() {
		this.algusKp = LocalDate.now();
	}
	
	public void votaArveltMaha(LocalDate kuupaev) {
		this.loppKp = kuupaev;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Loomapass [vanus=" + vanus + ", varvus=" + varvus + ", onVaktsineeritud=" + onVaktsineeritud
				+ ", algusKp=" + algusKp + "]";
	}
	
	
}
