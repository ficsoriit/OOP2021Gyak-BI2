package alkalmazott;
/* 4.1 a feladat
 * És itt most ünnepélyesen megígértjük, hogy SOHA TÖBBET
 * ilyen osztály NEM írunk!
 * Számos OO alapetvet sért!
 * 
 */


public class Alkalmazott {
	String nev;
	int fizetes;
	
	void fizetestNovel(double szazalek) {
		fizetes = (int)(fizetes + fizetes*szazalek/100); 
	}
	String kiirInfo() {
		return nev + ": " + fizetes;
	}

}
