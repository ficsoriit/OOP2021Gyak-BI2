package szinesek.pont;

import java.awt.Color;

import szinesek.Szinezheto;

public class SzinesPont extends Pont implements Szinezheto {
	private Color color;

	public SzinesPont(int x, int y, Color color) {
		super(x, y);
		this.color = color;
	}
	
	public SzinesPont(Color color) {
		this(0, 0, color);
	}
	
	public SzinesPont() {
		// TODO Auto-generated constructor stub
		this(0, 0, SzinesPont.defaultSzin);
	}

	@Override
	public String toString() {
		return "SzinesPont [color=" + color + ", toString()=" + super.toString() + "]";
	}

	@Override
	public Color getColor() {
		// TODO Auto-generated method stub
		return color;
	}

	@Override
	public void setColor(Color color) {
		// TODO Auto-generated method stub
		this.color = color;
	}
	
	

}
