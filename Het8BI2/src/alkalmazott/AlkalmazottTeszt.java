package alkalmazott;

import java.time.LocalDate;
import java.util.Random;

public class AlkalmazottTeszt {
	private Alkalmazott[] alkalmazottak;
	private int alkalmazottakSzama;

	public AlkalmazottTeszt(int alkalmazottakSzama) {
		super();
		this.alkalmazottakSzama = alkalmazottakSzama;
		alkalmazottak = new Alkalmazott[alkalmazottakSzama];
		feltolt();
		
	}
	
	private void feltolt() {
		Random r = new Random();
		LocalDate sz;
		for (int i=0; i<alkalmazottakSzama; i++) {
			sz = LocalDate.of(1972, 3, 15);
			alkalmazottak[i] = new Alkalmazott("Bela" + (i+1), sz);
		}
	}
	
	public void alkamazottLista() {
		for (Alkalmazott elem : alkalmazottak) {
			System.out.println(elem);
		}
	}
	
	public void marCsakOtEv() {
		System.out.println("Ot évnél kevesebb: ");
		for (Alkalmazott elem : alkalmazottak) {
			if (elem.evekNyugdijig() < 5) {
				System.out.println(elem);
			}
		}
	}
	
	private double evekAtlaga() {
		int db = 0;
		double atlag = 0;
		for (Alkalmazott elem : alkalmazottak) {
			if (elem.evekNyugdijig() > 0) {
				atlag += elem.evekNyugdijig();
				db++;
			}
		}
		if (db == 0) {
			return 0;
		} else {
			return atlag / db;
		}
	}
	
	public void atlagFelettiLista( ) {
		double atlag = evekAtlaga();
		System.out.println("Átlagnál több");
		for (Alkalmazott elem : alkalmazottak) {
			if (elem.evekNyugdijig() > atlag) {
				System.out.println(elem);
			}
		}

		
	}
}
