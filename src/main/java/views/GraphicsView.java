package views;

import java.awt.*;
import javax.swing.*;

import shapes.*;
import helpers.*;

public class GraphicsView extends JComponent
{
  public GraphicsView() { super(); }

  public void paint(Graphics g)
  {
    Graphics2D g2 = (Graphics2D)g;

    RectangleShape shape = new RectangleShape(new Vec2f(), Color.RED, Color.GREEN, 100.0f);
    shape.draw(g2);
    
    TriangleShape triangle = new TriangleShape(new Vec2f(), Color.BLACK, Color.WHITE, 90.0f);
    triangle.draw(g2);
    
    StarShape star = new StarShape(new Vec2f(), Color.YELLOW, Color.BLACK, 80.0f);
    star.draw(g2);
  }
}
