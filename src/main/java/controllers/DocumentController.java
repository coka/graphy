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
        if (stateManager.get_currentState() instanceof RectangleState)
        {
          RectangleShape rectangle = new RectangleShape(new Vec2f(e.getX(), e.getY()), Color.RED, Color.GREEN, 100.0f);
          view.get_context().add_shape(rectangle);
        }
      }
    });
  }

  public DocumentView get_view() { return this.view; }

  public void set_rectangleState() { this.stateManager.set_rectangleState(); }
}
