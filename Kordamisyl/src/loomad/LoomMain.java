package loomad;

import java.time.LocalDate;

public class LoomMain {

	public static void main(String[] args) {
		Loom koduloom = new Koer("Muki", "labrador", LocalDate.of(2015, 10, 23), null);
		System.out.println(koduloom);
		
		Loom koduloom2 = new Kass("Nurri", "siiami", LocalDate.of(2009, 07, 12));
		System.out.println(koduloom2);
		
		Kass koduloom3 = new Kass("Triibu", "parsia", LocalDate.of(2012, 11, 30));
		Loomapass triibuPass = new Loomapass(5, "hallikas", false);
		System.out.println(koduloom3);
		
		triibuPass.votaArvele();
		koduloom3.lisaLoomapass(triibuPass);
		
		System.out.println(triibuPass);
	}

}
