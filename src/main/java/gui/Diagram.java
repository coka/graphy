package gui;

import javax.swing.JInternalFrame;

import views.*;

public class Diagram extends JInternalFrame
{
  public Diagram(int x, int y)
  {
    super("Graphic Window", true, true, true, true);
    this.setLocation(x, y);
    this.setSize(400, 400);
    this.add(new GraphicsView());
    this.setVisible(true);
  }
}
