package szemelyek;

import java.util.Arrays;
import java.util.Comparator;
import java.io.*;

public class Tanszek {
	private EgyetemiAlkalmazott[] staff;
	int uresHely = 0; 
	
	public static class NevSorter implements Comparator<EgyetemiAlkalmazott> {

		@Override
		public int compare(EgyetemiAlkalmazott o1, EgyetemiAlkalmazott o2) {
			// TODO Auto-generated method stub
			return o1.getNev().compareTo(o2.getNev());
		}
		
	}
	public Tanszek(int maxLletszam) {
		super();
		this.staff = new EgyetemiAlkalmazott[maxLletszam];
	}
	
	public void felvesz(EgyetemiAlkalmazott alk) {
		staff[uresHely] = alk;
		uresHely++;
	}
	
	public void listaz( ) {
		for(int i=0; i< uresHely; i++) {
			System.out.println(staff[i]);
		}
		System.out.println();
	}
	
	public void rendezFizuSzerint( ) {
		Arrays.sort(staff);
	}
	
	public void rendezNev() {
		Arrays.sort(staff, new NevSorter());
	}

	public void rendezKor() {
		Arrays.sort(staff, new KorSorterCsokkeno());
		
	}
	
	public void rendezKorNovekvo() {
		Arrays.sort(staff, Comparator.comparing(EgyetemiAlkalmazott::getKor));		
	}
	
	public void filebaListaz(String filenev) {
		File file = new File(filenev);
		FileWriter output = null;
		try {
			output = new FileWriter(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("File megnyitása sikertelen");
			return;
		}

		try {
			for (int i=0; i<uresHely; i++) {
				output.write(staff[i].getNev() + ":" + staff[i].getFizetes() + "\n");
			}
			output.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Hiba a file írása közben");
			return;
		}

	}
		
	}
	
