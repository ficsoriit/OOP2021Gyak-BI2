package hasab;

public class Teglatest extends Hasab{
	private double a;
	private double b;
	public Teglatest(int magassag, double a, double b) {
		super(magassag);
		this.a = a;
		this.b = b;
	}
	@Override
	public String toString() {
		return "Teglatest [a=" + a + ", b=" + b + ", alapterulet()=" + alapterulet() + ", terfogat()=" + terfogat()
				+ ", toString()=" + super.toString() + "]";
	}
	@Override
	public double alapterulet() {
		// TODO Auto-generated method stub
		return a*b;
	}
	
	

}
