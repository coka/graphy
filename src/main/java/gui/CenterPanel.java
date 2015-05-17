package gui;

import javax.swing.*;

public class CenterPanel extends JDesktopPane
{
  private static int diagramCount = 0;
  private int xOffset = 24, yOffset = 24;

  public CenterPanel()
  {
    super();
    for (int i = 0; i < 5; i++)
    {
      Diagram diagram = this.create_diagram();
      this.add(diagram);
      diagram.moveToFront();
    }
  }

  private Diagram create_diagram()
  {
    Diagram diagram = new Diagram(diagramCount * xOffset, diagramCount * yOffset);
    this.diagramCount++;
    return diagram;
  }
}
