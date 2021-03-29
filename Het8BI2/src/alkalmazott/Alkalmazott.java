package alkalmazott;

public class Alkalmazott {
	private String nev;
	private int kor;
	private int fizetes;
	private static int nyugdijKorhatar = 65;
	
	public Alkalmazott(String nev, int kor, int fizetes) {
		super();
		this.nev = nev;
		this.kor = kor;
		this.fizetes = fizetes;
	}

	public Alkalmazott(String nev, int kor) {
		this(nev, kor, 10000*kor);
	}

	public static void setNyugdijKorhatar(int nyugdijKorhatar) {
		Alkalmazott.nyugdijKorhatar = nyugdijKorhatar;
	}

	public int evekNyugdijig() {
		return nyugdijKorhatar - kor;
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
		return "Alkalmazott [nev=" + nev + ", kor=" + kor + ", fizetes=" + fizetes + "]" +
				"Nyugdíjig hátra: " + evekNyugdijig();
	}
	
	

}
