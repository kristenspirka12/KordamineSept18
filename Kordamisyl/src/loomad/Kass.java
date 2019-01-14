package loomad;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Kass extends Loom{
	private List<Loomapass> loomapass;

	public Kass(String nimi, String toug, Date sünniaeg) {
		super(nimi, toug, sünniaeg);
		this.loomapass = new ArrayList<Loomapass>();
	}
	
	
}
