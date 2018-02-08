import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DoubleBuffer extends JApplet
		implements ActionListener
{
	private Image offScreenImg;

	public void init()
	{
		Container c = getContentPane();
		c.setBackground(Color.WHITE);

		Timer clock = new Timer(1, this);
		clock.start();
	}

	public void paint(Graphics g)
	{
		if(offScreenImg == null || offScreenImg.getWidth(null) != getWidth() || offScreenImg.getHeight(null) != getHeight())
			offScreenImg = createImage(getWidth(), getHeight());

		Graphics imgG = offScreenImg.getGraphics();
		super.paint(imgG);
		draw(imgG);

		g.drawImage(offScreenImg, 0, 0, null);
	}

	private void draw(Graphics g)
	{
		// Drawing stuff goes here
	}

	public void actionPerformed(ActionEvent e)
	{
		// Logic goes here

		repaint();
	}
}
