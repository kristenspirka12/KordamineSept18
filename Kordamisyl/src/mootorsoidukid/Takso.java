package mootorsoidukid;

import java.util.ArrayList;
import java.util.List;

public class Takso extends Auto {

	private double kilomeetriHind;
	private int odomeetriNait;
	private double keskmineKytuseKulu;
	private List<Uks> uksed = new ArrayList<>();

	public Takso(int hetkeKiirus, int telgedeArv, int valjalaskeAasta, String mark, String numbriMärk,
			int maksimaalneKiirus) {
		super(hetkeKiirus, telgedeArv, valjalaskeAasta, mark, numbriMärk, maksimaalneKiirus);
	}

	public void satiLabisoiduAndmed(double kilomeetriHind, int odomeeteriNait, double keskmineKütuseKulu) {
		this.kilomeetriHind = kilomeetriHind;
		this.odomeetriNait = odomeetriNait;
		this.keskmineKytuseKulu = keskmineKütuseKulu;
	}

	public void lisaUksed(Uks... uksed) {
		for (Uks uks : uksed) {
			this.uksed.add(uks);
		}
	}
	
	public int annaKorralisteHooldusteArv(int hooldusvalp) {
		return this.odomeetriNait/hooldusvalp;
	}
}
		

