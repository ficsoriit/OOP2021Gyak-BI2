package parosok;

public class Parosok {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] tomb = new int[10];
		feltolt(tomb);
		int[] parosok;
		kiirEgesz(tomb);
		parosok = kivalasztParos(tomb);
		System.out.println("Párosok:");
		if (parosok.length == 0) {
			System.out.println("Nincs páros szám!");
		} else {
			kiirEgesz(parosok);			
		}
		
		// Proba - kivételt dob!
		int[] p = new int[0];
		System.out.println(p.length);
		//System.out.println(p[0]);

	}
	
	static void feltolt(int[] tomb) {
		for (int i=0; i<tomb.length; i++) {
			tomb[i] = (int)(Math.random() * 100);
		}
	}
	
	static void kiirEgesz(int[] tomb) {
		for (int i=0; i<tomb.length; i++) {
			System.out.println(i + ":" + tomb[i]);			
		}		
		// Ha csak egy utasítás kell a törzsbe
		// for (int i=0; i<tomb.length; i++) tomb[i] = 0;
	}
	
	static int[] kivalasztParos(int[] tomb) {
		int[] paros;
		int parosDarab = 0;
		for (int i=0; i<tomb.length; i++) {
			if (tomb[i] % 2 == 0) parosDarab++;
		}
		paros = new int[parosDarab];
		int j=0;
		for (int i=0; i<tomb.length; i++) {
			if (tomb[i] % 2 == 0) {
				paros[j] = tomb[i];
				j++;
			}
		}		
		return paros;
	}	
}
