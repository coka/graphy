package controllers;

import java.awt.*;
import java.awt.event.*;

import models.*;
import views.*;
import states.*;
import shapes.*;
import helpers.*;

public class DocumentController
{
  private DocumentView view;
  private DocumentModel model;
  private DocumentStateManager stateManager = new DocumentStateManager(this);

  public DocumentController(DocumentModel model, DocumentView view)
  {
    this.model = model;
    this.view = view;
    this.add_listeners();
  }

  public void add_listeners()
  {
    this.view.get_context().addMouseListener(new MouseAdapter() {
      @Override
      public void mouseClicked(MouseEvent e)
      {
        if (e.getButton() == MouseEvent.BUTTON1)
        {
          stateManager.get_currentState().mouse_pressed(e);
        }
      }
    });
    this.view.get_context().addMouseMotionListener(new MouseMotionAdapter() {
      @Override
      public void mouseDragged(MouseEvent e)
      {
         stateManager.get_currentState().mouse_dragged(e);
      }
      @Override
      public void mouseMoved(MouseEvent e)
      {
         stateManager.get_currentState().mouse_moved(e);
      }
    });
  }

  public DocumentModel get_model() { return this.model; }
  public DocumentView get_view() { return this.view; }

  public void set_rectangleState() { this.stateManager.set_rectangleState(); }
  public void set_triangleState() { this.stateManager.set_triangleState(); }
  public void set_starState() { this.stateManager.set_starState(); }
  public void set_hexagonState() { this.stateManager.set_hexagonState(); }

  public void set_outlineRectangleState() { this.stateManager.set_outlineRectangleState(); }
  public void set_outlineTriangleState() { this.stateManager.set_outlineTriangleState(); }
  public void set_outlineStarState() { this.stateManager.set_outlineStarState(); }
  public void set_outlineHexagonState() { this.stateManager.set_outlineHexagonState(); }

  public void set_selectState() { this.stateManager.set_selectState(); }
}
