package bankszamla.runnable;

import bankszamla.Bankszamla;
import bankszamla.InsufficientFoundsException;

public class BankszamlaTeszt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bankszamla szamla = new Bankszamla(111);
		
		szamla.betet(10000);
		
		int osszeg = 0;
		try {
			osszeg = 5000;
			szamla.kivet(osszeg);
			System.out.println("Sikeres pénzfelvétel: " + osszeg + " Ft" + "  Új egyenleg: " + szamla.getEgyenleg() + " Ft");
			osszeg = 6000;
			szamla.kivet(osszeg);
		} catch (InsufficientFoundsException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			System.out.println("Kivenni szándékozott összeg: " + osszeg + " Hiányzik " + e.getHianyzoOsszeg() + "  Egyenleg " + szamla.getEgyenleg()) ;
			// e.printStackTrace(); -- a fejlesztés során hasznos lehet!
		}

	}

}
