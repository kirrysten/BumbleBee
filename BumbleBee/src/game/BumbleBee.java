//Kirsten Fragante and Safiyah Fatima
package game;

/*
CLASS: YourGameNameoids
DESCRIPTION: Extending Game, YourGameName is all in the paint method.
NOTE: This class is the metaphorical "main method" of your program,
      it is your control center.

*/
import java.awt.*;
import java.awt.event.*;

class BumbleBee extends Game {
	static int counter = 0;
	Bee bee;

  public BumbleBee() {
    super("YourGameName!",800,600);
    this.setFocusable(true);
	this.requestFocus();
	
	Point[] beeShape = {new Point(95,295), new Point (95,305), new Point (110,305),
			new Point(110,295)};
	Bee bee = new Bee(beeShape, new Point(100,300), 0);
	this.bee = bee;
  }
  
	public void paint(Graphics brush) {
    	brush.setColor(Color.black);
    	brush.fillRect(0,0,width,height);
    	
    	// sample code for printing message for debugging
    	// counter is incremented and this message printed
    	// each time the canvas is repainted
    	counter++;
    	brush.setColor(Color.white);
    	brush.drawString("Counter is " + counter,10,10);
    	bee.move();
    	bee.paint(brush);
  }
  
	public static void main (String[] args) {
   		BumbleBee a = new BumbleBee();
		a.repaint();
  }
}