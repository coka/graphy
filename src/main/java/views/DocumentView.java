package views;

import javax.swing.JInternalFrame;

public class DocumentView extends JInternalFrame
{
  private GraphicsView context = new GraphicsView();

  public DocumentView(int x, int y)
  {
    super("Graphic Window", true, true, true, true);
    this.setLocation(x, y);
    this.setSize(400, 400);
    this.add(this.context);
    this.setVisible(true);
  }

  public GraphicsView get_context() { return this.context; }
}
