package myproduct;

public class Kenyer extends Aru {
	private double mennyiseg;

	public Kenyer(String nrv, int nettoAr, int afakulcs, double mennyiseg) {
		super(nrv, nettoAr, afakulcs);
		this.mennyiseg = mennyiseg;
	}

	@Override
	public String toString() {
		return "Kenyer [mennyiseg=" + mennyiseg + ", toString()=" + super.toString() + ", bruttoAr()=" + bruttoAr()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

	public double getMennyiseg() {
		return mennyiseg;
	}

	private double egysegar() {
		return bruttoAr() / mennyiseg;
	}
	
	public static boolean nagyobbE(Kenyer egyik, Kenyer masik) {
		return egyik.egysegar() >= masik.egysegar();
	}
	// A feladatkiírástól eltérve
	public boolean nagyobbEMasik(Kenyer masik) {
		return egysegar() >= masik.egysegar();	
	}
	public Kenyer melyikDragabb(Kenyer egyik, Kenyer masik) {
		if (egyik.egysegar() >= masik.egysegar()) return egyik;
		return masik;
	}
	public int compareTo(Kenyer masik) {
		if (egysegar() > masik.egysegar()) return 1;
		if (egysegar() == masik.egysegar()) return 0;
		return -1;		
	}
	@Override
	public int dragabb(Aru masik) {
		if (egysegar() > ((Kenyer)masik).egysegar()) return 1;
		if (egysegar() == ((Kenyer)masik).egysegar()) return 0;
		return -1;
	}
	// A feladatkiírástól való eltérés eddig
}
