package views;

import graphy.extra.windows.DiagramRename;
import graphy.extra.windows.GraphyAbout;

import java.awt.*;
import javax.swing.*;

public class WorkspaceView extends JDesktopPane
{
  private static final Frame CenterPanel = null;
  @Override
  protected void paintComponent(Graphics g)
  {
      super.paintComponent(g);
      ImageIcon icon = new ImageIcon("images/Background.jpg");
      Image image = icon.getImage();
      Image newimage = image;
      g.drawImage(newimage, 0, 0, getWidth(), getHeight(), this);
  }

  public WorkspaceView() { super(); }
  
  public void create_about()
  {
	  GraphyAbout graphyAbout = new GraphyAbout(CenterPanel, true);
	  this.add(graphyAbout);	  
	  this.moveToFront(graphyAbout);		  
  }
  
  public void rename_diagram()
  {
	  DiagramRename diagramRename = new DiagramRename(CenterPanel, true);
	  this.add(diagramRename);	  
	  this.moveToFront(diagramRename);		  
  }

  public void tile_diagrams_vertically()
  {
    JInternalFrame[] frames = this.getAllFrames();
    int numberOfFrames = frames.length;
    Dimension panelSize = this.getSize();
    for (int i = 0; i < numberOfFrames; i++)
    {
      frames[i].setSize(panelSize.width / numberOfFrames, panelSize.height);
      frames[i].setLocation(frames[i].getWidth() * i, 0);
    }
  }

  public void tile_diagrams_horizontally()
  {
    JInternalFrame[] frames = this.getAllFrames();
    int numberOfFrames = frames.length;
    Dimension panelSize = this.getSize();
    for (int i = 0; i < numberOfFrames; i++)
    {
      frames[i].setSize(panelSize.width, panelSize.height / numberOfFrames);
      frames[i].setLocation(0, frames[i].getHeight() * i);
    }
  }
}
