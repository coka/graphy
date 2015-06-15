package controllers;

import javax.swing.*;

import models.*;
import controllers.*;
import views.*;

public class WorkspaceController
{
  private WorkspaceModel model;
  private WorkspaceView view;

  public WorkspaceController(WorkspaceModel model, WorkspaceView view)
  {
    this.model = model;
    this.view = view;
  }

  public void create_diagram()
  {
    int xOffset = this.model.get_xOffset();
    int yOffset = this.model.get_yOffset();
    int diagramCount = this.model.get_diagramCount();
    DocumentController document = new DocumentController(new DocumentView(diagramCount * xOffset, diagramCount * yOffset));
    DocumentView diagram = document.get_view();
    this.view.add(diagram);
    this.view.moveToFront(diagram);
    this.view.setSelectedFrame(diagram);
    this.model.increment_diagramCount();
  }

  public void cascade_diagrams()
  {
    JInternalFrame[] frames = this.view.getAllFrames();
    int numberOfFrames = frames.length;
    for (int i = 0; i < numberOfFrames; i++)
    {
      frames[i].setSize(400, 400);
      frames[i].setLocation(i * this.model.get_xOffset(), i * this.model.get_yOffset());
    }
  }
}
