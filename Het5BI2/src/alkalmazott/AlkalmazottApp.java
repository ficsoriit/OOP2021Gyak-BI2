package alkalmazott;
/* 4.1 b, c, d feladat
 * Ez már elfogadható
 * 
 */

public class AlkalmazottApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alkalmazott[] alkalmazottak = new Alkalmazott[5];
		feltolt(alkalmazottak);
		listaz(alkalmazottak);
		System.out.println("Átlagfizetés: " + atlagfizetes(alkalmazottak));
		System.out.println("SZJA: " + szjaOsszeg(alkalmazottak));
		System.out.println("Legnagyobb fizetés: " + legnagyobbFizetes(alkalmazottak));
/*
 * 
		Alkalmazott alkalmazott = new Alkalmazott("Józsi", 100000);
		System.out.println(alkalmazott);  //alkalmazott.toString()
		System.out.println(alkalmazott.kiirInfo());
		alkalmazott.setFizetes(110000);
		System.out.println(alkalmazott.kiirInfo());
		alkalmazott.fizetestNovel(20);
		System.out.println(alkalmazott.kiirInfo());
*/
	}

	public static void feltolt(Alkalmazott[] alk) {
		for (int i=0; i<alk.length; i++) {
			alk[i] = new Alkalmazott("Béla" + (i+1), (i+1)*100000);
		}
	}
	
	public static void listaz(Alkalmazott[] alk) {
		for (Alkalmazott elem : alk) {
			System.out.println(elem);
		}
	}
	
	public static int atlagfizetes(Alkalmazott[] alk) {
		int osszeg = 0;
		for (Alkalmazott elem : alk) {
			osszeg += elem.getFizetes();
		}
		return osszeg / alk.length;
	}
	
	public static int szjaOsszeg(Alkalmazott[] alk) {
		int osszeg = 0;
		for (Alkalmazott elem : alk) {
			osszeg += elem.getSzja() ;
		}
		return osszeg;
	}
	
	public static Alkalmazott legnagyobbFizetes(Alkalmazott[] alk) {
		int maxindex = 0;
		for (int i=1;  i<alk.length; i++) {
			if (alk[i].getFizetes() > alk[maxindex].getFizetes()) {
				maxindex = i;
			}
		}
		return alk[maxindex];
	}
}
