package controllers;

import javax.swing.*;

import models.*;
import controllers.*;
import views.*;

public class WorkspaceController
{
  private WorkspaceModel model;
  private WorkspaceView view;

  private int activeIndex;

  public WorkspaceController(WorkspaceModel model, WorkspaceView view)
  {
    this.model = model;
    this.view = view;
  }

  public WorkspaceModel get_model() { return this.model; }
  public WorkspaceView get_view() { return this.view; }

  public void create_diagram()
  {
    int offset = 24 * this.model.get_documents().size();
    DocumentController document = new DocumentController(new DocumentModel(), new DocumentView());
    document.get_view().setLocation(offset, offset);
    this.model.get_documents().add(document);
    this.activeIndex = this.model.get_documents().size() - 1;
    DocumentView newView = this.model.get_documents().get(activeIndex).get_view();
    this.view.add(newView);
    this.view.moveToFront(newView);
    this.view.setSelectedFrame(newView);
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
