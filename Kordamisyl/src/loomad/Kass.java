package loomad;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Kass extends Loom{
	private List<Loomapass> loomapass;

	public Kass(String nimi, String toug, LocalDate sunniaeg) {
		super(nimi, toug, sunniaeg);
		this.loomapass = new ArrayList<Loomapass>();
	}
	
	//TODO Luua meetod, mis lisab uue loomapassi.
	
}
