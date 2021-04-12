package myproduct;

public class Aru {
	private String nev;
	private int nettoAr;
	private int afakulcs;
	
	public Aru(String nev, int nettoAr, int afakulcs) {
		super();
		this.nev = nev;
		this.nettoAr = nettoAr;
		this.afakulcs = afakulcs;
	}
		
	@Override
	public String toString() {
		return "Aru [nev=" + nev + ", bruttoAr()=" + bruttoAr() + "]";
	}

	public int bruttoAr() {
		return (int)Math.round(nettoAr + nettoAr*afakulcs / 100.); 
	}

	public void aremeles(int mertek) {
		nettoAr = (int)Math.round(nettoAr + nettoAr*mertek / 100.); 		
	}
	
	public int dragabb(Aru masik) {
		if (nettoAr > masik.nettoAr) return 1;
		if (nettoAr == masik.nettoAr) return 0;
		return -1;
	}
}
