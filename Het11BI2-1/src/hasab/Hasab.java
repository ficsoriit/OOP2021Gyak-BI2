package hasab;

public abstract class Hasab {
	private int magassag;

	public Hasab(int magassag) {
		super();
		this.magassag = magassag;
	}

	public int getMagassag() {
		return magassag;
	}
	
	public abstract double alapterulet();
	
	public double terfogat() {
		return alapterulet()*magassag;		
	}
	
	@Override
	public String toString() {
		return "Hasab [magassag=" + magassag + "]";
	}

	public boolean nagyobbE(Hasab masik) {
		return terfogat() >= masik.terfogat();
	}

}
