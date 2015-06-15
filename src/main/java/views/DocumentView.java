package views;

import javax.swing.JInternalFrame;

public class DocumentView extends JInternalFrame
{
  public DocumentView(int x, int y)
  {
    super("Graphic Window", true, true, true, true);
    this.setLocation(x, y);
    this.setSize(400, 400);
    this.add(new GraphicsView());
    this.setVisible(true);
  }
}
