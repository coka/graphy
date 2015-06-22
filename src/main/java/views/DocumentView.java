package views;

import java.awt.*;
import javax.swing.*;

public class DocumentView extends JInternalFrame
{
  private GraphicsView context = new GraphicsView();

  public DocumentView()
  {
    super("Graphic Window", true, true, true, true);
    this.setSize(400, 400);
    this.add(this.context);
    this.setVisible(true);

    JScrollBar sbHorizontal = new JScrollBar(JScrollBar.HORIZONTAL, 140, 20, 0, 300);
    JScrollBar sbVertical   = new JScrollBar(JScrollBar.VERTICAL  , 140, 20, 0, 300);

    this.add(sbHorizontal, BorderLayout.SOUTH);
    this.add(sbVertical  , BorderLayout.EAST );

  }

  public GraphicsView get_context() { return this.context; }
}
