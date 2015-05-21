package gui;

import java.util.ArrayList;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.*;

public class CenterPanel extends JDesktopPane
{
  private static int diagramCount = 0;
  private int xOffset = 24, yOffset = 24;

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

  public void create_diagram()
  {
    Diagram diagram = new Diagram(diagramCount * xOffset, diagramCount * yOffset);
    this.add(diagram);
    this.moveToFront(diagram);
    this.diagramCount++;
  }
}
