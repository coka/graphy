package gui;

import javax.swing.JInternalFrame;

public class Diagram extends JInternalFrame
{
  public Diagram(int x, int y)
  {
    super("Graphic Window", true, true, true, true);
    this.setLocation(x, y);
    this.setSize(400, 400);
    this.setVisible(true);
  }
}
