package myproduct.proba;

import myproduct.Aru;
import myproduct.Kenyer;

public class AruProba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aru aru = new Aru("Kifli", 30, 27);
		Kenyer kenyer = new Kenyer("Félbarna", 200, 27, 0.75);
		Kenyer kenyer1 = new Kenyer("Barna", 300, 27, 0.5);
		System.out.println(aru);
		System.out.println(kenyer);
		System.out.println(kenyer1);
		System.out.println(kenyer.dragabb(kenyer1));	
	}
}
