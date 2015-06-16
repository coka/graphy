package views;

import java.awt.BorderLayout;
import java.awt.event.InputEvent;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

import javax.swing.JInternalFrame;
import javax.swing.JScrollBar;

public class DocumentView extends JInternalFrame
{
  private JScrollBar sbVertical;
  private JScrollBar sbHorizontal;

  private int hScrollValue=140;
  private int vScrollValue=140; 

  private GraphicsView context = new GraphicsView();

  public DocumentView()
  {
    super("Graphic Window", true, true, true, true);
    this.setSize(400, 400);
    this.add(this.context);
    this.setVisible(true);

    sbHorizontal=new JScrollBar(JScrollBar.HORIZONTAL, 140, 20, 0, 300);
    sbVertical=new JScrollBar(JScrollBar.VERTICAL, 140, 20, 0, 300);

    this.add(sbHorizontal,BorderLayout.SOUTH);
    this.add(sbVertical,BorderLayout.EAST);
    
  }

  public GraphicsView get_context() { return this.context; }
}
