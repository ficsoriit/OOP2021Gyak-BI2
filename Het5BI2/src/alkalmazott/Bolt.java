package alkalmazott;

public class Bolt {
	private int letszam;
	private Alkalmazott[] alkalmazottak;
	
	public Bolt(int letszam) {
		super();
		this.letszam = letszam;
		alkalmazottak = new Alkalmazott[letszam];
		feltolt();
	}
	
	public int getLetszam() {
		return letszam;
	}

	public Alkalmazott[] getAlkalmazottak() {
		return alkalmazottak;
	}

	private void feltolt() {
		for (int i=0; i<alkalmazottak.length; i++) {
			alkalmazottak[i] = new Alkalmazott("Béla" + (i+1), (i+1)*100000);
		}
	}

	
	
}
