package szavak;

import java.util.ArrayList;
import java.util.Scanner;

public class SzoFeltoltes {
	
	static Scanner megnyitInput() {
		return new Scanner(System.in);
	}
	
	static String sortBeolvas(Scanner input) {
		return input.nextLine();
	}
	
	static String kovetkezoSzo(Scanner input) {
		String szo = sortBeolvas(input);
		if (szo.charAt(0) == '*') {
			return "";
		}
		return szo;		
	}
	
	static ArrayList<String> szavakatELtarol(Scanner input) {
		ArrayList<String> szavak = new ArrayList<String>();
		String szo;
		while ( !((szo = kovetkezoSzo(input)).equals(""))) { // Addig, amíg van input
			szavak.add(szo);
		}
		return szavak;
	}
	
	static void kiir(ArrayList<String> tomb) {
		for (String elem : tomb) {
			System.out.println(elem + "\t");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = megnyitInput();
		ArrayList<String> szavak;
		szavak = szavakatELtarol(input);
		kiir(szavak);	
	}
	
}
