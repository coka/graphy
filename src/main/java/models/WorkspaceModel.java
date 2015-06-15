package models;

import java.awt.*;
import javax.swing.*;

public class WorkspaceModel
{
  private static int diagramCount = 0;
  private int xOffset = 24, yOffset = 24;
  private int xAbout = 40, yAbout = 40;

  public int get_xOffset() { return this.xOffset; }
  public int get_yOffset() { return this.yOffset; }
  public static int get_diagramCount() { return diagramCount; }

  public void increment_diagramCount() { diagramCount++; }
}
