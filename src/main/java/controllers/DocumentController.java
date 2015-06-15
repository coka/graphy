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
          RectangleShape rectangle = new RectangleShape(new Vec2f(e.getX()-50, e.getY()-50), Color.BLACK, Color.GREEN, 100.0f);
          view.get_context().add_shape(rectangle);
        }
        else if (stateManager.get_currentState() instanceof OutlineRectangleState)
        {
        	RectangleShape outlineRectangle = new RectangleShape(new Vec2f(e.getX()-50, e.getY()-50), 100.0f);
            view.get_context().add_shape(outlineRectangle);
        }
        else if (stateManager.get_currentState() instanceof TriangleState)
        {
        	TriangleShape triangle = new TriangleShape(new Vec2f(e.getX()-50, e.getY()-50), Color.BLACK, Color.GREEN, 100.0f);
            view.get_context().add_shape(triangle);
        }
        else if (stateManager.get_currentState() instanceof OutlineTriangleState)
        {
        	TriangleShape outlineTriangle = new TriangleShape(new Vec2f(e.getX()-50, e.getY()-50), 100.0f);
            view.get_context().add_shape(outlineTriangle);
        }
        else if (stateManager.get_currentState() instanceof StarState)
        {
        	StarShape star = new StarShape(new Vec2f(e.getX()-50, e.getY()-50), Color.BLACK, Color.GREEN, 100.0f);
            view.get_context().add_shape(star);
        }        
        else if (stateManager.get_currentState() instanceof OutlineStarState)
        {
        	StarShape outlineStar = new StarShape(new Vec2f(e.getX()-50, e.getY()-50), 100.0f);
            view.get_context().add_shape(outlineStar);
        }
        else if (stateManager.get_currentState() instanceof HexagonState)
        {
        	HexagonShape hexagon = new HexagonShape(new Vec2f(e.getX()-50, e.getY()-50), Color.BLACK, Color.GREEN, 100.0f);
            view.get_context().add_shape(hexagon);
        }   
        else if (stateManager.get_currentState() instanceof OutlineHexagonState)
        {
        	HexagonShape outlineHexagon = new HexagonShape(new Vec2f(e.getX()-50, e.getY()-50), 100.0f);
            view.get_context().add_shape(outlineHexagon);
        }
      }
    });
  }

  public DocumentView get_view() { return this.view; }

  public void set_rectangleState() { this.stateManager.set_rectangleState(); }
  public void set_triangleState() { this.stateManager.set_triangleState(); }
  public void set_starState() { this.stateManager.set_starState(); }
  public void set_hexagonState() { this.stateManager.set_hexagonState(); }
  
  public void set_outlineRectangleState() { this.stateManager.set_outlineRectangleState(); }
  public void set_outlineTriangleState() { this.stateManager.set_outlineTriangleState(); }
  public void set_outlineStarState() { this.stateManager.set_outlineStarState(); }
  public void set_outlineHexagonState() { this.stateManager.set_outlineHexagonState(); }
}
