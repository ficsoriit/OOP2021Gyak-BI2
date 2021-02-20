package ikerprim;

public class Ikerprimek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		for (int i=1; i<100; i++) {
			for (int j=i+1; j<100; j++) {
				if (ikerprimek(i,j)) {
					System.out.println("(" + i + "," + j + ")");
				}
			}
			
		}
	}
	
	static boolean ikerprimek(int i, int j) {
		if (primszam(i) && primszam(j) && kulonbseg(i,j) == 2) {
			return true;
		}
		return false;
	}
	
	static boolean primszam(int szam) {
		for (int oszto=2; oszto <= szam/2; oszto++) {
			if (szam % oszto == 0) {
				return false;
			}
		}
		return true;
	}
	
	static int kulonbseg(int  i, int j) {
		return Math.abs(i-j);
	}

}
