package bankszamla;

public class Bankszamla {
	private final int  bankszamalSzam;
	private int egyenleg;
	
	public Bankszamla(int bankszamalSzam) {
		super();
		this.bankszamalSzam = bankszamalSzam;
	}

	public int getBankszamalSzam() {
		return bankszamalSzam;
	}

	public int getEgyenleg() {
		return egyenleg;
	}

	@Override
	public String toString() {
		return "Bankszamla [bankszamalSzam=" + bankszamalSzam + ", egyenleg=" + egyenleg + "]";
	}
	
	public void betet(int osszeg) {
		egyenleg += osszeg;
	}
	
	public void kivet(int osszeg) throws InsufficientFoundsException {
		int ujegyenleg = egyenleg - osszeg;
		if (ujegyenleg >= 0) {
			egyenleg = ujegyenleg;
		} else {
			throw new InsufficientFoundsException("Fedezet hiány!!", -ujegyenleg);
		}
	}
}
