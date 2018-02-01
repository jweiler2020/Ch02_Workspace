// Question 2-13-a

import java.awt.*;
import javax.swing.*;

/**
 *  This program displays a red cross on a white
 *  background.
 */

public class RedOval extends JPanel
{
  public void paintComponent(Graphics g)
  {
    super.paintComponent(g);  // Call JPanel's paintComponent method
                              //   to paint the background
    int xCenter = getWidth() / 2;
    int yCenter = getHeight() / 2;
    g.setColor(Color.RED);
    g.fillOval(xCenter - 20, yCenter - 20, 40, 40);
    g.setColor(Color.WHITE);
    g.fillOval(xCenter - 10, yCenter - 10, 20, 20);
    g.setColor(Color.RED);
    g.fillOval(xCenter - 5, yCenter - 5, 10, 10);
  }

  public static void main(String[] args)
  {
    JFrame window = new JFrame("Red Cross");
    window.setBounds(300, 300, 200, 200);
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    RedOval panel = new RedOval();
    panel.setBackground(Color.WHITE);
    Container c = window.getContentPane();
    c.add(panel);
    window.setVisible(true);
  }
}

