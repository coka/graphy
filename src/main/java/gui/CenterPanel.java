package gui;

import graphy.about.GraphyAbout;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;

public class CenterPanel extends JDesktopPane
{
  private static final Frame CenterPanel = null;
private static int diagramCount = 0;
  private int xOffset = 24, yOffset = 24;
  private int xAbout = 40, yAbout = 40;

  ImageIcon icon = new ImageIcon("images/Background.jpg");
  Image image = icon.getImage();

  Image newimage = image;

  @Override
  protected void paintComponent(Graphics g)
  {
      super.paintComponent(g);
      g.drawImage(newimage, 0, 0, getWidth(), getHeight(), this);
  }

  public CenterPanel()
  {
    super();
  }
  
  public void create_about()
  {
	  GraphyAbout graphyAbout = new GraphyAbout(CenterPanel, true);
	  this.add(graphyAbout);	  
	  this.moveToFront(graphyAbout);		  
  }

  public void create_diagram()
  {
    Diagram diagram = new Diagram(diagramCount * xOffset, diagramCount * yOffset);
    this.add(diagram);
    this.moveToFront(diagram);
    this.diagramCount++;
  }

  public void cascade_diagrams()
  {
    JInternalFrame[] frames = this.getAllFrames();
    int numberOfFrames = frames.length;
    for (int i = 0; i < numberOfFrames; i++)
    {
      frames[i].setSize(400, 400);
      frames[i].setLocation(i * xOffset, i * yOffset);
    }
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
