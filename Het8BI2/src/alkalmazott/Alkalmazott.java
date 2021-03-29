package alkalmazott;

import java.time.LocalDate;

public class Alkalmazott {
	private String nev;
	private LocalDate szuletett;;
	private int fizetes;
	private final static int nyugdijKorhatar = 65;
	

	public Alkalmazott(String nev, LocalDate szuletett, int fizetes) {
		super();
		this.nev = nev;
		this.szuletett = szuletett;
		this.fizetes = fizetes;
	}
	
	

	public Alkalmazott(String nev, LocalDate szuletett) {
		this(nev, szuletett, 10000*(LocalDate.now().getYear() - szuletett.getYear()));
	}


	public int evekNyugdijig() {
		return nyugdijKorhatar - (LocalDate.now().getYear() - szuletett.getYear());
	}
	
	public Alkalmazott fiatalabb (Alkalmazott egyik, Alkalmazott masik) {
		/*
		if (egyik.evekNyugdijig() > masik.evekNyugdijig()) return egyik;
		return masik;
		*/
		return egyik.evekNyugdijig() > masik.evekNyugdijig() ? egyik : masik;
	}



	@Override
	public String toString() {
		return "Alkalmazott [nev=" + nev + ", szuletett=" + szuletett + ", fizetes=" + fizetes + "]" + evekNyugdijig();
	}

	
}
