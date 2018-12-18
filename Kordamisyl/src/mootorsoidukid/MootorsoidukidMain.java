package mootorsoidukid;

public class MootorsoidukidMain {

	public static void main(String[] args) {
		Auto auto1 = new Auto(20, 2, 2012, "Ford", "123 abc", 210);
		auto1.pidurda();
		auto1.pidurda();
		auto1.pidurda();
		System.out.println(auto1);
		System.out.println();
		
		Takso takso1 = new Takso(45, 2, 2013, "Mercedes", "456 def", 220);
		takso1.satiLabisoiduAndmed(2.1, 300000, 7.8);
		
		takso1.lisaUksed(new Uks(false, UkseLiik.EESMINE_PAREM), new Uks(true, UkseLiik.EESMINE_VASAK));
		takso1.sulgeUks(UkseLiik.EESMINE_VASAK);
		takso1.sulgeKoikUksed();
		System.out.println(takso1.annaUksed());
		
		System.out.println(takso1.annaUmbkaudneBensiiniKuluKilometraaziJargi());
		System.out.println(takso1.annaTaksoSoiduEestTasutudSumma(15));
	}
	
}
