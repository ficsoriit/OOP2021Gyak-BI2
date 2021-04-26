package szemelyek;

public class EgyetemiAlkalmazott extends Alkalmazott implements Comparable<EgyetemiAlkalmazott>{
	private static int alapber = 500000;
	public static enum Beosztas {PROF, OKTATO, ADMIN};
	
	private Beosztas beoszt;

	public EgyetemiAlkalmazott(String nev, int kor, String munkahely,  Beosztas beoszt) {
		super(nev, kor, munkahely, 0);
		switch(beoszt) {
			case PROF : setFizetes(alapber); break;
			case OKTATO : setFizetes((int)(alapber*0.5));  break;
			case ADMIN : setFizetes((int)(alapber*0.3));  break;
		}
		this.beoszt = beoszt;
	}

	@Override
	public String toString() {
		return "EgyetemiAlkalmazott [beoszt=" + beoszt + ", toString()=" + super.toString() + "]";
	}

	@Override
	public int compareTo(EgyetemiAlkalmazott o) {
		// TODO Auto-generated method stub
		return this.getFizetes() - o.getFizetes();
	}
	

}
