package alkalmazott;
/* 4.1 a feladat
 * És itt most ünnepélyesen megígértjük, hogy SOHA TÖBBET
 * ilyen osztály 
 * 
 * 
 */

public class AlkalmazottApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alkalmazott alkalmazott = new Alkalmazott();
		alkalmazott.nev = "Józsi";
		alkalmazott.fizetes = 100000;
		System.out.println(alkalmazott.kiirInfo());
		alkalmazott.fizetestNovel(20);
		System.out.println(alkalmazott.kiirInfo());
	}

}
