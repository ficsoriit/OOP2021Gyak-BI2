package hasab.fut1;

import hasab.Hasab;
import hasab.Henger;
import hasab.Teglatest;

public class teglatestekProba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hasab henger = new Henger(100, 10);
		Hasab tegla = new Teglatest(100, 10, 10);
		System.out.println(henger);
		System.out.println(tegla);		
	
		if (henger.nagyobbE(tegla)) {
			System.out.println("A henger térfogata nagyobb");
		} else {
			System.out.println("A tegla térfogata nagyobb");
		}
		
	}
		
}
