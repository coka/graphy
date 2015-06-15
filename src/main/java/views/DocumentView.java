package views;

import java.awt.BorderLayout;

import javax.swing.JInternalFrame;
import javax.swing.JScrollBar;

public class DocumentView extends JInternalFrame
{
	private JScrollBar sbVertical;
	private JScrollBar sbHorizontal;
	
	private int hScrollValue=140;
	private int vScrollValue=140;
	
  public DocumentView(int x, int y)
  {
    super("Graphic Window", true, true, true, true);
    this.setLocation(x, y);
    this.setSize(400, 400);
    this.add(new GraphicsView());
    this.setVisible(true);
    
    sbHorizontal=new JScrollBar(JScrollBar.HORIZONTAL, 140, 20, 0, 300);
	sbVertical=new JScrollBar(JScrollBar.VERTICAL, 140, 20, 0, 300);
	
	this.add(sbHorizontal,BorderLayout.SOUTH);
	this.add(sbVertical,BorderLayout.EAST);
    
  }
}
