// This applet displays a message moving horizontally
// across the screen.

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BouncingBall extends JApplet
		implements ActionListener
{
	private int xPos, yPos;  // hold the coordinates of the banner
	private int xDir, yDir;

	//------------Additional Code-----------//
	private Image offScreenImage;
	//--------------------------------------//

	public void init()
	{
		Container c = getContentPane();
		c.setBackground(Color.WHITE);
		xPos = c.getWidth();
		yPos = c.getHeight() / 2;
		xDir = 1;
		yDir = 1;
		Timer clock = new Timer(30, this);  // fires every 30 milliseconds
		clock.start();
	}

	//-------------Changes------------------//
	public void paint(Graphics g){
		//if the offScreenImage object has not been created yet, create it now.
		//if the window has been resized, a new offScreenImage must be created
		//to match the new dimensions.
		if (offScreenImage == null || offScreenImage.getWidth(null) != getWidth() || offScreenImage.getHeight(null) != getHeight()){
			offScreenImage = createImage(getWidth(), getHeight());
		}

		//create a new Graphics object and call the paintOffScreenImage() method on it
		Graphics offScreenGraphics = offScreenImage.getGraphics();
		paintOffscreenImage(offScreenGraphics);

		//draw the offScreenImage object to the screen
		g.drawImage(offScreenImage, 0, 0, null);
	}

	// paints the offScreenImage so that it can be drawn to the screen later
	private void paintOffscreenImage(Graphics g)
	{
		super.paint(g);
		g.fillOval(xPos-10, yPos-10, 20, 20);
	}
	//---------------End changes-------------//


	// Called automatically when the timer fires
	public void actionPerformed(ActionEvent e)
	{
		Container c = getContentPane();

		xPos += 6*xDir;
		if(xPos > c.getWidth() || xPos < 0)
			xDir *= -1;
		yPos += 5*yDir;
		if(yPos > c.getHeight() || yPos < 0)
			yDir *= -1;

		repaint();
	}
}
