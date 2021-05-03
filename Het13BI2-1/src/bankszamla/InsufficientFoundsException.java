package bankszamla;

public class InsufficientFoundsException extends Exception {
	private int hianyzoOsszeg;

	public InsufficientFoundsException(String message, int hianyzoOsszeg) {
		super(message);
		this.hianyzoOsszeg = hianyzoOsszeg;
	}

	public int getHianyzoOsszeg() {
		return hianyzoOsszeg;
	}

}
