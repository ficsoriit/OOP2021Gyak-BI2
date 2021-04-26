package szemelyek.futtat1;

import szemelyek.EgyetemiAlkalmazott;
import szemelyek.Tanszek;

public class Runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tanszek tansz = new Tanszek(3);
		tansz.felvesz(new EgyetemiAlkalmazott("Bela1", 50, "tanszék", EgyetemiAlkalmazott.Beosztas.PROF));
		tansz.felvesz(new EgyetemiAlkalmazott("Bela2", 30, "tanszék", EgyetemiAlkalmazott.Beosztas.OKTATO));
		tansz.felvesz(new EgyetemiAlkalmazott("Bela0", 50, "tanszék", EgyetemiAlkalmazott.Beosztas.ADMIN));

		tansz.listaz();
		
		tansz.rendezFizuSzerint();
		tansz.listaz();

		tansz.rendezNev();
		tansz.listaz();

		tansz.rendezKor();
		tansz.listaz();

		tansz.rendezKorNovekvo();
		tansz.listaz();

		tansz.filebaListaz("fizetesek.txtx");
	}

}
