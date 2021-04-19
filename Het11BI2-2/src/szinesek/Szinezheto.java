package szinesek;

import java.awt.Color;

public interface Szinezheto {
	java.awt.Color defaultSzin = Color.RED;
	Color getColor();
	void setColor(Color color);
	
	static void setDefaultSzin(Szinezheto o) {
		o.setColor(defaultSzin);
	}
}
