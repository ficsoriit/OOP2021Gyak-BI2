package tombkezeles;

import java.util.Scanner;

public class Tombok {
	
	static int beolvasEgesz() {
		Scanner input = new Scanner(System.in);
		boolean ok;
		int szam;
		do {
			ok = true;
			System.out.println("Adj meg egy egész számot");
			if (!input.hasNextInt()) {
				ok = false;
				System.out.println("Hibás szám!");
				input.next(); // Lenyeli a bufferben maradt maraktereket
			}
			szam = input.nextInt();		
		} while (!ok);
		return szam;
	}
	static void feltolt(int[] tomb) {
		for (int i=0; i< tomb.length; i++) {
			tomb[i] = (int)(Math.random()*50) +1;
		}		
	}
	
	static void kiir(int[] tomb) {
		for(int elem : tomb) {
			System.out.println(elem + "\t");
		}
		// Megfelel:
		/*
		for (int i=0; i<tomb.length; i++) {
			System.out.println(tomb[i] + "\t");
		}
		*/
		System.out.println();
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tombmeret = beolvasEgesz();
		if (tombmeret < 1) {
			System.out.println("Hibás tömbméret");
			return;		
		}
		int[] tomb = new int[tombmeret];
		feltolt(tomb);
		kiir(tomb);
		
		

	}

}
