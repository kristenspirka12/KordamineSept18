package ruumid;

import java.util.Calendar;

public class Arvuti {
	private String nimetus;
	private Calendar arvelevotuKp;
	private Calendar arveltMahaKp;
	
	public Arvuti(String nimetus, Calendar arvelevotuKp, Calendar arveltMahaKp) {
		this.nimetus = nimetus;
		this.arvelevotuKp = arvelevotuKp;
		this.arveltMahaKp = arveltMahaKp;
	}
	
	
}
