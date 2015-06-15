package views;

import java.util.*;
import java.awt.*;
import javax.swing.*;

import shapes.*;
import helpers.*;

public class GraphicsView extends JComponent
{
  private ArrayList<AbstractShape> shapes = new ArrayList<AbstractShape>();

  public GraphicsView() { super(); }

  @Override
  public void paint(Graphics g)
  {
    Graphics2D g2 = (Graphics2D)g;

    for (int i = 0; i < this.shapes.size(); i++)
    {
      this.shapes.get(i).draw(g2);
    }
  }

  public void add_shape(AbstractShape shape)
  {
    this.shapes.add(shape);
    this.repaint();
  }
}
