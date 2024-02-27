//Kirsten Fragante and Safiyah Fatima
package game;

import java.awt.Graphics;

public class Bee extends Polygon {
	boolean forward, back, up, down;
	int stepSize = 1;

	public Bee(Point[] inShape, Point inPosition, double inRotation) {
		super(inShape, inPosition, inRotation);
	}
	
	public void paint(Graphics brush) {
		int[] xPoints = new int[getPoints().length];
		int[] yPoints = new int[getPoints().length];
		
		for (int i = 0; i < getPoints().length; i++) {
			xPoints[i] = (int) getPoints()[i].x;
			yPoints[i] = (int) getPoints()[i].y;
		}
		
		brush.fillPolygon(xPoints, yPoints, getPoints().length);
	}
	
	public void move() {
		if (up) {
			position.y += stepSize;
		}
		
		if (down) {
			position.y -= stepSize;
		}
		
		if (forward) {
			position.x += stepSize;
		}
		
		if (down) {
			position.x -= stepSize;
		}
	}
	
}
