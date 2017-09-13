import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class Pelota {

	private int radio,x,y; 
	private Color kolo;
	private Random randy;
	
	public Pelota(){ 
		randy = new Random(System.currentTimeMillis());
		radio = 10;
		x = (randy.nextInt(400));
		y = (randy.nextInt(400));
		kolo = Color.BLACK;
	
		
	}

	public int getRadio() {
		return radio;
	}

	public void setRadio(int radio) {
		this.radio = radio;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public Color getKolo() {
		return kolo;
	}

	public void setKolo(Color kolo) {
		this.kolo = kolo;
	}
	
	
	public void paint(Graphics g){
		g.setColor(kolo);
		g.drawOval(x, y, radio, radio);
		
		
		
	}
	
	
	
	
	
}
