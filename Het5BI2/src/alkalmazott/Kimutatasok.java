package alkalmazott;

public class Kimutatasok {
	private Bolt bolt = new Bolt(5);
	private Alkalmazott[] alkalmazottak = bolt.getAlkalmazottak();
	
	public int atlagfizetes() {
		int osszeg = 0;
		for (Alkalmazott elem : alkalmazottak) {
			osszeg += elem.getFizetes();
		}
		return osszeg / alkalmazottak.length;
	}

	public void listaz() {
		for (Alkalmazott elem : alkalmazottak) {
			System.out.println(elem);
		}
	}

	public Alkalmazott legnagyobbFizetes() {
		int maxindex = 0;
		for (int i=1;  i<alkalmazottak.length; i++) {
			if (alkalmazottak[i].getFizetes() > alkalmazottak[maxindex].getFizetes()) {
				maxindex = i;
			}
		}
		return alkalmazottak[maxindex];
	}

	public int szjaOsszeg() {
		int osszeg = 0;
		for (Alkalmazott elem : alkalmazottak) {
			osszeg += elem.getSzja() ;
		}
		return osszeg;
	}


}
