package alkalmazott;

/* 4.1 b
 * 
 */
public class Alkalmazott {
	private final String nev;
	private int fizetes;
	private final static int SZJAKULCS = 15;
		
	public Alkalmazott(String nev, int fizetes) {
		super();
		this.nev = nev;
		this.fizetes = fizetes;
	}
	public int getFizetes() {
		return fizetes;
	}
	public void setFizetes(int fizetes) {
		this.fizetes = fizetes;
	}
	public String getNev() {
		return nev;
	}
	public void fizetestNovel(double szazalek) {
		fizetes = (int)(fizetes + fizetes*szazalek/100); 
	}
	
	public int getSzja() {
		return (int)(fizetes * SZJAKULCS / 100.);
	}
	
	public boolean nagyobbE(Alkalmazott masik) {
		return fizetes > masik.fizetes;
	}
	
	@Override
	public String toString() {
		return "[nev=" + nev + ", fizetes=" + fizetes + "]";
	}
	// Barkács megoldás!
	public String kiirInfo() {
		return nev + ": " + fizetes;
	}

}
