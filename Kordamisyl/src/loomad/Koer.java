package loomad;

import java.time.LocalDate;
import java.util.Date;

public class Koer extends Loom{
	private String varvus;

	public Koer(String nimi, String toug, LocalDate sunniaeg, String varvus) {
		super(nimi, toug, sunniaeg);
		this.varvus = varvus;
	}
	
	
}

