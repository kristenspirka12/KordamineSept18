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

	public void satiLabisoiduAndmed(double kilomeetriHind, int odomeetriNait, double keskmineKytuseKulu) {
		this.kilomeetriHind = kilomeetriHind;
		this.odomeetriNait = odomeetriNait;
		this.keskmineKytuseKulu = keskmineKytuseKulu;
	}

	public void lisaUksed(Uks... uksed) {
		for (Uks uks : uksed) {
			this.uksed.add(uks);
		}
	}
	
	public int annaKorralisteHooldusteArv(int hooldusvalp) {
		return this.odomeetriNait/hooldusvalp;
	}
	
	public double annaTaksoSoiduEestTasutudSumma(int kilomeetrid) {
		return this.kilomeetriHind*kilomeetrid;
	}
	
	public double annaUmbkaudneBensiiniKuluKilometraaziJargi() {
		return this.odomeetriNait/100*keskmineKytuseKulu;
		
	}
	
	public void sulgeUks(UkseLiik ukseLiik) {
		for (Uks uks : uksed) {
			if (uks.annaLiik().equals(ukseLiik)) {
				uks.sulge();
			}
		}
	}
	
	public void sulgeKoikUksed() {
		uksed.forEach(uks -> uks.sulge());
	}
	
	public List<Uks> annaUksed() {
		return this.uksed;
	}
}
		

