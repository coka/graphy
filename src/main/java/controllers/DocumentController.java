package controllers;

import java.awt.*;
import java.awt.event.*;

import views.*;
import shapes.*;
import helpers.*;

public class DocumentController
{
  private DocumentView view;

  public DocumentController(DocumentView view)
  {
    this.view = view;
    this.add_listeners();
  }

  public void add_listeners()
  {
    this.view.get_context().addMouseListener(new MouseAdapter() {
      @Override
      public void mouseClicked(MouseEvent e)
      {
        view.get_context().add_shape(new RectangleShape(new Vec2f(e.getX(), e.getY()), Color.RED, Color.GREEN, 100.0f));
      }
    });
  }

  public DocumentView get_view() { return this.view; }
}
