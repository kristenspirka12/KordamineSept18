package mootorsoidukid;

import java.util.ArrayList;
import java.util.List;

public class Takso extends Auto {

	private double kilomeetriHind;
	private int odomeetriNait;
	private double keskmineKytuseKulu;
	private List<Uks> uksed = new ArrayList<>();

	public Takso(int hetkeKiirus, int telgedeArv, int valjalaskeAasta, String mark, String numbriM�rk,
			int maksimaalneKiirus) {
		super(hetkeKiirus, telgedeArv, valjalaskeAasta, mark, numbriM�rk, maksimaalneKiirus);
	}

	public void satiLabisoiduAndmed(double kilomeetriHind, int odomeeteriNait, double keskmineK�tuseKulu) {
		this.kilomeetriHind = kilomeetriHind;
		this.odomeetriNait = odomeetriNait;
		this.keskmineKytuseKulu = keskmineK�tuseKulu;
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
		

