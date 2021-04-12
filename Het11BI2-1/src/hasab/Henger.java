package hasab;

public class Henger extends Hasab {
	private double sugar;

	public Henger(int magassag, double sugar) {
		super(magassag);
		this.sugar = sugar;
	}

	@Override
	public String toString() {
		return "Henger [sugar=" + sugar + ", toString()=" + super.toString() + "]";
	}

	@Override
	public double alapterulet() {
		// TODO Auto-generated method stub
		return sugar*sugar*Math.PI;
	}
	
}
