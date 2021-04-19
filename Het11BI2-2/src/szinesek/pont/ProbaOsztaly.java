package szinesek.pont;

import java.awt.Color;

import szinesek.Szinezheto;

public class ProbaOsztaly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Szinezheto egyPont = new SzinesPont();
		System.out.println(egyPont);
		
		egyPont.setColor(Color.BLACK);
		System.out.println(egyPont);

		Szinezheto.setDefaultSzin(egyPont);
		System.out.println(egyPont);
	}

}
