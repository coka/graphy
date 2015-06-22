package models;

import java.util.*;

import controllers.*;

public class WorkspaceModel
{
  private ArrayList<DocumentController> documents = new ArrayList<DocumentController>();
  private static int diagramCount = 0;
  private int xAbout = 40, yAbout = 40;

  public ArrayList<DocumentController> get_documents() { return this.documents; }
  public int get_xOffset() { return 24; }
  public int get_yOffset() { return 24; }
  public static int get_diagramCount() { return diagramCount; }

  public void increment_diagramCount() { diagramCount++; }
}
