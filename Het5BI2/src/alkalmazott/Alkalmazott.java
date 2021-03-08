package alkalmazott;

/* 4.1 b
 * 
 */
public class Alkalmazott {
	private final String nev;
	private int fizetes;
		
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
	
	public String kiirInfo() {
		return nev + ": " + fizetes;
	}

}
